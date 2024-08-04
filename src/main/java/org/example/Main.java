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

        do {
            System.out.println("\nEscolha uma das seguintes opções: \n0.Sair\n1.Cadastrar novo Aluno\n2.Cadastrar novo professor\n3.Acessar informações cadastrais do aluno\n4.Acessar dados cadastrais do professor");
            opcao = sc.nextInt();
            switch (opcao) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    sc.nextLine();
                    System.out.println("Informe o nome do aluno: ");
                    novoAluno.setNome(sc.nextLine());
//                    System.out.println("Informe a  data de nascimento (dd/MM/yyyy) do aluno: ");
//                    String dataNascimentoAlunoStr = sc.nextLine();
//                    try {
//                        Date dataNascimentoAluno = formato.parse(dataNascimentoAlunoStr);
//                        novoAluno.setDataNascimento(dataNascimentoAluno);
//                    } catch (ParseException e) {
//                        System.out.println("Formato de data inválido. Por favor, use dd/MM/yyyy.");
//                        return;
//                    }
//                    System.out.println("Informe CPF do aluno: ");
//                    novoAluno.setCPF(sc.nextLine());
                      aluno.add(novoAluno);


                    System.out.println("Informe a altura: ");
                    novaAvaliacaoFisica.setAltura(sc.nextDouble());
                    sc.nextLine();
                    System.out.println("Informe o peso: ");
                    novaAvaliacaoFisica.setPeso(sc.nextDouble());
                    novoAluno.addAvaliacaoFisica(novaAvaliacaoFisica);
                    break;
                case 2:
                    professor = new Professor("Maria", 60.0, 0);
                    System.out.println("\nInforme as horas trabalhadas no formato horas:minutos (por exemplo, 220): ");
                    professor.viraMes(sc.nextInt());
                    novoProfessor.add(professor);
                    break;
                case 3:
                    System.out.println(novoAluno.mostraInfo());
                    System.out.println("Deseja acessar a avaliação física do aluno? Y/N");
                    char op = sc.next().charAt(0);
                    if (op == 'Y' || op == 'y') {
                        System.out.println(novaAvaliacaoFisica.mostraAvaliacao());
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    System.out.println(professor.mostraInfoProfessor());
                    break;
            }
        } while (opcao != 0);



//        System.out.println("Informe seu nome: ");
//        professor.setNome(sc.nextLine());
//        System.out.println("Salário hora: ");
//        professor.setSalarioHora(sc.nextDouble());
//        novoProfessor.add(professor);


    }
}
