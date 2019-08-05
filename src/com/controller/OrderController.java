package com.controller;

import com.model.index.Com;
import com.model.order.Order;
import org.springframework.ui.Model;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 订单控制器
 */
@Controller
@RequestMapping("order")
public class OrderController {

    /**
     * 默认页面
     */
    @RequestMapping("index")
    public String Index(Model model, HttpSession session){
        if(session.getAttribute("uid") == null){
            return "redirect:../user/login";
        }
        else{
            Com com = new Com();
            Object gid = session.getAttribute("gid");
            Order order = new Order();
            String oid = com.NID();
            String time = com.Time();
            order.Add(gid, oid, "buyer", "seller", time);
            model.addAttribute("title", "生成订单");
            return "order/index";
        }
    }
}
