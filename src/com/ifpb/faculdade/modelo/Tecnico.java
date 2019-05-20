package com.ifpb.faculdade.modelo;

import java.time.LocalDate;

public class Tecnico extends Funcionario {

    private String setor;

    public Tecnico(String cpf, String nome, LocalDate nascimento, float salario, String setor) {
        super(cpf, nome, nascimento, salario);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
