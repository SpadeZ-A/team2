<%@ page contentType="text/html;charset=UTF-8" %>
<jsp:include page="../../public/header.jsp"/>

<style>
    .left-div{
        width: 200px;
        background: white;
        margin-top: 10px;
        margin-bottom: 10px;
        text-align: left;
        padding-bottom: 20px;
    }
    .left-div-title{
        color: #ff5000;
        font-weight: bold;
        padding: 10px 20px 10px 20px;
    }
    .left-div-list{
        font-size: 14px;
        border-bottom: 1px solid #cccccc;
        padding: 10px 20px 10px 20px;
    }
    .left-div-list:hover{
        color: #ffffff;
        cursor: pointer;
        background: #ff9000;
    }
    .right-div{
        width: 990px;
        margin-top: 10px;
        margin-left: 10px;
        margin-bottom: 10px;
        background: white;
        text-align: left;
    }
    .right-div-title{
        color: #ff5000;
        font-weight: bold;
        padding: 10px 20px 10px 20px;
    }
    .right-div-body{
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
    </div>
</div>

<div class="body">
    <div class="body-div" style="display: flex">
        <div class="left-div">
            <div class="left-div-title">关于我们</div>
            <hr style="border: 0;border-bottom: 3px solid #ff9000;margin: 0;">
            <a href="index"><div class="left-div-list">网站简介</div></a>
            <a href="team"><div class="left-div-list">开发团队</div></a>
            <a href="contact"><div class="left-div-list">联系方式</div></a>
            <a href="address"><div class="left-div-list">办公地址</div></a>
        </div>
        <div class="right-div">
            <div class="right-div-title">联系方式</div>
            <hr style="border: 0;border-bottom: 3px solid #ff9000;margin: 0;">
            <div class="right-div-body">body</div>
        </div>
    </div>
</div>

<%
    if(request.getAttribute("msg") != null){
        out.println("<script>alert('"+request.getAttribute("msg")+"')</script>");
    }
%>

<jsp:include page="../../public/footer.jsp"/>