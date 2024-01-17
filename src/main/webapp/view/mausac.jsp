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
        <input type="text" class="form-control" name="id" value="${mauSac.id}" disabled>
    </div>
    <div class="mb-3">
        <label class="form-label">Ma</label>
        <input type="text" class="form-control" name="ma" value="${mauSac.ma}">
    </div>
    <div class="mb-3">
        <label class="form-label">Ten</label>
        <input type="text" class="form-control" name="ten" value="${mauSac.ten}">
    </div>
    <button formaction="/mau-sac/add" type="submit" class="btn btn-primary">Add</button>
    <button formaction="/mau-sac/update/${mauSac.id}" type="submit" class="btn btn-primary">Update</button>

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
    <c:forEach items="${list}" var="mauSac">
        <tr>
            <td>${mauSac.id}</td>
            <td>${mauSac.ma}</td>
            <td>${mauSac.ten}</td>
            <td><a href="/mau-sac/delete/${mauSac.id}" class="btn btn-primary">Delete</a></td>
            <td><a href="/mau-sac/detail/${mauSac.id}" class="btn btn-primary">Detail</a></td>
            <td><a href="/hien-thi" class="btn btn-primary">Back Form</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>