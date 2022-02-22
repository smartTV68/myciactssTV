/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.gestioneprodotti;

import java.time.format.DateTimeFormatter;

/**
 *
 * @author tss
 */
public class Prodotto {
   private final int ID_Prodotto;
   private String nome_Prodotto;
   private float costo;
  
   

    public Prodotto(int ID_Prodotto, String nome_Prodotto, float costo) {
        this.ID_Prodotto = ID_Prodotto;
        this.nome_Prodotto = nome_Prodotto;
        this.costo = costo;
    }

    public int getID_Prodotto() {
        return ID_Prodotto;
    }

    public String getNome_Prodotto() {
        return nome_Prodotto;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
     String getInfo() {
        String ris = "";
        ris += "----------Scheda Prodotto----------";
        ris += "\n ID Prodotto: " + ID_Prodotto;
        ris += "\n Nome Prodotto " + nome_Prodotto;
        ris += "\n Costo: " + costo;
              
        return ris;
    }
   
   void stampaInfo() {

        System.out.println("\n\n----------Scheda Prodotto----------");
        System.out.println("ID Prodotto: " + ID_Prodotto);
        System.out.println("Nome Prodotto: " + nome_Prodotto);
        System.out.println("Costo: " + costo);
       
    }
   
   
    /**
     * ritorna un csv con i corsi testata nomecorso;durataore;descrizione;
     *
     * @return
     */
    String getCSV() {
        String ris = "";
        //le intestazioni di colonna che andranno però inserite in metodo salvaCorsi CSV
        //= "nomecorso;durataore;descrizione;datainizio;link;\n";
        String listaprodotti = "";
        for (Prodotto pr : WinGestioneProdotto.listaprodotti) {
            WinGestioneProdotto.listaprodotti += pr.getId_anagrafica() + ",";
        }
        if (listaregistro.length() > 0) {
            listaregistro = listaregistro.substring(0, listaregistro.length()-1);
        }

        ris += nomecorso + ";" + durataore + ";" + descrizione + ";"
                + datainizio.toString() + ";" + link + ";" + listaregistro + "\n";

        return ris;
    } 
   
   
}
