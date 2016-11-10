package br.com.comercio.database;

import br.com.comercio.modelo.Movimento;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MovimentoDAO {
    
    private Connection con;
    
    public MovimentoDAO(Connection con){
        this.con = con;
    }
    
    public Integer create(Movimento movimento) throws SQLException{
        String sql = "insert into Movimentos (data, ope, quant) values(?,?,?)";
        Integer idCriado = 0;
        try (PreparedStatement stm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            
            java.sql.Date dataSQL = new java.sql.Date(movimento.getData().getTime());
            
            stm.setDate(1, dataSQL);
            stm.setString(2, movimento.getOpe());
            stm.setInt(3, movimento.getQuant());
            stm.execute();
            
            try (ResultSet resultSet = stm.getGeneratedKeys()){
                while (resultSet.next())
                    idCriado = resultSet.getInt(1);
            }
            con.commit();
        }catch(Exception ex){
            System.out.println("Erro ao tentar executar insercao" + ex.getMessage());
            con.rollback();
        }
        
        return idCriado;
    }
}
