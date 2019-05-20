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

    @Override
    public void imprimirInfo(){
        System.out.println("CPF: "+getCpf());
        System.out.println("Nome: "+getNome());
        System.out.println("Nascimento: "+getNascimento());
        System.out.println("Salário: "+getSalario());
        System.out.println("Setor: "+setor);
    }

}
