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
        <input type="text" class="form-control" name="id" value="${gioHang.id}" disabled>
    </div>
    <%--    <div class="mb-3">--%>
    <%--        <label  class="form-label">Ten San Pham</label>--%>
    <%--        <select class="form-select" aria-label="Default select example" name="sanPham">--%>
    <%--            <c:forEach items="${listSanPham}" var="sp">--%>
    <%--                <option value="${sp.id}">${sp.ten}</option>--%>
    <%--            </c:forEach>--%>
    <%--        </select>--%>
    <%--    </div>--%>
    <div class="mb-3">
        <label class="form-label">Ten Khach Hang</label>
        <select class="form-select" aria-label="Default select example" name="khachHang">
            <c:forEach items="${listKhachHang}" var="kh">
                <option value="${kh.id}" ${gioHang.khachHang.ten==kh.ten?"selected":""}>${kh.ten}</option>
            </c:forEach>
        </select>
    </div>

    <div class="mb-3">
        <label class="form-label">Ten Nhan Vien</label>
        <select class="form-select" aria-label="Default select example" name="nhanVien">
            <c:forEach items="${listNhanVien}" var="nv">
                <option value="${nv.id}" ${gioHang.nhanVien.ten==nv.ten?"selected":""}>${nv.ten}</option>
            </c:forEach>
        </select>
    </div>
    <div class="mb-3">
        <label class="form-label">Ma</label>
        <input type="text" class="form-control" name="ma" value="${gioHang.ma}">
    </div>
    <div class="mb-3">
        <label class="form-label">Ngay Tao</label>
        <input type="date" class="form-control" name="ngay_tao" value="${gioHang.ngay_tao}">
    </div>
    <div class="mb-3">
        <label class="form-label">Ngay Thanh Toan</label>
        <input type="date" class="form-control" name="ngay_thanh_toan" value="${gioHang.ngay_thanh_toan}">
    </div>
    <div class="mb-3">
        <label class="form-label">Ten Nguoi Nhan</label>
        <input type="text" class="form-control" name="ten_nguoi_nhan" value="${gioHang.ten_nguoi_nhan}">
    </div>
    <div class="mb-3">
        <label class="form-label">Dia Chi</label>
        <input type="text" class="form-control" name="dia_chi" value="${gioHang.dia_chi}">
    </div>
    <div class="mb-3">
        <label class="form-label">SDT</label>
        <input type="text" class="form-control" name="sdt" value="${gioHang.sdt}">
    </div>
    <div class="mb-3">
        <label class="form-label">Tinh Trang</label>
        <input type="text" class="form-control" name="tinh_trang" value="${gioHang.tinh_trang}">
    </div>
    <button formaction="/gio-hang/add" type="submit" class="btn btn-primary">Add</button>
    <button formaction="/gio-hang/update/${gioHang.id}" type="submit" class="btn btn-primary">Update</button>
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
        <th>Ten Nguoi Nhan</th>
        <th>Dia Chi</th>
        <th>SDT</th>
        <th>Tinh Trang</th>
        <th>#</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="gioHang">
        <tr>
            <td>${gioHang.id}</td>
            <td>${gioHang.khachHang.ten}</td>
            <td>${gioHang.nhanVien.ten}</td>
            <td>${gioHang.ma}</td>
            <td>${gioHang.ngay_tao}</td>
            <td>${gioHang.ngay_thanh_toan}</td>
            <td>${gioHang.ten_nguoi_nhan}</td>
            <td>${gioHang.dia_chi}</td>
            <td>${gioHang.sdt}</td>
            <td>${gioHang.tinh_trang==0?"con":"het"}</td>
            <td><a href="/gio-hang/delete/${gioHang.id}" class="btn btn-primary">Delete</a></td>
            <td><a href="/gio-hang/detail/${gioHang.id}" class="btn btn-primary">Detail</a></td>
            <td><a href="/hien-thi" class="btn btn-primary">Back Form</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>