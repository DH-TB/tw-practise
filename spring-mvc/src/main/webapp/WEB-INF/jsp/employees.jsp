<%@ page import="java.util.List" %>
<%@ page import="com.example.employeeapi.model.Employee" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>员工列表</title>
    <style>
        td, th {
            padding: 10px 120px;
        }

        table {
            margin-left: 10%;
            border-collapse: collapse;
            border-color:black;
            font-size: 20px;
        }

        tr:nth-child(2n) {
            background: #e7e7e7;
        }
    </style>
</head>
<body>

<div>
    <table border="1">
        <tr style="background-color: black;color: white">
            <th><%="编号"%></th>
            <th><%="姓名"%></th>
            <th><%="年龄"%></th>
            <th><%="性别"%></th>
        </tr>
        <tr>
            <%
                List<Employee> resultList = (List<Employee>) request.getAttribute("message");
                for (int i = 0; i < resultList.size(); i++) {
                    Employee data = resultList.get(i);
            %>
            <td><%=data.getId()%></td>
            <td><%=data.getName()%></td>
            <td><%=data.getAge()%></td>
            <td><%=data.getGender()%></td>
        </tr>
        <%
            }
        %>

    </table>

</div>
</body>
</html>


