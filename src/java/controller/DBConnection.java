package controller;

import java.sql.*;  // Using 'Connection', 'Statement' and 'ResultSet' classes in java.sql package
import java.util.Arrays;
import model.Pets;

public class DBConnection {

    public boolean insertNewPets(Pets pets) {
        boolean result = false;
        Connection connection = null;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Pets",
                    "root", "1234");

            Statement statement;
            statement = connection.createStatement();

            // สร้าง String nutrient ที่มีค่าสารอาหารต่าง ๆ คั่นด้วย ;
            String nature = "";
            int nl = pets.getNature().length;
            
            // วนลูปสร้างแค่ food.getNutrient().length ลบ 1 เพื่อไม่ให้มี ; ปิดท้าย String
            for(int i=0; i < nl - 1; i++){
                nature = nature + pets.getNature()[i] + ";";
            }
            // เพิ่มค่า nutrient ตำแหน่งสุดท้ายเข้าไป
            nature = nature + pets.getNature()[nl-1];
            
            String query = "INSERT INTO pets "
                    + "(name, type, nature, leg, price) "
                    + "VALUES('"
                    + pets.getName() + "','"
                    + pets.getType() + "','"
                    + nature + "','"
                    + pets.getLeg() + "',"
                    + pets.getPrice() + ")";
            System.out.println("........SQL: " + query);

            int i = statement.executeUpdate(query);	// executeUpdate returns row count ****
            if (i != 0) {
                result = true;
            }
            statement.close();
            connection.close();
        } catch (Exception exception) {
            System.out.println(exception);
        }

        return result;

    }

    /*
    https://www.geeksforgeeks.org/java-database-connectivity-with-mysql/
     */
    public void testRetrieve() {
        Connection connection = null;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Pets",
                    "root", "1234");

            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "select name from pets");
            String name;
            while (resultSet.next()) {
                name = resultSet.getString("name").trim();
                System.out.println(" name : " + name);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }

}
