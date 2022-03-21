/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.Ex_InterArticolo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Catalogo<E extends Articolo> implements Iterable<E>{

    private final List<E> articoli = new ArrayList();

    public void aggiungiArticolo(E art) {
        //metodo che aggiunge un articolo al catalogo 
        articoli.add(art);

    }

    public List<E> getArticoliSottoPrezzo(double prezzo) {

        List<E> risultato = new ArrayList();
        return articoli.stream().filter(v -> v.getPrezzo()<=prezzo).collect(Collectors.toList());
       /* for (E a : articoli) {
            if (a.getPrezzo() <= prezzo) {
                risultato.add(a);
            }
        }
        return risultato;*/
    }

    public String toString() {
        // metodo che stampa intero catalogo

        List<E> catalogo = new ArrayList();
        StringBuilder ris= new StringBuilder();
        
        for (E a : articoli) {
            ris.append("\n").append(a.toString());
        }
        return ris.toString();
    }

    @Override
    public Iterator<E> iterator() {
    return articoli.iterator();   
    }

    public List<E> getArticoli() {
        return new ArrayList<>(articoli);
    }
    
    

}
