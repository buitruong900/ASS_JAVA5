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
<form action="/cua-hang/update/${cuaHang.id }" method="post">
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
    <button type="submit" class="btn btn-primary">Update</button>
    <td><a href="/hien-thi" class="btn btn-primary">Back Form</a></td>
</form>
</body>
</html>