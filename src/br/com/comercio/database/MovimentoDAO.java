package br.com.comercio.database;

import br.com.comercio.modelo.Movimento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MovimentoDAO {
    
    private Connection con;
    
    public MovimentoDAO(Connection con){
        this.con = con;
    }
    
    public Integer create(Movimento movimento) throws SQLException{
        String sql = "insert into Movimentos (data, ope, quant, id_pessoa) values(?, ?, ?, ?)";
        Integer idCriado = 0;
        try (PreparedStatement stm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            
            java.sql.Date dataSQL = new java.sql.Date(movimento.getData().getTime());   ///converte a Data do Java para a Data do Banco de Dados para depois gravar.
            
            stm.setDate(1, dataSQL);
            stm.setString(2, movimento.getOpe());
            stm.setInt(3, movimento.getQuant());
            stm.setInt(4, movimento.getId_pessoa());
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
    
    public List<Movimento> findyById_pessoa(Integer id_pessoa) throws SQLException{
        String sql = "Select * from Movimentos m where m.id_pessoa = ?";
        List<Movimento> movimentos = new ArrayList<>();
        Movimento movimento = null;
        
        try (PreparedStatement stm = con.prepareStatement(sql)){
            stm.setInt(1, id_pessoa);
            stm.execute();
            
            try (ResultSet resultSet = stm.getResultSet()){
                while (resultSet.next()){
                    movimento = new Movimento();
                    movimento.setId(resultSet.getInt("id"));  //pode ser maiusculo
                    movimento.setData(resultSet.getDate("data"));
                    movimento.setOpe(resultSet.getString("ope"));
                    movimento.setQuant(resultSet.getInt("quant"));
                    movimentos.add(movimento);
                }
            }
        }
        
        return movimentos;
    }
    
    public void delete(Movimento movimento) throws SQLException{
        String sql = "delete from Movimentos where id_pessoa = ?";
        
        try (PreparedStatement stm = con.prepareStatement(sql)){
            stm.setInt(1, movimento.getId_pessoa());
            stm.executeUpdate();
            
            con.commit();
        }
        catch(Exception ex){
            System.out.println("Erro ao tentar excluir: " + ex.getLocalizedMessage());
            con.rollback();
        }
    }
}
