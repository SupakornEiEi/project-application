<%-- 
    Document   : updateFood
    Created on : Jan 21, 2019, 7:50:23 PM
    Author     : Wasana Ngaogate
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@page import="model.Pets" %>

<h2>แก้ไขอาหาร</h2>

<%
    Pets pets = (Pets) session.getAttribute("food");
    out.println("ข้อมูลเดิม: " + pets.getName() + ", " + pets.getType());
    for(String n : pets.getNature()){
        out.print(n + " ");
    }
    out.println(pets.getLeg() + "," + pets.getPrice() + "<br/>");
%>

<form action="AddNewFood">
    <table>
        <tr><td>ชื่อ:</td>
            <td><input type="text" name="foodName" value="<%= pets.getName() %>"></td>
          <tr><td>ประเภท:</td>
            <td>
                <select name="petsType">
                    <option value="สัตว์ใหญ่">สัตว์ใหญ่</option>
                    <option value="สัตว์เล็ก">สัตว์เล็ก</option>
                    <option value="สัตว์ปีก">สัตว์ปีก</option>  
                </select>
            </td>
        </tr>
        <tr><td>ลักษณะ:</td>
            <td>
                <input type="checkbox" name="nature" value="ว่ายนํ้าได้">ว่ายนํ้าได้
                <input type="checkbox" name="nature" value="เลื้อยได้">เลื้อยได้<br>
                <input type="checkbox" name="nature" value="ครึ่งบกครึ่งนํ้า">ครึ่งบกครึ่งนํ้า
                <input type="checkbox" name="nature" value="บินได้">บินได้<br>
            </td>
        </tr>
        <tr><td>มีกี่ขา:</td>
            <td>
                <input type="radio" name="leg" value="หนึ่ง">หนึ่ง
                <input type="radio" name="leg" value="สอง">สอง
                <input type="radio" name="leg" value="มากกว่า2">มากกว่า2
            </td>
        </tr>
        <tr><td>ราคา:</td><td><input type="text" name="price" value="<%= pets.getPrice() %>"></td></tr>
        <tr><td>&nbsp;</td><td><input type="submit" value="เพิ่มอาหาร"></td></tr>
    </table>
</form>
        
<% session.removeAttribute("food"); %>
