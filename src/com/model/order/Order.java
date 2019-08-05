package com.model.order;

import com.model.index.Db;

/**
 * 订单系统
 */
public class Order {

    /**
     * 创建订单
     */
    public boolean Add(Object gid, String oid, String buyer, String seller, String time){
        Db db = new Db();
        String [] key = {"gid", "oid", "buyer", "seller", "time"};
        String [] val = {(String)gid, oid, buyer, seller, time};
        db.Insert("order", key, val);
        return false;
    }
}
