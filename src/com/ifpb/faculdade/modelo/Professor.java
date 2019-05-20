package com.ifpb.faculdade.modelo;

import java.time.LocalDate;

public class Professor extends Funcionario {

    private String titulação;

    public Professor(String cpf, String nome, LocalDate nascimento, float salario, String titulação) {
        super(cpf, nome, nascimento, salario);
        this.titulação = titulação;
    }

    public String getTitulação() {
        return titulação;
    }

    public void setTitulação(String titulação) {
        this.titulação = titulação;
    }
}
