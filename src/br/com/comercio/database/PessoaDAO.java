package br.com.comercio.database;

import br.com.comercio.modelo.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
    
    public Pessoa findById(Integer id) throws SQLException{
        String sql = "Select * from Pessoas p where p.id = ?";
        Pessoa pessoa = null;
        
        try(PreparedStatement stm = con.prepareStatement(sql)){
            stm.setInt(1, id);
            stm.execute();
            
            try(ResultSet resultSet = stm.getResultSet()){
                while(resultSet.next()){
                    pessoa = new Pessoa();
                    pessoa.setId(resultSet.getInt("id"));
                    pessoa.setNome(resultSet.getString("nome"));
                    pessoa.setSaldo(resultSet.getInt("saldo"));
                }
            }
        }
        
        return pessoa;
    }
    
    public List<Pessoa> findByNome(String nome) throws SQLException{
        String sql = "Select * from Pessoasp where upper(p.nome) like ?";
        List<Pessoa> pessoas = new ArrayList<>();
        Pessoa pessoa = null;
        
        try(PreparedStatement stm = con.prepareStatement(sql)){
            stm.setString(1, "%" + nome.toUpperCase() + "%");
            stm.execute();
            
            try(ResultSet resultSet = stm.getResultSet()){
                while(resultSet.next()){
                    pessoa = new Pessoa();
                    pessoa.setId(resultSet.getInt("id"));
                    pessoa.setNome(resultSet.getString("nome"));
                    pessoa.setSaldo(resultSet.getInt("saldo"));
                    pessoas.add(pessoa);
                }
            } 
        }
        
        return pessoas;
    }
    
    public void update(Pessoa pessoa) throws SQLException{
        String sql = "update Pessoas set nome = ?, saldo = ? where id = ?";
        
        try (PreparedStatement stm = con.prepareStatement(sql)){
            stm.setString(1, pessoa.getNome());
            stm.setInt(2, pessoa.getSaldo());
            stm.setInt(3, pessoa.getId());
            stm.executeUpdate();
            
            con.commit();
        }
        catch (Exception ex){
            System.out.println("Erro ao tentar executar atualização: " + ex.getMessage());
            con.rollback();
        }
    }
    
    public void delete(Pessoa pessoa) throws SQLException{
        String sql = "delete from Pessoas where id = ?";
        
        try (PreparedStatement stm = con.prepareStatement(sql)){
            stm.setInt(1, pessoa.getId());
            stm.executeUpdate();
            
            con.commit();
        }
        catch(Exception ex){
            System.out.println("Erro ao tentar excluir: " + ex.getMessage());
            con.rollback();
        }
    }
}
