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
}
