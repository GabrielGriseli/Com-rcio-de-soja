package br.com.comercio.modelo;

import java.util.Date;

public class Movimento {
    
    private Date data;
    private String ope;
    private Integer quant;
    private Integer id;
    private Integer id_pessoa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getOpe() {
        return ope;
    }

    public void setOpe(String ope) {
        this.ope = ope;
    }

    public Integer getQuant() {
        return quant;
    }
    
    public void setQuant(Integer quant){
        this.quant = quant;
    }

    public Integer getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(Integer id_pessoa) {
        this.id_pessoa = id_pessoa;
    }
    
    public Integer depositar(Integer id, Date data, String ope, Integer quant, Integer saldo){
        this.id = id;
        this.data = data;
        this.ope = ope;
        this.quant = quant;
        
        return saldo + quant;
        ///testar se a pessoa tentar depositar um numero negativo de sacas
    }
    
    public Integer sacar(Integer id, Date data, String ope, Integer quant, Integer saldo){
        this.id = id;
        this.data = data;
        this.ope = ope;
        this.quant = quant;
        
        return saldo - quant;
        ///testar se a pessoa pode sacar o valor
        ///tentar sacar o valor em dinheiro e não em sacos de soja
    }
}
