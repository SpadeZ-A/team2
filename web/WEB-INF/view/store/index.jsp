<%@ page contentType="text/html;charset=UTF-8" %>
<jsp:include page="../../public/header.jsp"/>

<style>
    .blue{
        color: blue;
        font-size: 24px;
    }
    .store-nav{
        width: 200px;
        margin-top: 10px;
        margin-bottom: 10px;
        background: #ffffff;
        display: inline-block;
    }
    .store-nav-title{
        font-weight: bold;
        padding: 10px 20px 10px 20px;
        border-bottom: 1px solid #cccccc;
    }
    .store-nav-list{
        padding: 10px 20px 10px 20px;
        font-size: 14px;
    }

    .store-data{
        width: 100%;
        margin-top: 10px;
        margin-left: 10px;
        margin-bottom: 10px;
        display: inline-block;
    }
    .store-data-div{
        background: #ffffff;
    }
    .store-data-title{
        font-weight: bold;
        padding: 10px 20px 10px 20px;
        border-bottom: 1px solid #cccccc;
    }
    .store-data-menu{
        display: flex;
    }
    .store-data-list{
        width: 25%;
        font-size: 14px;
        text-align: center;
        padding-top: 30px;
        padding-bottom: 30px;
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
        <div class="store-nav">
            <div class="store-nav-title">我的店铺</div>
            <div class="store-nav-list">查看店铺</div>
            <div class="store-nav-list">店铺装修</div>
            <div class="store-nav-list"><a href="../goods/manager">商品管理</a></div>
            <div class="store-nav-list">订单管理</div>
            <div class="store-nav-list">评论管理</div>
        </div>
        <!-- 店铺数据 -->
        <div class="store-data">
            <div class="store-data-div">
                <div class="store-data-title">基本信息</div>
                <div class="store-data-menu">
                    <div class="store-data-list"><div class="blue">0</div>商品数</div>
                    <div class="store-data-list"><div class="blue">0</div>订单数</div>
                    <div class="store-data-list"><div class="blue">0</div>成交数</div>
                    <div class="store-data-list"><div class="blue">0</div>交易中</div>
                </div>
            </div>
            <div class="store-data-div" style="margin-top: 10px;">
                <div class="store-data-title">访客数据</div>
                <div class="store-data-menu">
                    <div class="store-data-list"><div class="blue">0</div>访客数</div>
                    <div class="store-data-list"><div class="blue">0</div>电脑端</div>
                    <div class="store-data-list"><div class="blue">0</div>移动端</div>
                    <div class="store-data-list"><div class="blue">0</div>排行榜</div>
                </div>
            </div>
        </div>
    </div>
</div>

<jsp:include page="../../public/footer.jsp"/>