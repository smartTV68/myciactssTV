/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodioverload;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class ProgDist3D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // voglio un metodo che mi chieda i numeri da inserire da 0 a 1000
        float x, y, z, v;
        x = Tool.insNumero("dimmi x:");
        y = Tool.insNumero("dimmi y:");
        z = Tool.insNumero("dimmi z:");

        float distanza = Tool.dist3D(x, y, z);
        System.out.println("x: :" + x);
        System.out.println("y: :" + y);
        System.out.println("z: :" + z);
        System.out.println("distanza: " + distanza);
        //chiedo le dimensioni degli array
        int dim1 = (int) Tool.insNumero("dimmi dim. 1: ");
        int dim2 = (int) Tool.insNumero("dimmi dim. 2: ");
        //creo array con cui lavorare
        int ar1[] = new int[dim1];
        int ar2[] = new int[dim2];
        int arUnito[] = new int[dim1 + dim2];
        
        ar1=Tool.caricaNumeriInt(ar1, 10);
        ar2=Tool.caricaNumeriInt(ar2, 5);
        arUnito= Tool.concatArrays(ar1,ar2);
        Tool.stampaArrays (arUnito);
        int trovato = Tool.cercaVirus(ar1, ar2);
     
        /*  x = Tool.insNumero();
        System.out.println(x);
        y = Tool.insNumero("dimmi y");
        System.out.println(y);
        z = Tool.insNumero("dimmi z", 2);
        System.out.println(z);
        v = Tool.insNumero("ins soldi ???");
        System.out.println(v);

        System.out.println(Tool.insGiorno(1));*/
    }

   

}
