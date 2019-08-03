<%@ page contentType="text/html;charset=UTF-8" %>
<jsp:include page="../../public/header.jsp"/>

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
    <div class="body-div" style="text-align: left;">
        order/index
    </div>
</div>

<%
    if(request.getAttribute("msg") != null){
        out.println("<script>alert('"+request.getAttribute("msg")+"')</script>");
    }
%>

<jsp:include page="../../public/footer.jsp"/>