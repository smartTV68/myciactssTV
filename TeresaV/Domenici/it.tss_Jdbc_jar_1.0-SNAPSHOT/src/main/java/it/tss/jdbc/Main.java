/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package it.tss.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author tss
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306";
            try (Connection connection = DriverManager.getConnection(url, "tss", "ghiglieno")) {
                //apro la connessione
                System.out.println("Connessione ok");
                connection.setCatalog("DBScuola");
                //con statement mi collego alla tabella
                Statement cmd = connection.createStatement();
                try ( //resulset crea tabella in locale in base a ns richiesta
                        ResultSet rs = cmd.executeQuery("select * from t_corsi")) {
                    while (rs.next()){
                        //metodo next ritorna vero se c'è qualciosa da legegre e sposta
                        //il cursore sulla prima riga da leggere
                        System.out.println(rs.getString("titolo_corso"));
                        //rs.getString()una volta sulla riga tira fuori il dato prescelto e richiesto
                        System.out.println(rs.getInt("id_corso"));
                        System.out.println(1);//legge prima colonna
                    }
                }
            }
        } catch(SQLException ex) {
            System.out.println("Errore..." + ex);

        }
    }

}
