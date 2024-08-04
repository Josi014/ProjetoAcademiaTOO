package com.academia.model.domain;

import java.text.DecimalFormat;
import java.util.Date;

abstract class Pessoa {
    protected String nome;
    protected Date dataNascimento;
    private String CPF;


    public Pessoa(String nome){
        this.nome = nome;

    }

    public String mostraInfo(){
        DecimalFormat formatoNum = new DecimalFormat("0.0#");


        String txt = "Nome: "+nome;
        txt += "\n Data Nascimento: "+dataNascimento;
        txt += "\n CPF: "+CPF;

        return txt;
    }


    public String getNome(){
        return nome;
    }
    public String getCPF(){
        return CPF;
    }
    public Date getDataNascimento(){
        return dataNascimento;
    }


    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public void setDataNascimento(Date dataNasc){
        dataNascimento = dataNasc;
    }

    @Override
    public String toString() {
        return nome+(CPF!=null?": "+getCPF():"");
    }


    public abstract void viraMes(Object obj);
}

