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
        <input type="text" class="form-control" name="id" value="${hoaDon.id}" disabled>
    </div>
    <div class="mb-3">
        <label class="form-label">Ten Khach Hang</label>
        <select class="form-select" aria-label="Default select example" name="khachHang">
            <c:forEach items="${listKhachHang}" var="kh">
                <option value="${kh.id}"${hoaDon.khachHang.ten==kh.ten?"selected":""}>${kh.ten}</option>
            </c:forEach>
        </select>
    </div>
    <div class="mb-3">
        <label class="form-label">Ten Nhan Vien</label>
        <select class="form-select" aria-label="Default select example" name="nhanVien">
            <c:forEach items="${listNhanVien}" var="nv">
                <option value="${nv.id}" ${hoaDon.nhanVien.ten ==nv.ten ? "selected ":""}>${nv.ten}</option>
            </c:forEach>
        </select>
    </div>
    <div class="mb-3">
        <label class="form-label">Ma</label>
        <input type="text" class="form-control" name="ma" value="${hoaDon.ma}">
    </div>
    <div class="mb-3">
        <label class="form-label">Ngay Tao</label>
        <input type="date" class="form-control" name="ngay_tao" value="${hoaDon.ngay_tao}">
    </div>
    <div class="mb-3">
        <label class="form-label">Ngay Thanh Toan</label>
        <input type="date" class="form-control" name="ngay_thanh_toan" value="${hoaDon.ngay_thanh_toan}">
    </div>
    <div class="mb-3">
        <label class="form-label">Ngay Ship</label>
        <input type="date" class="form-control" name="ngay_ship" value="${hoaDon.ngay_ship}">
    </div>
    <div class="mb-3">
        <label class="form-label">Ngay Nhan</label>
        <input type="date" class="form-control" name="ngay_nhan" value="${hoaDon.ngay_nhan}">
    </div>
    <div class="mb-3">
        <label class="form-label">Tinh Trang</label>
        <input type="text" class="form-control" name="tinh_trang" value="${hoaDon.tinh_trang}">
    </div>
    <div class="mb-3">
        <label class="form-label">Ten Nguoi Nhan</label>
        <input type="text" class="form-control" name="ten_nguoi_nhan" value="${hoaDon.ten_nguoi_nhan}">
    </div>
    <div class="mb-3">
        <label class="form-label">Dia Chi</label>
        <input type="text" class="form-control" name="dia_chi" value="${hoaDon.dia_chi}">
    </div>
    <div class="mb-3">
        <label class="form-label">SDT</label>
        <input type="password" class="form-control" name="sdt" value="${hoaDon.sdt}">
    </div>
    <button formaction="/hoa-don/add" class="btn btn-primary" type="submit">Add</button>
    <button formaction="/hoa-don/update/${hoaDon.id}" class="btn btn-primary" type="submit">Update</button>
</form>
<table class="table">
    <thead>
    <tr>
        <th>Id</th>
        <th>Ten Khach Hang</th>
        <th>Ten Nhan Vien</th>
        <th>Ma</th>
        <th>Ngay Tao</th>
        <th>Ngay Thanh Toan</th>
        <th>Ngay Ship</th>
        <th>Ngay Nhan</th>
        <th>Tinh Trang</th>
        <th>Ten Nguoi Nhan</th>
        <th>Dia Chi</th>
        <th>SDT</th>
        <th>#</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="hoaDon">
        <tr>
            <td>${hoaDon.id}</td>
            <td>${hoaDon.khachHang.ten}</td>
            <td>${hoaDon.nhanVien.ten}</td>
            <td>${hoaDon.ma}</td>
            <td>${hoaDon.ngay_tao}</td>
            <td>${hoaDon.ngay_thanh_toan}</td>
            <td>${hoaDon.ngay_ship}</td>
            <td>${hoaDon.ngay_nhan}</td>
            <td>${hoaDon.tinh_trang==0 ?"Con":"Het"}</td>
            <td>${hoaDon.ten_nguoi_nhan}</td>
            <td>${hoaDon.dia_chi}</td>
            <td>${hoaDon.sdt}</td>
            <td><a href="/hoa-don/delete/${hoaDon.id}" class="btn btn-primary">Delete</a></td>
            <td><a href="/hoa-don/detail/${hoaDon.id}" class="btn btn-primary">Detail</a></td>
            <td><a href="/hien-thi" class="btn btn-primary">Back Form</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>