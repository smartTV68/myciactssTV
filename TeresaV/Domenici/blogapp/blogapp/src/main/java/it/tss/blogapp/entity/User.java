/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.blogapp.entity;

import it.tss.blogapp.boundary.UsersResource;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.ws.rs.core.UriBuilder;

/**
 *
 * @author tss
 */
@Entity
@Table(name = "user")
public class User extends BaseEntity {

    @JsonbProperty(value = "firstname")
    @NotBlank
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @JsonbProperty(value = "lastname")
    @NotBlank
    @Column(name = "last_name", nullable = false)
    private String lastName;

    
    @NotBlank
    @Email
    @Column(nullable = false)
    private String email;

    
    @NotBlank
    @Size(min = 4)
    @Column(nullable = false)
    private String pwd;
    
    
     public JsonObject toJsonSlice() {

        return Json.createObjectBuilder()
                .add("id", this.id)
                .add("link", UriBuilder.fromResource(UsersResource.class)
                        .path(UsersResource.class,"find")
                        .build(this.id).toString())
                .build();
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @JsonbTransient
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" + "firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", pwd=" + pwd + '}';
    }



}
