package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseService {

    private static DataBaseService instance;

    private static final String DB_URL = "jdbc:postgresql://localhost/postgres?currentschema=public";
    private static final String USER = "postgres";
    private static final String PASS = "Danieli123";
    // singleton pattern for database connection
    public static DataBaseService getInstance() {
        if (DataBaseService.instance == null) {
            DataBaseService.instance = new DataBaseService();
        }
        return DataBaseService.instance;
    }
    // method that utilizes the postgres jdbc driver to make a connection to the database,
    // or throws an exception if the connection cannot be made
    public Connection getConnection() {
        try {
            return DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
