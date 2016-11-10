package br.com.comercio.database;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {
    
    public static void main(String[] args) throws SQLException{
        Connection connection = Database.getConnection();
        System.out.println("conexão aberta");
        connection.close();
    }
}
