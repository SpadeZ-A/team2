package com.model.index;

import java.sql.*;
import java.util.Arrays;

/**
 * 数据库类
 */
public class Db {

    /**
     * 数据库配置参数
     */
    private final String driver = "org.gjt.mm.mysql.Driver";
    private final String url = "jdbc:mysql://39.105.28.118:3306/team2?autoReconnect=true&amp;failOverReadOnly=false";
    private final String username = "team2";
    private final String password = "team2";

    /**
     * 多数据方法
     * @param table 数据表名
     * @return 返回全部数据
     */
    public ResultSet fetchAll(String table) {
        try{
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = String.format("select * from %s", table);
            PreparedStatement data = conn.prepareStatement(sql);
            return data.executeQuery();
        }catch(Exception e){
            System.out.println("[Db.fetchAll]:Unable to find " + table + " in tables.");
            return null;
        }
    }

    /**
     * 倒序查找-全部
     */
    public ResultSet fetchAllDesc(String table) {
        try{
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = String.format("select * from `%s` order by id desc", table);
            PreparedStatement data = conn.prepareStatement(sql);
            return data.executeQuery();
        }catch(Exception e){
            System.out.println("[Db.fetchAll]:Unable to find " + table + " in tables.");
            return null;
        }
    }

    /**
     * 倒序查找-部分
     */
    public ResultSet fetchDesc(String table, String key, String val) {
        try{
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = String.format("select * from `%s` where %s='%s' order by id desc", table, key, val);
            PreparedStatement data = conn.prepareStatement(sql);
            return data.executeQuery();
        }catch(Exception e){
            System.out.println("[Db.fetchAll]:Unable to find " + table + " in tables.");
            return null;
        }
    }

    /**
     * 单数据 方法
     * @param table 数据表名
     * @param key 字段名
     * @param value 检索值
     * @return 返回单个数据
     */
    public ResultSet fetchOne(String table, String key, String value){
        try{
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = String.format("SELECT * FROM %s WHERE %s = '%s'", table, key, value);
            PreparedStatement data = conn.prepareStatement(sql);
            return data.executeQuery();
        }catch(Exception e){
            System.out.println("[Db.fetchOne]:Unable to find it where " + key + "=" + value + " in " + table);
            return null;
        }
    }

    /**
     * 数据库插入
     * @param table 数据表名
     * @param keys 字段名数组
     * @param values 插入值数组
     */
    public boolean Insert(String table, String[] keys, String[] values){
        try{
            Class.forName(driver);
            StringBuilder key = new StringBuilder(keys[0]);
            StringBuilder val = new StringBuilder("'" + values[0] + "'");
            for(int i=1; i<keys.length; i++){
                key.append(",").append(keys[i]);
                val.append(String.format(",'%s'", values[i]));
            }
            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = String.format("insert into `%s`(%s) value(%s)", table, key.toString(), val.toString());
            PreparedStatement data = conn.prepareStatement(sql);
            data.executeUpdate() ;
            return true;
        }catch(Exception e){
            System.out.printf("[Db.Insert]:Unable to insert into %s with %s and %s%n", table, Arrays.toString(keys), Arrays.toString(values));
            return false;
        }
    }

    /**
     * 数据库更新
     * @param table
     * @param keys
     * @param values
     * @param key
     * @param val
     * @return
     */
    public boolean Update(String table, String [] keys, String [] values, String key, String val){
        try{
            Class.forName(driver);
            StringBuilder value = new StringBuilder(keys[0] + "='" + values[0] + "'");
            for(int i=1; i<keys.length; i++){
                value.append(", ").append(keys[i]).append("='").append(values[i]).append("'");
            }
            value.append(" where ").append(key).append("='").append(val).append("'");
            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = String.format("update %s set %s", table, value.toString());
            PreparedStatement data = conn.prepareStatement(sql);
            data.executeUpdate();
            return true;
        }catch(Exception e){
            System.out.printf("[Db.Update]:Unable to update %s with %s and %s where %s = %s%n", table, Arrays.toString(keys), Arrays.toString(values), key, val);
            return false;
        }
    }

    /**
     * 数据库删除
     */
    public int Delete(String table, String key, String val){
        try{
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = String.format("delete from `%s` where %s='%s'%n", table, key, val);
            PreparedStatement data = conn.prepareStatement(sql);
            return data.executeUpdate();
        }
        catch (Exception e){
            System.out.printf("[Db.Delete]:Unable to delete %s where %s = %s%n", table, key, val);
            return 0;
        }
    }
}
