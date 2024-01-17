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
        <input type="text" class="form-control" name="id" value="${chucVu.id}" disabled>
    </div>
    <div class="mb-3">
        <label class="form-label">Ma</label>
        <input type="text" class="form-control" name="ma" value="${chucVu.ma}">
    </div>
    <div class="mb-3">
        <label class="form-label">Ten</label>
        <input type="text" class="form-control" name="ten" value="${chucVu.ten}">
    </div>
    <button formaction="/chuc-vu/add" type="submit">Add</button>
    <button formaction="/chuc-vu/update/${chucVu.id}" type="submit">Update</button>

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
    <c:forEach items="${list}" var="chucVu">
        <tr>
            <td>${chucVu.id}</td>
            <td>${chucVu.ma}</td>
            <td>${chucVu.ten}</td>
            <td><a href="/chuc-vu/delete/${chucVu.id}" class="btn btn-primary">Xoa</a></td>
            <td><a href="/chuc-vu/detail/${chucVu.id}" class="btn btn-primary">Detail</a></td>
            <td><a href="/hien-thi" class="btn btn-primary">Back Form</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>