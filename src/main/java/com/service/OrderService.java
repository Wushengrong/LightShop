package com.service;

import com.dao.OrderDAO;
import com.entity.Orders;
import com.entity.Orderstates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Fuxi on 2017/5/13.
 */
@Service
@Transactional
public class OrderService {
    @Autowired
    OrderDAO orderDAO;
    //获取所有订单
    public List<Orders> getOrdersById(int userId,int state){
        return orderDAO.getOrdersById(userId,state);
    }

    //获取订单信息
    public Orders getOrderById(String orderId,int userId){
        return orderDAO.getOrderById(orderId,userId);
    }

    //添加订单
    public void addOrder(Orders orders){
        orderDAO.addOrder(orders);
    }

    //订单中的商品
    public void addOrderLight(String orderId, int myshopcartId){
        orderDAO.addOrderLight(orderId,myshopcartId);
    }

    public List<Orders> ordersList(){
        return orderDAO.ordersList();
    }

    //订单状态list
    public List<Orderstates> orderstatesList(){
        return orderDAO.orderstatesList();
    }

    public void updateOrders(Orders orders){
        orderDAO.updateOrders(orders);
    }
    public void addOrderStates(Orderstates orderstates){
        orderDAO.addOrderStates(orderstates);
    }
    public void deleteOrderStates(Orderstates orderstates){
        orderDAO.deleteOrderStates(orderstates);
    }
    public void updateOrderStates(Orderstates orderstates){
        orderDAO.updateOrderStates(orderstates);
    }
}
