package com.ifpb.faculdade.visao;

import com.ifpb.faculdade.modelo.Funcionario;
import com.ifpb.faculdade.modelo.Professor;
import com.ifpb.faculdade.modelo.Tecnico;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        Funcionario funcionario = new Professor("111.111.111-01",
                "João", LocalDate.now(), 2000,
                "Mestrado");

        Funcionario funcionario1 = new Professor("111.111.111-01",
                "João", LocalDate.now(), 2000,
                "Mestrado");

        System.out.println(funcionario == funcionario1);
        System.out.println(funcionario.equals(funcionario1));

    }

}
