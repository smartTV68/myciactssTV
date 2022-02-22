/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.cellphone;

import java.util.Objects;

/**
 *
 * @author tss
 */
public class Tariffa {

    private String from;
    private String to;
    private double costo;


    public Tariffa(String from, String to, double costo) {
        this.from = from;
        this.to = to;
        this.costo = costo;

    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public double getCosto() {
        return costo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.from);
        hash = 67 * hash + Objects.hashCode(this.to);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.costo) ^ (Double.doubleToLongBits(this.costo) >>> 32));
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
        final Tariffa other = (Tariffa) obj;
        if (Double.doubleToLongBits(this.costo) != Double.doubleToLongBits(other.costo)) {
            return false;
        }
        if (!Objects.equals(this.from, other.from)) {
            return false;
        }
        if (!Objects.equals(this.to, other.to)) {
            return false;
        }
        return true;
        
        
        
    }

    @Override
    public String toString() {
        return "Tariffa{" + "from=" + from + ", to=" + to + ", costo=" + costo + '}';
    }

    

    

  

    
}
