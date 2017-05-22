package com.dao;

import com.entity.Wishlist;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.request.SessionScope;

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
    public  Wishlist getWishlistById(int UserId){
        return (Wishlist)this.getSession().createQuery("from Wishlist where userId=?" ).setParameter(0,UserId).uniqueResult();
    }

    public void addWishlist(Wishlist wishlist){

    }

    public void updateWishlist(int UserId) {

    }
    public void deleteWishlistById(int UserId){

    }
}
