package br.com.comercio.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    
    public static Connection getConnection() throws SQLException{
        Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/DB", "usuario", "senha");
        return connection;
    }
}
