package Hotel.Management.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Con {
    Connection connection; // Correct the case
    Statement statement;   // Correct the case

    public Con() { // Constructor name matches class name
        try {
            // Establish the database connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelMS", "root", "Umabhi@319");
            statement = connection.createStatement();
        } catch (Exception e) {
            // Print the stack trace if an exception occurs
            e.printStackTrace();
        }
    }
}
