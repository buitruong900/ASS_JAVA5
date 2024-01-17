<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<%--<form:form modelAttribute="nxs" action="" method="post">--%>

<%--</form:form>--%>
<form action="" method="post">
    <div class="mb-3">
        <label class="form-label">Id</label>
        <input type="text" class="form-control" name="id" value="${nxs.id}" disabled>
    </div>
    <div class="mb-3">
        <label class="form-label">Ma</label>
        <input type="text" class="form-control" name="ma" value="${nxs.ma}">
    </div>
    <div class="mb-3">
        <label class="form-label">Ten</label>
        <input type="text" class="form-control" name="ten" value="${nxs.ten}">
    </div>
    <button formaction="/nxs/add" type="submit" class="btn btn-primary">Add</button>
    <button formaction="/nxs/update/${nxs.id}" type="submit" class="btn btn-primary">Update</button>
</form>
<table class="table">
    <thead>
    <tr>
        <th>Id</th>
        <th>Ma</th>
        <th>Ten</th>
        <th>#</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="nxs">
        <tr>
            <td>${nxs.id}</td>
            <td>${nxs.ma}</td>
            <td>${nxs.ten}</td>
            <td><a href="/nxs/delete/${nxs.id}" class="btn btn-primary">Delete</a></td>
            <td><a href="/nxs/detail/${nxs.id}" class="btn btn-primary">Detail</a></td>
            <td><a href="/hien-thi" class="btn btn-primary">Back Form</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<nav aria-label="Page navigation example">
    <ul class="pagination">
        <c:forEach begin="1" end="${totalPage}" varStatus="status">
            <li class="page-item"><a class="page-link" href="/nxs/hien-thi?pageNum=${status.index}">${status.index}</a>
            </li>
        </c:forEach>
    </ul>
</nav>
</body>
</html>