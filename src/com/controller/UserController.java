package com.controller;

import java.util.ArrayList;
import com.model.user.User;
import org.springframework.ui.Model;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

/**
 * 用户控制器
 */
@Controller
@RequestMapping("user")
public class UserController {

    /**
     * 参数表
     */
    private String Nickname;
    private String Username;
    private String College;
    private String Room;

    /**
     * 构造函数
     */
    public UserController(){
        this.Nickname = "";
        this.Username = "";
        this.College = "";
        this.Room = "";
    }

    /**
     * 用户首页
     */
    @RequestMapping("index")
    public String Index(Model model, HttpSession session){
        if(session.getAttribute("uid") == null){
            return "redirect:login";
        }
        else{
            User user = new User();
            ArrayList list = (ArrayList)user.getUserList();
            model.addAttribute("list", list);
            model.addAttribute("info", session.getAttribute("info"));
            model.addAttribute("uid", session.getAttribute("uid"));
            model.addAttribute("title","用户中心");
            return "user/index";
        }
    }

    /**
     * 用户登录
     */
    @RequestMapping("login")
    public String Login(String username, String password, Model model, HttpSession session){
        if(session.getAttribute("uid") == null){
            try{
                User user = new User(username, password);
                if(user.checkLogin()){
                    this.Nickname = user.getNickname();
                    this.Username = user.getUsername();
                    this.College = user.getCollege();
                    this.Room = user.getRoom();
                    ArrayList<String> info = new ArrayList<>();
                    info.add(this.Nickname);
                    info.add(this.Username);
                    info.add(this.College);
                    info.add(this.Room);
                    session.setAttribute("info", info);
                    session.setAttribute("uid", user.getUid());
                    session.setAttribute("sid", user.getSid());
                    System.out.println("[LOGIN]:" + username);
                    return "redirect:index";
                }
                else{
                    model.addAttribute("title","用户登录");
                    return "user/login";
                }
            }catch (Exception e){
                model.addAttribute("title","用户登录");
                return "user/login";
            }
        }
        else{
            return "redirect:index";
        }
    }

    /**
     * 注销登录
     */
    @RequestMapping("logout")
    public String Logout(SessionStatus sessionStatus, HttpSession session){
        System.out.println("[LOGOUT]:" + this.Username);
        sessionStatus.setComplete();
        session.invalidate();
        return "redirect:index";
    }

    /**
     * 用户注册
     */
    @RequestMapping("register")
    public String Register(String username, String password, String check, Model model, HttpSession session){
        if(username == null || "".equals(username) ||
                password == null || "".equals(password) ||
                check == null ||"".equals(check)
        ){
            model.addAttribute("title","用户注册");
            return "user/register";
        }
        else{
            User user = new User(username, password);
            boolean state = user.checkRegister();
            if(state){
                if (user.Register()) {
                    if(user.checkLogin()){
                        Nickname = user.getNickname();
                        Username = user.getUsername();
                        College = user.getCollege();
                        Room = user.getRoom();
                        ArrayList<String> info = new ArrayList<>();
                        info.add(Nickname);
                        info.add(Username);
                        info.add(College);
                        info.add(Room);
                        session.setAttribute("info", info);
                        session.setAttribute("uid", user.getUid());
                        session.setAttribute("sid", user.getSid());
                        System.out.println("[LOGIN]:" + username);
                        return "redirect:index";
                    }
                    else{
                        model.addAttribute("title","用户登录");
                        return "user/login";
                    }
                }
                else{
                    model.addAttribute("title","用户注册");
                    return "user/register";
                }
            }
            else{
                model.addAttribute("msg","账号已存在");
                return "user/register";
            }
        }
    }
}
