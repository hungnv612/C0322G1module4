<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 15/07/2022
  Time: 08:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Update Email</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<h2>Settings</h2>
<form:form method="post" modelAttribute="declaration" action="/update">
    <form:hidden path="id"/>
    <table >
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
</body>
</html>
