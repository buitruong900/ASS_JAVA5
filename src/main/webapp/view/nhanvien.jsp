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
        <input type="text" class="form-control" name="id" value="${nhanVien.id}" disabled>
    </div>
    <div class="mb-3">
        <label class="form-label">Ma</label>
        <input type="text" class="form-control" name="ma" value="${nhanVien.ma}">
    </div>
    <div class="mb-3">
        <label class="form-label">Ten</label>
        <input type="text" class="form-control" name="ten" value="${nhanVien.ten}">
    </div>
    <div class="mb-3">
        <label class="form-label">Ten_Dem</label>
        <input type="text" class="form-control" name="ten_dem" value="${nhanVien.ten_dem}">
    </div>
    <div class="mb-3">
        <label class="form-label">Ho</label>
        <input type="text" class="form-control" name="ho" value="${nhanVien.ho}">
    </div>
    <div class="mb-3">
        <label class="form-label">Gioi Tinh</label>
        <input type="text" class="form-control" name="gioi_tinh" value="${nhanVien.gioi_tinh}">
    </div>
    <%--    <div class="mb-3">--%>
    <%--        <label  class="form-label">Gioi Tinh</label>--%>
    <%--        <div class="form-check">--%>
    <%--            <input class="form-check-input" type="radio" name="gioi_tinh" value="${nhanVien.gioi_tinh}" id="flexCheckDefault">--%>
    <%--            <label class="form-check-label" for="flexCheckDefault">--%>
    <%--                Nam--%>
    <%--            </label>--%>
    <%--        </div>--%>
    <%--        <div class="form-check">--%>
    <%--            <input class="form-check-input" type="radio" name="gioi_tinh" value="${nhanVien.gioi_tinh}" id="flexCheckChecked">--%>
    <%--            <label class="form-check-label" for="flexCheckChecked">--%>
    <%--                Nữ--%>
    <%--            </label>--%>
    <%--        </div>--%>
    <%--    </div>--%>
    <div class="mb-3">
        <label class="form-label">Ngay Sinh</label>
        <input type="date" class="form-control" name="ngay_sinh" value="${nhanVien.ngay_sinh}">
    </div>
    <div class="mb-3">
        <label class="form-label">Dia Chi</label>
        <input type="text" class="form-control" name="dia_chi" value="${nhanVien.dia_chi}">
    </div>
    <div class="mb-3">
        <label class="form-label">SDT</label>
        <input type="text" class="form-control" name="sdt" value="${nhanVien.sdt}">
    </div>
    <div class="mb-3">
        <label class="form-label">Mat Khau</label>
        <input type="password" class="form-control" name="mat_khau" value="${nhanVien.mat_khau}">
    </div>
    <div class="mb-3">
        <label class="form-label">Mã CH</label>
        <select class="form-select" aria-label="Default select example" name="cuaHang">
            <c:forEach items="${listCuaHang}" var="ch">
                <option value="${ch.id}" ${nhanVien.cuaHang.ten==ch.ten ?"selected":""}>${ch.ten}</option>
            </c:forEach>
        </select>
    </div>
    <div class="mb-3">
        <label class="form-label">Mã CV</label>
        <select class="form-select" aria-label="Default select example" name="chucVu">
            <c:forEach items="${listChucVu}" var="cv">
                <option value="${cv.id}" ${nhanVien.chucVu.ten==cv.ten ?"selected":""}>${cv.ten}</option>
            </c:forEach>
        </select>
    </div>
    <div class="mb-3">
        <label class="form-label">Trang Thai</label>
        <input type="text" class="form-control" name="trang_thai" value="${nhanVien.trang_thai}">
    </div>
    <button formaction="/nhan-vien/add" type="submit" class="btn btn-primary">Add</button>
    <button formaction="/nhan-vien/update/${nhanVien.id}" type="submit" class="btn btn-primary">Update</button>
</form>
<table class="table">
    <thead>
    <tr>
        <th>Id</th>
        <th>Ma</th>
        <th>Ten</th>
        <th>Ten_Dem</th>
        <th>Ho</th>
        <th>Gioi Tinh</th>
        <th>Ngay Sinh</th>
        <th>Dia Chi</th>
        <th>SDT</th>
        <th>Mat Khau</th>
        <th>Id_Ch</th>
        <th>Id_Cv</th>
        <th>Trang Thai</th>
        <th>#</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="nhanVien">
        <tr>
            <td>${nhanVien.id}</td>
            <td>${nhanVien.ma}</td>
            <td>${nhanVien.ten}</td>
            <td>${nhanVien.ten_dem}</td>
            <td>${nhanVien.ho}</td>
            <td>${nhanVien.gioi_tinh}</td>
            <td>${nhanVien.ngay_sinh}</td>
            <td>${nhanVien.dia_chi}</td>
            <td>${nhanVien.sdt}</td>
            <td>${nhanVien.mat_khau}</td>
            <td>${nhanVien.cuaHang.ten}</td>
            <td>${nhanVien.chucVu.ten}</td>
            <td>${nhanVien.trang_thai}</td>
            <td><a href="/nhan-vien/delete/${nhanVien.id}" class="btn btn-primary">Delete</a></td>
            <td><a href="/nhan-vien/detail/${nhanVien.id}" class="btn btn-primary">Detail</a></td>
            <td><a href="/hien-thi" class="btn btn-primary">Back Form</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>