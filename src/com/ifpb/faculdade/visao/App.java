package com.ifpb.faculdade.visao;

import com.ifpb.faculdade.modelo.Funcionario;
import com.ifpb.faculdade.modelo.Professor;
import com.ifpb.faculdade.modelo.Tecnico;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        Professor professor = new Professor("111.111.111-01",
                "João", LocalDate.now(), 2000,
                "Mestrado");

        Tecnico tecnico = new Tecnico("222.222.222-02",
                "Maria", LocalDate.now(), 2000,
                "Almoxarifado");

        professor.imprimirInfo();
        tecnico.imprimirInfo();

    }

}
