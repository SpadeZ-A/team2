<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../../public/header.jsp"/>

<style>
    .body-div-show{
        width: 1200px;
        text-align: left;
        margin-top: 10px;
        margin-bottom: 10px;
        background: #ffffff;
    }
    .show-head-tip{
        width: 5px;
        height: 20px;
        margin-right: 10px;
        margin-left: 20px;
        background: #ff5000;
    }
    .show-head{
        padding-top: 20px;
        display: flex;
    }
    .show-body{
        display: flex;
        margin-top: 10px;
        padding-bottom: 10px;
    }
    .show-body-div{
        width: 20%;
        text-align: center;
    }

    .body-div-two{
        display: flex;
    }

    .body-div-left{
        width: 595px;
        display: inline-block;
        text-align: left;
        margin-top: 10px;
        margin-bottom: 10px;
        background: #ffffff;
    }
    .left-head{
        padding-top: 20px;
        display: flex;
    }
    .left-head-tip{
        width: 5px;
        height: 20px;
        margin-right: 10px;
        margin-left: 20px;
        background: #ff5000;
    }
    .left-body{
        display: flex;
        padding: 10px 20px 10px 20px;
    }

    .body-div-right{
        width: 595px;
        display: inline-block;
        text-align: left;
        margin-top: 10px;
        margin-left: 10px;
        margin-bottom: 10px;
        background: #ffffff;
    }
    .right-head{
        padding-top: 20px;
        display: flex;
    }
    .right-head-tip{
        width: 5px;
        height: 20px;
        margin-right: 10px;
        margin-left: 20px;
        background: #ff5000;
    }
    .right-body{
        display: flex;
        padding: 10px 20px 10px 20px;
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
                <input name="search" class="search-input" placeholder="🔍 手机 电脑 课本 衣服 鞋"/>
            </div>
            <div class="search-right">
                <input type="submit" class="search-button" value="搜索"/>
            </div>
        </div>
    </div>
    <div class="head-menu">
        <div class="head-menu-list">
            <div class="menu-main">
                <span>主题市场</span>
                <div class="menu-main-drop">
                    <div class="menu-main-list"><a href="#">手机 / 电脑 / 相机</a></div>
                    <div class="menu-main-list"><a href="#">男装 / 女装</a></div>
                    <div class="menu-main-list"><a href="#">美妆 / 护理</a></div>
                    <div class="menu-main-list"><a href="#">学习 / 生活 / 办公</a></div>
                    <div class="menu-main-list"><a href="#">游戏 / 动漫</a></div>
                </div>
            </div>
            <div class="menu-nav-list"><a href="#">手机</a></div>
            <div class="menu-nav-list"><a href="#">电脑</a></div>
            <div class="menu-nav-list"><a href="#">学习</a></div>
            <div class="menu-nav-list"><a href="#">办公</a></div>
        </div>
    </div>
</div>

<div class="body">
    <div class="body-div">
        <div class="body-div-banner">
            <a href="#">
                <img src="../static/img/banner.png" width="1200px">
            </a>
        </div>
        <div class="body-div-show">
            <div class="show-head">
                <div class="show-head-tip"></div>
                <div class="show-head-title">新品推荐</div>
            </div>
            <div class="show-body">
                <div class="show-body-div">
                    <a href="http://localhost/goods/detail?gid=123456">
                        <img src="../static/img/logo.png" width="100%" title="转转网"/>
                    </a>
                    <a href="http://localhost/goods/detail?gid=123456">
                        <h>[转转网]二手跳蚤市场</h>
                    </a>
                </div>
                <div class="show-body-div">
                    <a href="http://localhost/goods/detail?gid=123456">
                        <img src="../static/img/logo.png" width="100%" title="转转网"/>
                    </a>
                    <a href="http://localhost/goods/detail?gid=123456">
                        <h>[转转网]二手跳蚤市场</h>
                    </a>
                </div>
                <div class="show-body-div">
                    <a href="http://localhost/goods/detail?gid=123456">
                        <img src="../static/img/logo.png" width="100%" title="转转网"/>
                    </a>
                    <a href="http://localhost/goods/detail?gid=123456">
                        <h>[转转网]二手跳蚤市场</h>
                    </a>
                </div>
                <div class="show-body-div">
                    <a href="http://localhost/goods/detail?gid=123456">
                        <img src="../static/img/logo.png" width="100%" title="转转网"/>
                    </a>
                    <a href="http://localhost/goods/detail?gid=123456">
                        <h>[转转网]二手跳蚤市场</h>
                    </a>
                </div>
                <div class="show-body-div">
                    <a href="http://localhost/goods/detail?gid=123456">
                        <img src="../static/img/logo.png" width="100%" title="转转网"/>
                    </a>
                    <a href="http://localhost/goods/detail?gid=123456">
                        <h>[转转网]二手跳蚤市场</h>
                    </a>
                </div>
            </div>
        </div>
        <div class="body-div-two">
            <div class="body-div-left">
                <div class="left-head">
                    <div class="left-head-tip"></div>
                    <div class="left-head-title">学习生活</div>
                </div>
                <div class="left-body">
                    <div class="show-body-div" style="width: 50%;">
                        <img src="../static/img/logo.png" width="100%" title="转转网"/>
                        <h>[转转网]二手跳蚤市场</h>
                    </div>
                    <div class="show-body-div" style="width: 50%;">
                        <img src="../static/img/logo.png" width="100%" title="转转网"/>
                        <h>[转转网]二手跳蚤市场</h>
                    </div>
                </div>
            </div>
            <div class="body-div-right">
                <div class="right-head">
                    <div class="right-head-tip"></div>
                    <div class="right-head-title">数码设备</div>
                </div>
                <div class="right-body">
                    <div class="show-body-div" style="width: 50%;">
                        <img src="../static/img/logo.png" width="100%" title="转转网"/>
                        <h>[转转网]二手跳蚤市场</h>
                    </div>
                    <div class="show-body-div" style="width: 50%;">
                        <img src="../static/img/logo.png" width="100%" title="转转网"/>
                        <h>[转转网]二手跳蚤市场</h>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<jsp:include page="../../public/footer.jsp"/>