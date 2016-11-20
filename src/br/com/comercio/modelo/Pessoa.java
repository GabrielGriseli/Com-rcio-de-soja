package br.com.comercio.modelo;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private Integer id;
    private String nome;
    private Integer saldo = 0;
    private List<Movimento> lancamentos = new ArrayList<Movimento>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public void depositar(Integer valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException();
        } else {
            this.saldo += valor;    
        }    
    }

    public void sacar(Integer valor) {
        if (saldo < valor) {
            throw new IllegalArgumentException();
        } else {
            saldo -= valor;
        }
    }
}
