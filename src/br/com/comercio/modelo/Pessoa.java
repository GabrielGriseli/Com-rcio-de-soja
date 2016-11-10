package br.com.comercio.modelo;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    
    private Integer id;
    private String nome;
    private String CPF;
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

    public String getCPF() {
        return CPF;
    }   
}
