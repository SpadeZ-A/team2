package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 收藏夹控制器
 */
@Controller
@RequestMapping("collect")
public class CollectController {

    /**
     * 默认页面
     */
    @RequestMapping("index")
    public String Index(Model model){
        model.addAttribute("title","收藏夹");
        return "collect/index";
    }
}
