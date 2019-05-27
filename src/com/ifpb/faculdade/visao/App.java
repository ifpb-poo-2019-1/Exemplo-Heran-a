package com.ifpb.faculdade.visao;

import com.ifpb.faculdade.modelo.Faculdade;
import com.ifpb.faculdade.modelo.Professor;
import com.ifpb.faculdade.modelo.Tecnico;
import com.ifpb.faculdade.modelo.Terceirizado;

import java.time.LocalDate;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        Faculdade faculdade = new Faculdade("IFPB");

        faculdade.adicionarFuncionario(new Professor("111.111.111-01",
                "João", LocalDate.now(), 2000,
                "Mestrado"));
        faculdade.adicionarFuncionario(new Terceirizado("222.222.222-02",
                "Maria", LocalDate.now(), 2000,
                "Limpeza"));
        faculdade.adicionarFuncionario(new Tecnico("333.333.333-03",
                "Pedro", LocalDate.now(), 2000,
                "Coordenação de cursos"));

        System.out.println(Arrays.toString(faculdade.listarFuncionarios()));

        System.out.println("Quantidade de professores: "+faculdade.contProfessores());

    }

}
