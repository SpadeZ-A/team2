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
}
