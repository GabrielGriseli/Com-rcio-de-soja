package br.com.comercio.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:derby://localhost:1527/DB", "usuario", "senha");
    }
}
