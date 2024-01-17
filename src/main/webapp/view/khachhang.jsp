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
<form action="" method="post">
    <div class="mb-3">
        <label class="form-label">Id</label>
        <input type="text" class="form-control" name="id" value="${khachHang.id}" disabled>
    </div>
    <div class="mb-3">
        <label class="form-label">Ma</label>
        <input type="text" class="form-control" name="ma" value="${khachHang.ma}">
    </div>
    <div class="mb-3">
        <label class="form-label">Ten</label>
        <input type="text" class="form-control" name="ten" value="${khachHang.ten}">
    </div>
    <div class="mb-3">
        <label class="form-label">Ten_Dem</label>
        <input type="text" class="form-control" name="ten_dem" value="${khachHang.ten_dem}">
    </div>
    <div class="mb-3">
        <label class="form-label">Ho</label>
        <input type="text" class="form-control" name="ho" value="${khachHang.ho}">
    </div>
    <div class="mb-3">
        <label class="form-label">NgaySinh</label>
        <input type="date" class="form-control" name="ngay_sinh" value="${khachHang.ngay_sinh}">
    </div>
    <div class="mb-3">
        <label class="form-label">SDT</label>
        <input type="text" class="form-control" name="sdt" value="${khachHang.sdt}">
    </div>
    <div class="mb-3">
        <label class="form-label">Dia Chi</label>
        <input type="text" class="form-control" name="dia_chi" value="${khachHang.dia_chi}">
    </div>
    <div class="mb-3">
        <label class="form-label">Thanh Pho</label>
        <input type="text" class="form-control" name="thanh_pho" value="${khachHang.thanh_pho}">
    </div>
    <div class="mb-3">
        <label class="form-label">Quoc Gia</label>
        <input type="text" class="form-control" name="quoc_gia" value="${khachHang.quoc_gia}">
    </div>
    <div class="mb-3">
        <label class="form-label">Mat Khau</label>
        <input type="text" class="form-control" name="mat_khau" value="${khachHang.mat_khau}">
    </div>
    <button formaction="/khach-hang/add" type="submit" class="btn btn-primary">Add</button>
    <button formaction="/khach-hang/update/${khachHang.id}" type="submit" class="btn btn-primary">Update</button>

</form>
<table class="table">
    <thead>
    <tr>
        <th>Id</th>
        <th>Ma</th>
        <th>Ten</th>
        <th>Ten_Dem</th>
        <th>Ho</th>
        <th>Ngay_Sinh</th>
        <th>SDT</th>
        <th>Dia_Chi</th>
        <th>Thanh_Pho</th>
        <th>Quoc_Gia</th>
        <th>Mat_Khau</th>
        <th>#</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="khachHang">
        <tr>
            <td>${khachHang.id}</td>
            <td>${khachHang.ma}</td>
            <td>${khachHang.ten}</td>
            <td>${khachHang.ten_dem}</td>
            <td>${khachHang.ho}</td>
            <td>${khachHang.ngay_sinh}</td>
            <td>${khachHang.sdt}</td>
            <td>${khachHang.thanh_pho}</td>
            <td>${khachHang.quoc_gia}</td>
            <td>${khachHang.mat_khau}</td>
            <td><a href="/khach-hang/delete/${khachHang.id}" class="btn btn-primary">Delete</a></td>
            <td><a href="/khach-hang/detail/${khachHang.id}" class="btn btn-primary">Detail</a></td>
            <td><a href="/hien-thi" class="btn btn-primary">Back Form</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>