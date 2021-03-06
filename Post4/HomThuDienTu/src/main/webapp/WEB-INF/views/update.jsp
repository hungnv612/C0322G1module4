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
    <form:form method="post" modelAttribute="email" action="/update">
        <form:hidden path="id"/>
        <table id="tables" class="table table-striped table-bordered" style="width:100%">
            <tr>
                <th>Languages</th>
                <td>
                    <form:select path="language" items="${languageArr}"/>
                </td>
            </tr>
            <tr>
                <th>Page size:</th>
                <td>Show
                    <form:select path="pageSize" items="${pageSizeArr}"/>
                    emails per page
                </td>
            </tr>
            <tr>
                <th>Spam filter:</th>
                <td>
                    <form:checkbox path="spamFilter"/> Enable spams filter
                </td>
            </tr>
            <tr>
                <th>Signature:</th>
                <td>
                        <form:textarea path="signature"/>
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <form:button>Update</form:button>
                </td>
            </tr>
        </table>

    </form:form>
</body>
</html>
