package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 商务合作
 */
@Controller
@RequestMapping("coop")     //映射到coop控制器下
public class CoopController {

    /**
     * 关于合作
     */
    @RequestMapping("index")
    public String Index(Model model){
        model.addAttribute("title", "关于合作");
        return "coop/index";
    }

    /**
     * 成功案例
     */
    @RequestMapping("case")
    public String Case(Model model){
        model.addAttribute("title", "成功案例");
        return "coop/case";
    }

    /**
     * 发展历程
     */
    @RequestMapping("course")
    public String Course(Model model){
        model.addAttribute("title", "发展历程");
        return "coop/course";
    }
}
