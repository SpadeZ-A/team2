package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 关于我们
 */
@Controller
@RequestMapping("about")
public class AboutController {

    /**
     * 默认页面
     */
    @RequestMapping("index")
    public String Index(Model model){
        model.addAttribute("title", "关于我们");
        return "about/index";
    }

    /**
     * 网站简介
     */
    @RequestMapping("team")
    public String Team(Model model){
        model.addAttribute("title", "团队介绍");
        return "about/team";
    }

    /**
     * 联系方式
     */
    @RequestMapping("contact")
    public String Contact(Model model){
        model.addAttribute("title", "联系方式");
        return "about/contact";
    }

    /**
     * 办公地址
     */
    @RequestMapping("address")
    public String Address(Model model){
        model.addAttribute("title", "办公地址");
        return "about/address";
    }
}
