package com.controller;

import com.entity.Wishlist;
import com.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Wishlist")
public class WishlistController {
    @Autowired
    WishlistService wishlistService;

    @RequestMapping("/show")
    public String show(){
        return "Wishlist";
    }

    //获取所有收藏夹
    public String getWishlist(){
        return "wi";
    }

    //获取收藏夹信息
    @RequestMapping("/WishlistInfo")
    public String getWishlistById(Model model){
        int userId=1;
        model.addAttribute("wishlist",wishlistService.getWishlist(userId));
        return "Wishlist";
    }

    public void addWishlist(Wishlist wishlist) {

    }
    public void updateWishlist(int UserId){

    }

    public void deleteWishlistById(int UserId){

    }

}
