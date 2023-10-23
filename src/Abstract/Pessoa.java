/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Matavele's
 */
public abstract class Pessoa implements Serializable{
    
    private int id;
    private String nome;
    private String apelido;
    private boolean status;
    private String contacto;
    private Date dateCreated;

    public Pessoa(String nome, String apelido, String contacto) {
        this.nome = nome;
        this.apelido = apelido;
        this.contacto = contacto;
        dateCreated = new Date();
        status = true;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getApelido() {
        return apelido;
    }

    public boolean isStatus() {
        return status;
    }

    public String getContacto() {
        return contacto;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", apelido=" + apelido + ", status=" + status + ", contacto=" + contacto + '}';
    }
    
 
  
    
    
}
