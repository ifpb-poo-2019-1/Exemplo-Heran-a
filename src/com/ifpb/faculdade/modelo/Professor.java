package com.ifpb.faculdade.modelo;

import java.time.LocalDate;

public class Professor extends Funcionario {

    private String titulacao;

    public Professor(String cpf, String nome, LocalDate nascimento, float salario, String titulação) {
        super(cpf, nome, nascimento, salario);
        this.titulacao = titulação;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

}
