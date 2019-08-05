<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="UTF-8">
    <title>${title} - 二手跳蚤市场</title>
    <link rel="shortcut icon" href="../../static/img/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" type="text/css" href="../../static/css/base.css" />
    <script src="../../static/js/jquery.js"></script>
</head>
<body>
<header>
    <div class="top">
        <div class="top-menu">
            <ul class="top-menu-left">
                <%
                    if(session.getAttribute("uid") == null){
                        out.print("<li><a href=\"../user/login\" style=\"color: #ff5000;\">亲,请登录</a></li> ");
                        out.print("<li><a href=\"../user/register\">免费注册</a></li>");
                    }
                    else{
                        out.print("<li><a href=\"../user/index\">个人中心</a></li> ");
                        out.print("<li><a href=\"../user/logout\">注销</a></li>");
                    }
                %>
            </ul>
            <ul class="top-menu-right">
                <%
                    if(!"/WEB-INF/view/index/index.jsp".equals(request.getRequestURI())){
                        out.print("<li><a href=\"../../\">网站首页</a></li>");
                    }
                %>
                <li><a href="../../cart/index">购物车</a></li>
                <li><a href="../../collect/index">收藏夹</a></li>
                <li><a href="../../store/index">卖家中心</a></li>
                <li><a href="../../about/index">关于我们</a></li>
                <li><a href="../../coop/index">商务合作</a></li>
                <li><a href="../../find/index">网站导航</a></li>
            </ul>
        </div>
    </div>
</header>