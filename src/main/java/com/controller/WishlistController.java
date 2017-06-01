package com.controller;

import com.entity.Wishlist;
import com.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Wishlist")
public class WishlistController {
    @Autowired
    WishlistService wishlistService;
    int userId=1;
    //获取收藏夹信息
    @RequestMapping("/WishlistInfo")
    public String getWishlistById(Model model){
        model.addAttribute("wishlist",wishlistService.getWishlist(userId));
        return "Wishlist";
    }
    //删除收藏夹里的商品
    @RequestMapping("/deleteWishlist")
    public String deleteWishlistById(int wishlistId){
        wishlistService.deleteWishlist(wishlistId);
        return "redirect:WishlistInfo";
    }
    public void addWishlist(Wishlist wishlist) {

    }
    public void updateWishlist(int UserId){

    }


}
