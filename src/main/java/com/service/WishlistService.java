package com.service;

import com.dao.WishlistDao;
import com.entity.Wishlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Wushengrong on 2017/5/6.
 */
@Service
@Transactional
public class WishlistService {
    @Autowired   WishlistDao wishlistDao;
    //获取所有收藏夹
    public List<Wishlist> getWishlist() {
        return null;
    }
    //获取收藏夹信息
    public  Wishlist getWishlistById(int UserId){
        return wishlistDao.getWishlistById(UserId);
    }

    public void addWishlist(Wishlist wishlist){

    }

    public void updateWishlist(int UserId){

    }
    public void deleteWishlistById(int UserId){

    }
}
