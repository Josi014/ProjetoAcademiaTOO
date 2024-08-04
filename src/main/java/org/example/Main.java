package org.example;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import com.academia.model.domain.Aluno;
import com.academia.model.domain.Professor;
import com.academia.repositories.service.AvaliacaoFisica;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        List<Aluno> aluno = new ArrayList<Aluno>();
        List<AvaliacaoFisica> novaListaAvaliacaoFisica = new ArrayList<AvaliacaoFisica>();
        List<Professor> novoProfessor = new ArrayList<Professor>();
        Aluno novoAluno = new Aluno(null, 0);
        AvaliacaoFisica novaAvaliacaoFisica = new AvaliacaoFisica();
        Professor professor = new Professor(null, 0.0, 0);
        int opcao;


        professor = new Professor("Maria", 60.0, 0);
        System.out.println("\nInforme as horas trabalhadas no formato horas:minutos (por exemplo, 220): ");
        professor.viraMes(sc.nextInt());
        novoProfessor.add(professor);
        System.out.println(professor.mostraInfoProfessor());


//        System.out.println("Informe seu nome: ");
//        professor.setNome(sc.nextLine());
//        System.out.println("Salário hora: ");
//        professor.setSalarioHora(sc.nextDouble());
//        novoProfessor.add(professor);


    }
}
