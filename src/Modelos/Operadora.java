/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Matavele's
 */
public class Operadora implements Serializable {
    private int id;
    private String nome;
    private String contacto;
    private String descricao;
    private boolean status;
    private Date entrada;

    public Operadora(String nome, String contacto, String descricao) {
        this.nome = nome;
        this.contacto = contacto;
        this.descricao = descricao;
        status = true;
        entrada = new Date();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getContacto() {
        return contacto;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isStatus() {
        return status;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    
}
