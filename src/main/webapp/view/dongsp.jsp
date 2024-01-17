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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<form action="" method="post">
    <div class="mb-3">
        <label class="form-label">Id</label>
        <input type="text" class="form-control" name="id" value="${dongSP.id}" disabled>
    </div>
    <div class="mb-3">
        <label class="form-label">Ma</label>
        <input type="text" class="form-control" name="ma" value="${dongSP.ma}">
    </div>
    <div class="mb-3">
        <label class="form-label">Ten</label>
        <input type="text" class="form-control" name="ten" value="${dongSP.ten}">
    </div>
    <button formaction="/dong-sp/add" type="submit" class="btn btn-primary">Add</button>
    <button formaction="/dong-sp/update/${dongSP.id}" type="submit" class="btn btn-primary">Update</button>

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
    <c:forEach items="${list}" var="dongSP">
        <tr>
            <td>${dongSP.id}</td>
            <td>${dongSP.ma}</td>
            <td>${dongSP.ten}</td>
            <td><a href="/dong-sp/delete/${dongSP.id}" class="btn  btn-primary">Delete</a></td>
            <td><a href="/dong-sp/detail/${dongSP.id}" class="btn btn-primary">Detail</a></td>
            <td><a href="/hien-thi" class="btn btn-primary">Back Form</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<nav aria-label="Page navigation example">
    <ul class="pagination">
        <c:forEach begin="1" end="${totalPage}" varStatus="status">
            <li class="page-item"><a class="page-link"
                                     href="/dong-sp/hien-thi?pageNum=${status.index}">${status.index}</a></li>
        </c:forEach>
    </ul>
</nav>
</body>
</html>