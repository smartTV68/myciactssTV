/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.cellphone;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author tss
 */
public class Cellphone {
    private final String gestore;
    private final String num;
    
    private static class Tariffa{
        private final String from;
        private final String to;
        private final double cost;

        public Tariffa(String from, String to, double cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
        
        
    }

    private static final List<Tariffa> tariffe= new ArrayList<>();
    
    public Cellphone(String gestore, String num) {
        this.gestore = gestore;
        this.num = num;
    }

    
    public static void setCost(String from, String to, double cost){
        tariffe.add(new Tariffa(from, to, cost));
    }
    
    public double getCost(Cellphone to, int durataMinuti){
        for (Tariffa tariffa : tariffe) {
            if(tariffa.from.equals(this.gestore) && tariffa.to.equals(to.getGestore())){
                return tariffa.cost * durataMinuti;
            }
        }
        throw new RuntimeException("Tariffa non trovata");
    }
    /*
    getter setter
    */
    public String getGestore() {
        return gestore;
    }

    public String getNum() {
        return num;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.gestore);
        hash = 31 * hash + Objects.hashCode(this.num);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CellPhone other = (CellPhone) obj;
        if (!Objects.equals(this.gestore, other.gestore)) {
            return false;
        }
        if (!Objects.equals(this.num, other.num)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CellPhone{" + "gestore=" + gestore + ", num=" + num + '}';
    }

   
    
    
}
