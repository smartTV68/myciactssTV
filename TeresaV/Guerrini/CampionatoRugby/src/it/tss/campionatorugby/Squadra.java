/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.campionatorugby;

/**
 *
 * @author tss
 */
public class Squadra {

    private String nome;
    private String sede;

    public Squadra(String nome, String sede) {
        this.nome = nome;
        this.sede = sede;
    }

    public String getNome() {
        return nome;
    }

    public String getSede() {
        return sede;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    String getCSV() {
        String file = nome + ";" + sede + "\n";
        return file;
    }

    String getInfo() {
        String ris = "";
        ris +=  nome + " - " + sede + "\n";
        return ris;
    }

}
