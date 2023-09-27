<%-- 
    Document   : addNewFoodSuccess
    Created on : Jul 16, 2023, 1:23:02 PM
    Author     : wasana.ngaogate
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Pets, java.util.Arrays" %>

<h2>เพิ่มรองเท้าสำเร็จ</h2>
<%
    Pets pets = (Pets) session.getAttribute("pets");
%>
ไซส์: <%= pets.getName() %><br/>
ประเภท: <%= pets.getType() %><br/>
สี: <%= Arrays.toString(pets.getNature()) %><br/>
ลาย: <%= pets.getLeg() %><br/>
ราคา: <%= pets.getPrice() %><br/>
</table>

