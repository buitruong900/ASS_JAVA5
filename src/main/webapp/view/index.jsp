<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<form action="/cua-hang/add" method="post">
    <div class="mb-3">
        <label class="form-label">Id</label>
        <input type="text" class="form-control" name="id" value="${cuaHang.id}" disabled>
    </div>
    <div class="mb-3">
        <label class="form-label">Mã</label>
        <input type="text" class="form-control" name="ma" value="${cuaHang.ma}">
    </div>
    <div class="mb-3">
        <label class="form-label">Tên</label>
        <input type="text" class="form-control" name="ten" value="${cuaHang.ten}">
    </div>
    <div class="mb-3">
        <label class="form-label">Địa Chỉ</label>
        <input type="text" class="form-control" name="dia_chi" value="${cuaHang.dia_chi}">
    </div>
    <div class="mb-3">
        <label class="form-label">Thành Phố</label>
        <input type="text" class="form-control" name="thanh_pho" value="${cuaHang.thanh_pho}">
    </div>
    <div class="mb-3">
        <label class="form-label">Quốc Gia</label>
        <input type="text" class="form-control" name="quoc_gia" value="${cuaHang.quoc_gia}">
    </div>
    <button type="submit">Add</button>
    <button type="submit">Update</button>
</form>
<table class="table">
    <thead>
    <tr>
        <th>Id</th>
        <th>Ma</th>
        <th>Ten</th>
        <th>Dia Chi</th>
        <th>Thanh Pho</th>
        <th>Quoc Gia</th>
        <th>#</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="cuaHang">
        <tr>
            <td>${cuaHang.id}</td>
            <td>${cuaHang.ma}</td>
            <td>${cuaHang.ten}</td>
            <td>${cuaHang.dia_chi}</td>
            <td>${cuaHang.thanh_pho}</td>
            <td>${cuaHang.quoc_gia}</td>
            <td><a href="/cua-hang/delete/${cuaHang.id}" class="btn btn-primary">Xoa</a></td>
            <td><a href="/cua-hang/detail/${cuaHang.id}" class="btn btn-primary">Detail</a></td>
            <td><a href="/hien-thi" class="btn btn-primary">Back Form</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<%--<nav aria-label="Page navigation example">--%>
<%--    <ul class="pagination">--%>
<%--        <c:forEach begin="1" end="${totalPage}" varStatus="status">--%>
<%--            <li class="page-item"><a class="page-link" href="/cua-hang/hien-thi?pageNum=${status.index}">${status.index}</a></li>--%>
<%--        </c:forEach>--%>
<%--    </ul>--%>
<%--</nav>--%>
</body>
</html>