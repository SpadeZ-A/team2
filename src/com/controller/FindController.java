package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 发现控制器
 */
@Controller
@RequestMapping("find")
public class FindController {

    /**
     * 默认页面
     */
    @RequestMapping("index")
    public String Index(Model model){
        model.addAttribute("title", "发现新品");
        return "find/index";
    }
}
