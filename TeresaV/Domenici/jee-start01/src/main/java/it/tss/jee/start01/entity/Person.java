/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.jee.start01.entity;

import java.io.Serializable;
import java.time.LocalDate;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.bind.Jsonb;
import javax.json.bind.annotation.JsonbAnnotation;
import javax.json.bind.annotation.JsonbDateFormat;
import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;
import javax.json.bind.annotation.JsonbTransient;
import javax.ws.rs.Path;

/**
 *
 * @author tss
 */
@JsonbPropertyOrder({"id", "cognome", "nome","eta", "datacreazione"})
public class Person implements Serializable {
    
    @JsonbTransient // esclude una proprietà dalla conversione
    private int id;
    @JsonbProperty(value = "last_name")
    private String cognome;
    @JsonbProperty(value = "first_name")
    private String nome;
    @JsonbProperty(value = "age")
    private int age;
        @JsonbProperty(value = "creation_date")
        @JsonbDateFormat(value = "dd/MM/yyyy",locale ="Locale,Italian")
    private LocalDate datacreazione;

    public Person(int id, String cognome, String nome, int age) {
        this.id = id;
        this.cognome = cognome;
        this.nome = nome;
        this.age = age;
        this.datacreazione = datacreazione;
    }

    public JsonObject toJasonMin(){
        return Json.createObjectBuilder()
                .add("lastname", this.cognome).add("age", this.age).build();
   
                
                }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDatacreazione() {
        return datacreazione;
    }

    public void setDatacreazione(LocalDate datacreazione) {
        this.datacreazione = datacreazione;
    }

    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + this.id;
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
        final Person other = (Person) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", cognome=" + cognome + ", nome=" + nome + ", age=" + age + '}';
    }

}
