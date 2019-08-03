<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<jsp:include page="../../public/header.jsp"/>

<style>
    .goods-nav{
        width: 200px;
        margin-top: 10px;
        margin-bottom: 10px;
        background: #ffffff;
        display: inline-block;
    }
    .goods-nav-title{
        font-weight: bold;
        padding: 10px 20px 10px 20px;
        border-bottom: 1px solid #cccccc;
    }
    .goods-nav-list{
        padding: 10px 20px 10px 20px;
        font-size: 14px;
    }

    .goods-data{
        width: 100%;
        margin-top: 10px;
        margin-left: 10px;
        margin-bottom: 10px;
        display: inline-block;
    }
    .goods-data-div{
        background: #ffffff;
    }
    .goods-data-title{
        font-weight: bold;
        padding: 10px 20px 10px 20px;
        border-bottom: 1px solid #cccccc;
    }
    .goods-data-menu{
        padding-left: 20px;
        padding-right: 20px;
        padding-bottom: 20px;
    }
    .goods-data-list{
        font-size: 14px;
        margin-top: 20px;
        padding: 5px;
        border: 1px solid #efefef;
    }
</style>

<div class="head">
    <div class="head-div">
        <div class="logo">
            <a href="../../">
                <img src="../static/img/logo.png" width="200px" title="转转网"/>
            </a>
        </div>
        <div class="search">
            <div class="search-left">
                <input name="search" class="search-input" placeholder="手机 电脑 课本 衣服 鞋"/>
            </div>
            <div class="search-right">
                <input type="submit" class="search-button" value="搜索"/>
            </div>
        </div>
    </div>
</div>

<div class="body">
    <div class="body-div" style="text-align: left; display: flex;">
        <!-- 左侧导航栏 -->
        <div class="goods-nav">
            <div class="goods-nav-title">商品管理</div>
            <div class="goods-nav-list"><a href="manager">全部商品</a></div>
            <div class="goods-nav-list"><a href="add">添加商品</a></div>
            <div class="goods-nav-list">商品下架</div>
        </div>
        <!-- 数据信息 -->
        <div class="goods-data">
            <div class="goods-data-div">
                <div class="goods-data-title">正在出售</div>
                <div class="goods-data-menu">
                    <%
                        ArrayList list = (ArrayList)request.getAttribute("list");
                        for (int i=0; i<list.size(); i++){
                            if(i % 5 == 0){
                                out.println("<div class=\"goods-data-list\">");
                                out.println("<li>商品ID：" + list.get(i + 0) + "</i>");
                                out.println("<li>商品价格：" + list.get(i + 1) + "</i>");
                                out.println("<li>商品数量：" + list.get(i + 2) + "</i>");
                                out.println("<li>商品名称：" + list.get(i + 3) + "</i>");
                                out.println("<li>商品简介：" + list.get(i + 4) + "</i>");
                                out.println("<a href=\"del?gid=" + list.get(i + 0) +"\">删除</a>");
                                out.println("</div>");
                            }
                        }
                    %>
                </div>
            </div>
        </div>
    </div>
</div>

<%
    if(request.getAttribute("msg") != null){
        out.println("<script>alert('"+request.getAttribute("msg")+"')</script>");
    }
%>

<jsp:include page="../../public/footer.jsp"/>