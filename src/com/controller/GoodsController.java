package com.controller;

import com.model.goods.Goods;
import org.springframework.ui.Model;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

/**
 * 商品控制器
 */
@Controller
@RequestMapping("goods")
public class GoodsController {

    /**
     * 商品页面
     */
    @RequestMapping("index")
    public String Index(){
        return "goods/index";
    }

    /**
     * 商品列表
     */
    @RequestMapping("list")
    public String List(Model model){
        model.addAttribute("title", "商品列表");
        return "goods/list";
    }

    /**
     * 商品详情
     */
    @RequestMapping("detail")
    public String Detail(Model model, HttpSession session, HttpServletRequest request){
        model.addAttribute("title", "商品详情");        //页面标题
        if(request.getParameter("gid") == null){
            return "goods/error";
        }
        else{
            session.setAttribute("gid", request.getParameter("gid"));
            return "goods/detail";
        }
    }

    /**
     * 商品管理
     */
    @RequestMapping("manager")
    public String Manager(HttpSession session, Model model){
        model.addAttribute("title", "商品管理");
        if(session.getAttribute("uid") == null){
            return "redirect:../user/login";
        }
        else{
            if(session.getAttribute("sid") == null){
                return "redirect:../store/apply";
            }
            else{
                model.addAttribute("gid", "123456");
                Goods goods = new Goods();
                String sid = (String)session.getAttribute("sid");
                ArrayList list = (ArrayList)goods.All((sid));
                model.addAttribute("list", list);
                return "goods/manager";
            }
        }
    }

    /**
     * 添加商品
     */
    @RequestMapping("add")
    public String Add(String title, String about, String price, HttpSession session, Model model){
        model.addAttribute("title", "添加商品");
        if(session.getAttribute("uid") == null){
            return "redirect:../user/login";
        }
        else{
            if(session.getAttribute("sid") == null){
                return "redirect:store/apply";
            }
            else{
                if(title == null || "".equals(title) || about == null || "".equals(about)){
                    return "goods/add";
                }
                else{
                    String uid = (String)session.getAttribute("uid");
                    String sid = (String)session.getAttribute("sid");
                    Goods goods = new Goods();
                    if(goods.Add(uid, sid, title, about, price) == true){
                        model.addAttribute("msg", "添加成功");
                        return "goods/add";
                    }
                    else{
                        model.addAttribute("msg", "添加失败");
                        return "goods/add";
                    }
                }
            }
        }
    }

    /**
     * 删除商品
     */
    @RequestMapping("del")
    public String Del(String gid, Model model, HttpSession session){
        model.addAttribute("title", "删除商品");
        if(session.getAttribute("uid") == null){
            return "redirect:../user/login";
        }
        else{
            if(session.getAttribute("sid") == null){
                return "redirect:store/apply";
            }
            else{
                if(gid == null || "".equals(gid)){
                    return "redirect:goods/manager";
                }
                else{
                    Goods goods = new Goods();
                    boolean r = goods.Del(gid);
                    if(r == true){
                        model.addAttribute("msg", "删除成功");
                        return "redirect:goods/manager";
                    }
                    else{
                        model.addAttribute("msg", "删除失败");
                        return "redirect:goods/manager";
                    }
                }
            }
        }
    }

    /**
     * 商品不存在
     */
    @RequestMapping("error")
    public String Error(Model model){
        model.addAttribute("title", "商品不存在");
        return "goods/error";
    }
}
