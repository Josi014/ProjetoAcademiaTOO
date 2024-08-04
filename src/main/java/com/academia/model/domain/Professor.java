package com.academia.model.domain;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Professor extends Pessoa {
    private Date dataAdmissao;
    private double salarioHora;

    private SimpleDateFormat mascaraData = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    List<Double> historicoFolhaPagamento = new ArrayList<Double>();
    List<Integer> listaHorasTrabalhadasMes = new ArrayList<Integer>();

    private int horasTrabalhadasMes;
    private Date data = new Date();


    public Professor(String nome, double salario, int horas) {
        super(nome);
        this.horasTrabalhadasMes = horas;
        dataAdmissao = new Date();
        salarioHora = salario;
    }

    public Date getDataAdmisao() {
        return dataAdmissao;
    }

    public double getSalarioHora() {
        return salarioHora;
    }


    public String mostraHistoricoPagamento() {
        String txt = "";

        for (int i = 0; i < historicoFolhaPagamento.size(); i++) {
            txt += "\n- " + historicoFolhaPagamento.get(i);
        }
        return txt;
    }

    public String mostraHistoricoHorasTrabalhadas() {
        String txt = "";

        for (int i = 0; i < listaHorasTrabalhadasMes.size(); i++) {
            txt += "\n- " + listaHorasTrabalhadasMes.get(i);
        }
        return txt;
    }


    public String mostraInfoProfessor() {
        DecimalFormat formatoNum = new DecimalFormat("0.0#");

        String txt = "Data da folha gerada: " + mascaraData.format(data);
        txt += "\n" + nome;
        txt += "\nHistórico de horas: " + mostraHistoricoHorasTrabalhadas();
        txt += "\nHistórico folha pagamento: " + mostraHistoricoPagamento();

        return txt;
    }


    public void viraMes(Object horasTrabalhadasMes) {
        if (horasTrabalhadasMes instanceof Integer) {
            Integer horasTrabalhadas = (Integer) horasTrabalhadasMes;
            double salarioFinal = horasTrabalhadas * getSalarioHora();
            historicoFolhaPagamento.add(salarioFinal);
            listaHorasTrabalhadasMes.add(horasTrabalhadas);
            System.out.println("Salário deste mês: " + salarioFinal);

        } else {
            System.out.println("O objeto não é do tipo Integer.");
        }
    }


    @Override
    public String toString() {
        return mascaraData.format(dataAdmissao);
    }
}


