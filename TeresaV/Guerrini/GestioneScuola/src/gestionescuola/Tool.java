/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionescuola;

/**
 *
 * @author tss
 */
public class Tool {

    String checkTel(String tel) {
        String ris = "";
        //tolgo gli spazi
        tel = tel.replace(" ", "");
        //tolgo trattini
        tel = tel.replace("-", "");
        //tolgo slash ecc
        tel = tel.replace("/", "");
        tel = tel.replace(".", "");
        tel = tel.replace(",", "");
        tel = tel.replace("(", "");
        tel = tel.replace(")", "");
        try {
            long lungtel = Long.parseLong(tel);
            String tre = tel.substring(0, 3);
            if (tre.equals("+39")) {
                ris = tel;
            } else {
                ris = "+39" + tel;
            }

        } catch (Exception e) {
            ris = "";
        }

        return ris;
    }

      String checkTel(String tel, String pref) {
        String ris = "";
        //tolgo gli spazi
        tel = tel.replace(" ", "");
        //tolgo trattini
        tel = tel.replace("-", "");
        //tolgo slash ecc
        tel = tel.replace("/", "");
        tel = tel.replace(".", "");
        tel = tel.replace(",", "");
        tel = tel.replace("(", "");
        tel = tel.replace(")", "");
        try {
            long lungtel = Long.parseLong(tel);
            String tre = tel.substring(0, 3);
            if (tre.equals(pref)) {
                ris = tel;
            } else {
                ris = pref+ tel;
            }

        } catch (Exception e) {
            ris = "";
        }

        return ris;
    }
    
    
}
