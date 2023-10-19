/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.List;

/**
 *
 * @author Matavele's
 */
public class Cesto {
    
    private Cliente cliente;
    private Produto produto;
    private int quantidade;
    private double total;

    public Cesto(Cliente cliente,Produto produto, int quantidade) {
        this.cliente = cliente;
        this.quantidade = quantidade;

    }

   

    public Produto getProduto() {
        return produto;
    }
   
    public Cliente getCliente() {
        return cliente;
    }

    public int getQuantidade() {
        return quantidade;
    }

  

    public void setProduto(Produto produto) {
        this.produto = produto;
    
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
    
    
    
    
}
