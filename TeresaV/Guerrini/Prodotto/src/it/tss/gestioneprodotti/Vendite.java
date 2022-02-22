/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.gestioneprodotti;

import java.time.LocalDate;

/**
 *
 * @author tss
 */
public class Vendite {
    private int idVendita;
    private float PrezzoIvato;
    private int quantità;
    private LocalDate datavendita= LocalDate.now();

    public Vendite(int idVendita, float PrezzoIvato, int quantità) {
        this.idVendita = idVendita;
        this.PrezzoIvato = PrezzoIvato;
        this.quantità = quantità;
        
    }

    public int getIdVendita() {
        return idVendita;
    }

    public float getPrezzoIvato() {
        return PrezzoIvato;
    }

    public void setPrezzoIvato(float PrezzoIvato) {
        this.PrezzoIvato = PrezzoIvato;
    }

    public int getQuantità() {
        return quantità;
    }

    public void setQuantità(int quantità) {
        this.quantità = quantità;
    }

    public LocalDate getDatavendita() {
        return datavendita;
    }


  
    
}
