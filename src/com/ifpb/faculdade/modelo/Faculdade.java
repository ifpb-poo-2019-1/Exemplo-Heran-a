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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public boolean deletarFuncionario(Funcionario funcionario){
        for(int i=0; i<quantidade;i++){
            //deslocar todos os elementos uma posição à esquerda
            if(funcionarios[i].equals(funcionario)){
                for(int j=i;j<quantidade-1;j++){
                    funcionarios[j] = funcionarios[j+1];
                }
                quantidade--;
                return true;
            }
        }
        return false;
    }

    public boolean atualizarFuncionario(Funcionario funcionario){
        for(int i=0;i<quantidade;i++){
            if(funcionarios[i].getCpf().equals(funcionario.getCpf())){
                funcionarios[i] = funcionario;
                return true;
            }
        }
        return false;
    }

}
