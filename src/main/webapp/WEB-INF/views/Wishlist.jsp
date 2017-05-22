<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<HEADER>
    <title>收藏夹</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/shopCartJS/jquery-1.11.min.js"></script>
    <script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/shopCartJS/etao.js"></script>
    <link href="${pageContext.servletContext.contextPath}/css/shopCartCSS/cart.css" media="screen" rel="stylesheet" type="text/css" />
    <link href="${pageContext.servletContext.contextPath}/css/shopCartCSS/bootstrap.min.css" media="screen" rel="stylesheet" type="text/css" />
    <script src="${pageContext.servletContext.contextPath}/js/bootstrap.min.js"></script>
    <!-- 导航-->
    <script src="${pageContext.request.contextPath}/js/bootsnav.js"></script>
    <link href="${pageContext.request.contextPath}/skins/color.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/bootsnav.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/overwrite.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/fonts/FontAwesome/font-awesome.css" rel="stylesheet">
</HEADER>
<body class="container">
<!-- 导航--><jsp:include page="navigation.jsp"/>
<div class="row hidden-print">
    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
        <ol class="breadcrumb">
            <li><a href="${pageContext.servletContext.contextPath}/index">首页</a></li>
            <li class="active">查看购物车</li>
        </ol>
    </div>
</div>
<div class="cart-wrap">
    <table id="cartTable" class="cart table table-condensed">
        <thead>
            <th class="t-goods text-center"><label>产品名称</label></th>
            <th class="text-center">产品图片</th>
            <th class="t-selling-price text-center"><label>销售单价</label></th>
            <th class="t-action"><label>操作</label></th>
        </thead>
        <tbody>
        <c:forEach var="wish" items="${wishlist}">
        <tr>
            <td>${wish.lightByLightId.name}</td>
            <a href="${wish.lightByLightId.}"
            <td><img src="${pageContext.request.contextPath}/${wish.lightByLightId.image1}" width="100" height="100"/> </td>
            <td>${wish.lightByLightId.price}</td>
            <td class="action" style="padding-top: 1.1rem;"><span class="delete btn btn-xs btn-warning">删除</span></td>
        </tr>
        </c:forEach>
        </tbody>
    </table>

</div>
</body>
</html>