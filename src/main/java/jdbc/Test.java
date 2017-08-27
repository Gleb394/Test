package jdbc;

import java.sql.*;

public class Test {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName("org.postgresql.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection("jdbc:postgresql://ec2-54-75-231-195.eu-west-1.compute.amazonaws.com:5432/dhbactqe5p1j4?user=afovdtnoicigvz&password=5d5cd98f00a9ce156162338ce60ca00936f0b79df74e9a672a93bcfe776f935a&ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory");

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            String sql = "SELECT * FROM employee";
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                int age = rs.getInt("age");
                int salary = rs.getInt("salary");

                //Display values
                System.out.print("ID: " + id);
                System.out.print(", first name: " + firstName);
                System.out.print(", last name: " + lastName);
                System.out.print(", age: " + age);
                System.out.print(", salary: " + salary);
                System.out.println();
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
