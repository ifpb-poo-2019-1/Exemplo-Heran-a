package com.ifpb.faculdade.modelo;

import java.util.Arrays;

public class Faculdade {

    private String nome;
    private Funcionario[] funcionarios;
    private int quantidade;

    public Faculdade(String nome){
        this.nome = nome;
        funcionarios = new Funcionario[100];
        quantidade = 0;
    }

    public boolean adicionarFuncionario(Funcionario funcionario){
        if(quantidade < funcionarios.length){
            funcionarios[quantidade++] = funcionario;
            return true;
        }else{
            return false;
        }
    }

    public Funcionario[] listarFuncionarios(){
        //equivalente: Arrays.copyOf(funcionarios,quantidade);
        return Arrays.copyOfRange(funcionarios,0,quantidade);
    }

    public int contProfessores(){
        int cont=0;
        for(int i=0;i<quantidade;i++){
            if(funcionarios[i].getClass()==Professor.class) cont++;
        }
        return cont;
    }

}
