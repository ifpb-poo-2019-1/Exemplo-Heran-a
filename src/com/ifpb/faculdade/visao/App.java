package com.ifpb.faculdade.visao;

import com.ifpb.faculdade.modelo.*;

import java.time.LocalDate;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        Faculdade faculdade = new Faculdade("IFPB");

        Funcionario funcionario = new Professor("111.111.111-01",
                "João", LocalDate.now(), 2000,
                "Mestrado");

        faculdade.adicionarFuncionario(funcionario);

        faculdade.adicionarFuncionario(new Terceirizado("222.222.222-02",
                "Maria", LocalDate.now(), 2000,
                "Limpeza"));
        faculdade.adicionarFuncionario(new Tecnico("333.333.333-03",
                "Pedro", LocalDate.now(), 2000,
                "Coordenação de cursos"));

        funcionario.setNome("João Paulo");

        faculdade.atualizarFuncionario(funcionario);

        System.out.println(Arrays.toString(faculdade.listarFuncionarios()));

    }

}
