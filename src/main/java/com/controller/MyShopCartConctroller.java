package com.controller;

import com.service.MyShopCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Fuxi on 2017/5/6.
 */
@Controller
@RequestMapping("/myshopcart")
public class MyShopCartConctroller {
    @Autowired
    MyShopCartService myShopCartService;
    int userId = 1;

    //获得购物车信息
    @RequestMapping("/showMyShopCart")
    public String getMyShopCartById(Model model){
        model.addAttribute("myShopCart",myShopCartService.getMyShopCartById(userId));
        return "myShopCart";
    }

    //加入购物车
    @RequestMapping("/addToCart")
    @ResponseBody
    public String addLight(int lightId,int quantity){
        return this.addLightToCart(lightId,quantity);
    }

    //加入购物车的方法
    public String addLightToCart(int lightId,int quantity){
        int quantity2 = myShopCartService.getQuantity(lightId);
        if(quantity <= quantity2){
            myShopCartService.addLight(userId,lightId,quantity);
            return "success";
        }else return String.valueOf(quantity2);
    }

    //获取最新库存
    @RequestMapping("/getQuantity")
    @ResponseBody
    public int getQuantity(int lightId){
        int quantity = myShopCartService.getQuantity(lightId);
        return quantity;
    }

    //修改数量
    @RequestMapping("/changeQuantity")
    @ResponseBody
    public String updateQuantity(int lightId,int quantity1,int quantity2){
        return this.addLightToCart(lightId,quantity1-quantity2);
    }

    //删除商品
    @RequestMapping("/deleteLightFromCart")
    @ResponseBody
    public String deleteLightById(int lightId){
        myShopCartService.deleteLightById(userId,lightId);
        return "success";
    }
}
