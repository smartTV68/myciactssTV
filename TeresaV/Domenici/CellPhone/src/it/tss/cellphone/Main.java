/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.cellphone;

/**
 *
 * @author tss
 */
public class Main {
    public static void main(String[] args) {
        Cellphone c1 = new Cellphone("TIM", "339345678");
        Cellphone c2 = new Cellphone("VODAFONE", "349112233");
        Cellphone c3 = new Cellphone("TRE", "336657321");
        
        Cellphone.setCost("TIM", "TIM", 0.5);
        Cellphone.setCost("TIM", "VODAFONE", 1.5);
        Cellphone.setCost("VODAFONE", "TIM", 0.8);
        
        System.out.println(c1.getCost(c2, 10));
        System.out.println(c2.getCost(c1, 10));
        
        //errori
        //System.out.println(c1.getCost(c3, 10));
        //  System.out.println(c3.getCost(c2, 10));
        
        
        
        
    }
}
