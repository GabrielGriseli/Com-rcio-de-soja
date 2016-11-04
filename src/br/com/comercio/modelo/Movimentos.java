package br.com.comercio.modelo;

import java.util.Date;

public class Movimentos {
    
    private Integer id;
    private Date data;
    private char ope;
    private Integer quant;
    
    public Integer depositar(Integer id, Date data, char ope, Integer quant, Integer saldo){
        this.id = id;
        this.data = data;
        this.ope = ope;
        this.quant = quant;
        
        return saldo + quant;
        ///testar se a pessoa tentar depositar um numero negativo de sacas
    }
    
    public Integer sacar(Integer id, Date data, char ope, Integer quant, Integer saldo){
        this.id = id;
        this.data = data;
        this.ope = ope;
        this.quant = quant;
        
        return saldo - quant;
        ///testar se a pessoa pode sacar o valor
        ///tentar sacar o valor em dinheiro e não em sacos de soja
    }
}
