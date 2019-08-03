package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 购物车控制器
 */
@Controller
@RequestMapping("cart")
public class CartController {

    /**
     * 默认页面
     */
    @RequestMapping("index")
    public String Index(Model model){
        model.addAttribute("title", "购物车");
        return "cart/index";
    }
}
