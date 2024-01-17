<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<table class="table container">
    <thead>
    <tr>
        <td>ID CTSP</td>
        <td>Tên sản phẩm</td>
        <td>Màu sắc</td>
        <td>Số lượng</td>
        <td>Giá bán</td>
        <td>Tổng tiền</td>
        <%--        <td>#</td>--%>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${gioHangChiTiet}" var="gh">
        <tr>
            <td>${gh.idCtsp}</td>
            <td>${gh.tenSanPham}</td>
            <td>${gh.tenMau}</td>
            <td>${gh.soLuong}</td>
            <td>${gh.giaBan}</td>
            <td>${gh.soLuong * gh.giaBan}</td>
                <%--            <td><a href="/cart/delete/${gh.idCtsp}" class="btn btn-primary">Xoa</a></td>--%>
        </tr>
    </c:forEach>
    </tbody>

</table>
<a href="" class="btn btn-primary">Thanh Toán</a>
<a href="/chi-tiet-san-pham/hien-thi" class="btn btn-primary">Add more</a>
<a href="/gio-hang/clear" class="btn btn-primary">Clear</a>
<td><a href="/hien-thi" class="btn btn-primary">Back Form</a></td>
</body>
</html>