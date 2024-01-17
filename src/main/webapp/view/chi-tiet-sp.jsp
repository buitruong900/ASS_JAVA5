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
        <input type="text" class="form-control" name="id" value="${chiTietSanPham.id}" disabled>
    </div>
    <div class="mb-3">
        <label class="form-label">Ten San Pham</label>
        <select class="form-select" aria-label="Default select example" name="sanPham">
            <c:forEach items="${listSanPham}" var="sp">
                <option value="${sp.id}"${chiTietSanPham.sanPham.ten==sp.ten ?"selected":""} >${sp.ten}</option>
            </c:forEach>
        </select>
    </div>
    <div class="mb-3">
        <label class="form-label">Ten Mau Sac</label>
        <select class="form-select" aria-label="Default select example" name="mauSac">
            <c:forEach items="${listMauSac}" var="ms">
                <option value="${ms.id}" ${chiTietSanPham.mauSac.ten==ms.ten?"selected":""}>${ms.ten}</option>
            </c:forEach>
        </select>
    </div>
    <div class="mb-3">
        <label class="form-label">Gia Ban</label>
        <input type="text" class="form-control" name="gia_ban" value="${chiTietSanPham.gia_ban}">
    </div>

    <div class="mb-3">
        <label class="form-label">So Luong Ton</label>
        <input type="text" class="form-control" name="so_luong_ton" value="${chiTietSanPham.so_luong_ton}">
    </div>
    <button formaction="/chi-tiet-san-pham/add" type="submit" class="btn btn-primary">Add</button>
    <button formaction="/chi-tiet-san-pham/update/${chiTietSanPham.id}" type="submit" class="btn btn-primary">Update
    </button>
</form>
<table class="table">
    <thead>
    <tr>
        <th>Id</th>
        <th>Ten San Pham</th>
        <th>Ten Mau Sac</th>
        <th>Gia Ban</th>
        <th>So Luong Ton</th>
        <th>#</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="ctsp">
        <tr>
            <td>${ctsp.id}</td>
            <td>${ctsp.sanPham.ten}</td>
            <td>${ctsp.mauSac.ten}</td>
            <td>${ctsp.gia_ban}</td>
            <td>${ctsp.so_luong_ton}</td>
            <td><a href="/chi-tiet-san-pham/delete/${ctsp.id}" class="btn btn-primary">Delete</a></td>
            <td><a href="/chi-tiet-san-pham/detail/${ctsp.id}" class="btn btn-primary">Detail</a></td>
            <td><a href="/cart/add?ctspId=${ctsp.id}" class="btn btn-primary">Add giỏ hàng</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="/gio-hang/view" class="btn btn-primary"> Xem giỏ hàng</a>
</body>
</html>