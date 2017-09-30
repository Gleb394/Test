package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private ConnectionFactory() {}

    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://ec2-54-75-231-195.eu-west-1.compute.amazonaws.com:5432/dhbactqe5p1j4?user=afovdtnoicigvz&password=5d5cd98f00a9ce156162338ce60ca00936f0b79df74e9a672a93bcfe776f935a&ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
