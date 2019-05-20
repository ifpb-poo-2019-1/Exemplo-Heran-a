package com.ifpb.faculdade.modelo;

import java.time.LocalDate;

public class Terceirizado extends Funcionario {

    private String empresa;

    public Terceirizado(String cpf, String nome, LocalDate nascimento, float salario, String empresa) {
        super(cpf, nome, nascimento, salario);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
