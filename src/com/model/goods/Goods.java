package com.model.goods;

import com.model.index.Com;
import com.model.index.Db;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * 商品类
 */
public class Goods {

    /**
     * 参数表
     */
    private String UID;
    private String Title;
    private Integer Price;

    /**
     * 全部商品
     */
    public List All(String sid){
        List<String> l = new ArrayList<>();
        try{
            Db db = new Db();
            ResultSet rs = db.fetchDesc("goods", "sid", sid);
            while(rs.next()){
                l.add(rs.getString(2));
                l.add(rs.getString(5));
                l.add(rs.getString(6));
                l.add(rs.getString(7));
                l.add(rs.getString(8));
            }
        }catch(Exception e){
            System.out.println("[Goods.All]:Unable to find goods where sid=" + sid + ".");
        }
        return l;
    }

    /**
     * 添加商品
     */
    public boolean Add(String uid, String sid, String title, String about, String price){
        try{
            Com com = new Com();
            String gid = com.UUID();
            String time = com.Time();
            Db db = new Db();
            String [] key = {"gid", "uid", "sid", "title", "about", "price", "time"};
            String [] val = {gid, uid, sid, title, about, price, time};
            db.Insert("goods", key, val);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    /**
     * 删除商品
     */
    public boolean Del(String gid){
        try{
            Db db = new Db();
            int res = db.Delete("goods", "gid", gid);
            if(res == 0){
                return false;
            }
            else{
                return true;
            }
        }
        catch (Exception e){
            return false;
        }
    }
}
