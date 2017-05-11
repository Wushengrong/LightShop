<%--
  Created by IntelliJ IDEA.
  User: Wushengrong
  Date: 2017/5/6
  Time: 23:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<jsp:include page="/web-jsp/common/head1.jsp"></jsp:include>
<jsp:include page="/web-jsp/common/head2.jsp"></jsp:include>
<jsp:include page="/web-jsp/common/head3.jsp"></jsp:include>
<div class="container">
    <div class="row">
        <div class="col-xs-12">
            <div class="title"><span>收藏夹</span></div>
            <div class="table-responsive">
                <table class="table table-bordered table-cart">
                    <thead>
                    <tr>
                        <th>商品</th>
                        <th>信息</th>
                        <th>收藏日期</th>
                        <th>单价</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${collects }" var="collect">
                        <tr>
                            <td class="img-cart">
                                <a href="${pageContext.request.contextPath}/web/product/detail.htm?id=${collect.product.id}">
                                    <img alt="${collect.product.name }" src="${pageContext.request.contextPath}${collect.product.pictures[0].pictureUrl}" class="img-thumbnail">
                                </a>
                            </td>
                            <td>
                                <p><a href="${pageContext.request.contextPath}/web/product/detail.htm?id=${collect.product.id}">${collect.product.name }</a></p>
                                <small>${collect.product.notice }</small>
                            </td>
                            <td>
                                <fmt:formatDate value="${collect.createTime }" type="date"/>
                            </td>
                            <td class="unit">￥${collect.product.price }</td>
                            <td class="action">
                                <a href="javascript:addCart('${collect.product.id}','1')" class="remove_cart" rel="2" data-placement="top" data-toggle="tooltip" data-original-title="加入购物车"><i class="fa fa-shopping-cart"></i></a>&nbsp;
                                <a href="javascript:void(0)" collectId="${collect.id }" class="remove_collect" rel="2" data-placement="top" data-toggle="tooltip" data-original-title="删除"><i class="fa fa-trash-o"></i></a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
            <button type="button" class="btn btn-sm pull-left" onclick="window.location='${pageContext.request.contextPath}/index.htm'"><i class="fa fa-arrow-circle-left"></i> 继续购物</button>
            <button type="button" class="btn btn-sm pull-right" onclick="window.location='${pageContext.request.contextPath}/web/shoppingcart/list.htm'">购物车 <i class="fa fa-arrow-circle-right"></i></button>
        </div>
    </div>
</div>
<jsp:include page="/web-jsp/common/footer.jsp"></jsp:include>
<script type="text/javascript">
    $(function(){
        $('.remove_collect').click(function(){
            removeCollect($(this).attr('collectId'));
            $(this).parent().parent().remove();
        });
    });
</script>

</body>
</html>

</html>