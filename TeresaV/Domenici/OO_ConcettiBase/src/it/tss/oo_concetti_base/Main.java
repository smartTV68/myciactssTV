/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.oo_concetti_base;

/**
 *
 * @author tss
 */
public class Main {

    public static void main(String[] args) {
        A a = new A();
        a.m1();

        B b = new B();
        b.m3();

        A aa = new B(); //SI siccome B estende A allora B è A non è vero il contrario
        //B bb = new A(); NO

        ((B) aa).m3();// faccio il casting di B in aa per solo in questo momento usarlo

        if (aa instanceof B) {
            System.out.println("aa contiene un oggetto di tipo B");
        } else {
            System.out.println("aa non contiene un oggetto di tipo B");
        }
        C c = new C();
        c.m2();

        
        aa.m2();// corrisponde a B che corrisponde ad A
        aa = new C();
        aa.m2(); //qui invece corrisponde a C

    }

}
