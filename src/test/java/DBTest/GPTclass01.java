package DBTest;

import java.sql.*;

public class GPTclass01 {



        public static void main(String[] args) {
            String url = "jdbc:mysql://3.239.253.255:3306/syntaxhrm_mysql";
            String username = "syntax_hrm";
            String password = "syntaxhrm123";

            try {
                // Establishing the connection
                Connection conn = DriverManager.getConnection(url, username, password);
                System.out.println("Connection to MySQL database has been established!");

                // Creating a statement
                Statement statement = conn.createStatement();

                // Executing the query
                ResultSet resultSet = statement.executeQuery("SELECT * FROM person");

                // Iterating through the result set and printing the values
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String firstName = resultSet.getString("firstname");
                    String lastName = resultSet.getString("lastname");
                    int age = resultSet.getInt("age");

                    System.out.println(id + ", " + firstName + ", " + lastName + ", " + age + "");
                }
            } catch (SQLException e) {
                System.out.println("Error connecting to MySQL database: " + e.getMessage());
            }
        }
    }



