/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Abstract.Pessoa;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Matavele's
 */
public class Cliente extends Pessoa implements Serializable{
    
    private Categoria categoria_cliente;

    public Cliente(Categoria categoria_cliente, String nome, String apelido, String contacto) {
        super(nome, apelido, contacto);
        this.categoria_cliente = categoria_cliente;
    }

    public Categoria getCategoria_cliente() {
        return categoria_cliente;
    }

    public void setCategoria_cliente(Categoria categoria_cliente) {
        this.categoria_cliente = categoria_cliente;
    }

   
    
    
}
