package br.com.comercio.database;

import br.com.comercio.modelo.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PessoaDAO {
    
    private Connection con;
    
    public PessoaDAO(Connection con){
        this.con = con;
    }
    
    public Integer create(Pessoa pessoa) throws SQLException{
        String sql = "insert into Pessoas(nome, saldo) values(?, ?)";
        Integer idCriado = 0;
        
        try (PreparedStatement stm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            stm.setString(1, pessoa.getNome());
            stm.setInt(2, pessoa.getSaldo());
            stm.execute();
            
            try (ResultSet resultSet = stm.getGeneratedKeys()){
                while (resultSet.next())
                    idCriado = resultSet.getInt(1);
            }
            con.commit();
        }
        catch (Exception ex){
            System.out.println("Erro ao tentar executar inserção: " + ex.getMessage());
            con.rollback();
        }
        
        return idCriado;
    }
}
