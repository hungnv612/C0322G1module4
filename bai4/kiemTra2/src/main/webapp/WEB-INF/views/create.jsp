<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 18/07/2022
  Time: 3:14 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="declaration" method="post" action="/save">

    <table >
        <tr>
            <th>id</th>
            <td>
                <form:input path="id"/>
            </td>
        </tr>
        <tr>
            <th>name</th>
            <td>
                <form:input path="name"/>
            </td>
        </tr>
        <tr>
            <th>date:</th>
            <td>
                <form:select path="date" items="${five}"/>
            </td>
        </tr>
        <tr>
            <th>vehicle:</th>
            <td>
                <form:checkboxes path="vehicle" items="${vehicle}"/>
            </td>
        </tr>
        <tr>
            <th>dateStar:</th>
            <td>
                <form:select path="dateStar" items="${dateStar}"/>
            </td>
        </tr>
        <tr>
            <th>dateEnd:</th>
            <td>
                <form:select path="dateEnd" items="${dateEnd}"/>
            </td>
        </tr>
        <tr>
            <th>note:</th>
            <td>
                <form:select path="note" items="${wentTo}"/>
            </td>
        </tr>

        <tr>
            <td></td>
            <td>
                <form:button>Create</form:button>
            </td>
        </tr>
    </table>
</form:form>
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
