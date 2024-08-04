package com.academia.model.domain;

import com.academia.repositories.service.AvaliacaoFisica;

import java.util.ArrayList;
import java.util.Date;

public class Aluno extends Pessoa {

    private int matricula;
    private ArrayList<AvaliacaoFisica> listaAvaliacoesFisicas;

    public Aluno(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
        listaAvaliacoesFisicas = new ArrayList<>();
    }

    public int getMatricula() {
        return matricula;
    }

    public String mostraHistoricoAvaliacoes() {
        String txt = "";

        for (int i = 0; i < listaAvaliacoesFisicas.size(); i++) {
            txt += "\n- " + listaAvaliacoesFisicas.get(i);
        }
        return txt;
    }

    public ArrayList<AvaliacaoFisica> getListaAvaliacoesFisicas() {
        return listaAvaliacoesFisicas;
    }

    public void addAvaliacaoFisica(AvaliacaoFisica avaliacaoFisica) {
        listaAvaliacoesFisicas.add(avaliacaoFisica);
        avaliacaoFisica.setAluno(this);
    }

    public void removeAvaliacaoFisica(AvaliacaoFisica avaliacaoFisica) {
        listaAvaliacoesFisicas.remove(avaliacaoFisica);
        avaliacaoFisica.setAluno(null);
    }

    @Override
    public String mostraInfo() {
        String txt = "\nMatricula: " + matricula;

        txt += "\n" + super.mostraInfo();

        txt += "\n Histórico de Avaliações: " + mostraHistoricoAvaliacoes();

        return txt;

    }

    public void informaDataNascimento() {
        super.dataNascimento = new Date();
    }

    @Override
    public void viraMes(Object af) {
        addAvaliacaoFisica((AvaliacaoFisica) af);
    }


}
