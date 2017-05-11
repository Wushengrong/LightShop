package com.controller;

import com.entity.Wishlist;
import com.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.misc.Contended;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("Wishlist")
public class WishlistController {
    @Autowired
    WishlistService wishlistService;

    @RequestMapping("/show")
    public String show(){
        return "Wishlist";
    }

    //获取所有收藏夹
    public List<Wishlist> getWishlist(){
        return null;
    }

    //获取收藏夹信息
    @RequestMapping("/WishlistInfo")
    public String getWishlistById(Model model){
        int UserId=1;
        Wishlist wishlist=wishlistService.getWishlistById(UserId);
        model.addAttribute("wishlist",wishlist);
        return "Wishlist";
    }

    public void addWishlist(Wishlist wishlist) {

    }
    public void updateWishlist(int UserId){

    }

    public void deleteWishlistById(int UserId){

    }

}
