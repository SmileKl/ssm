<%--
  Created by IntelliJ IDEA.
  User: smile
  Date: 2020/5/7
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
</head>
<body>

<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <input type="hidden" name="bookID" value="${uBook.bookID}">
        书籍名称：<input type="text" name="bookName" value="${uBook.bookName}"><br><br><br>
        书籍数量：<input type="text" name="bookCounts" value="${uBook.bookCounts}"><br><br><br>
        书籍详情：<input type="text" name="detail" value="${uBook.detail}"><br><br><br>
        <input type="submit" value="提交">
    </form>
<%--    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">--%>
<%--        <input type="hidden" name="bookID" value="${uBook.bookID}"/>--%>
<%--        书籍名称：<input type="text" name="bookName" value="${uBook.bookName}"/>--%>
<%--        书籍数量：<input type="text" name="bookCounts" value="${uBook.bookCounts}"/>--%>
<%--        书籍详情：<input type="text" name="detail" value="${uBook.detail}"/>--%>
<%--        <input type="submit" value="提交"/>--%>
<%--    </form>--%>

</div>

</body>
</html>
