<%-- 
    Document   : addNewFood
    Created on : Jan 21, 2019, 7:25:31 PM
    Author     : Wasana Ngaogate
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h2>เพิ่มรองเท้า</h2>
<form action="AddNewFoodMySQL">
    <table>
        <tr><td>ไซส์ UK:</td><td><input type="text" name="petsName"></td>
        <tr><td>ประเภท:</td>
            <td>
                <select name="petsType">
                    <option value="แตะ">แตะ</option>
                    <option value="ผ้าใบ">ผ้าใบ</option>
                </select>
            </td>
        </tr>
        <tr><td>สี:</td>
            <td>
                <input type="checkbox" name="nature" value="น้ำเงิน">น้ำเงิน
                <input type="checkbox" name="nature" value="แดง">แดง<br>
                <input type="checkbox" name="nature" value="ดำ">ดำ
                <input type="checkbox" name="nature" value="ขาว">ขาว<br>
            </td>
        </tr>
        <tr><td>ลาย:</td>
            <td>
                <input type="radio" name="leg" value="ไม่มี">ไม่มี
                <input type="radio" name="leg" value="มี">มี
            </td>
        </tr>
        <tr><td>ราคา:</td><td><input type="text" name="price"></td></tr>
        <tr><td>&nbsp;</td><td><input type="submit" value="เพิ่มรองเท้า"></td></tr>
    </table>
</form>
