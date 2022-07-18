
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 15/07/2022
  Time: 09:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Display email</title>
</head>
<body>
<h2></h2>
<table id="tables" class="table table-striped table-bordered" style="width:100%">
    <tr>
        <td>ID</td>
        <td>NAME</td>
        <td>DATE</td>
        <td>VEHICLE</td>
        <td>DATESTAR</td>
        <td>DATEEND</td>
        <td>NOTE</td>
        <td>Edit</td>
    </tr>
    <c:forEach items="${allList}" var="list">
        <tr>
            <td>${list.id}</td>
            <td>${list.name}</td>
            <td>${list.date}</td>
            <td>${list.vehicle}</td>
            <td>${list.dateStar}</td>
            <td>${list.dateEnd}</td>
            <td>${list.note}</td>

            <td>
                <a href="/update?id=${list.id}">
                    <input type="button" value="Edit">
                </a>
            </td>
        </tr>
    </c:forEach>

</table>
<a href="/create"><h4>Create</h4></a>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>
