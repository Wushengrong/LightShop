package com.dao;

import com.entity.Wishlist;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;


@Repository
public class WishlistDao {
    @Resource
   private SessionFactory sessionFactory;

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    //获取所有收藏夹
    public List<Wishlist> getWishlist(int userId) {
        return this.getSession().createQuery("from Wishlist where userId=?").setParameter(0,userId).list();
    }
    //获取收藏夹信息
    public  Wishlist getWishlistById(int wishlistId){
        return (Wishlist)this.getSession().createQuery("from Wishlist where wishListId=?" ).setParameter(0,wishlistId).uniqueResult();
    }
    //删除收藏夹里的商品
    public void deleteWishlist(Wishlist wishlist){
        this.getSession().delete(wishlist);
    }

    public void addWishlist(Wishlist wishlist){

    }

    public void updateWishlist(int UserId) {

    }

}
