/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author Matavele's
 */
public class Lista implements Serializable {

    private Cliente cliente;
    private Produto produto;
    private int quantidade;
    private boolean status;
    private boolean s =false;
    private int remanescente;
    

    public Lista(Cliente cliente, Produto produto, int quantidade) {
        this.cliente = cliente;
        this.produto = produto;
        quantificar(quantidade);
    }

    public boolean isStatus() {
        return status;
    }
    

    public int getRemanescente() {
        return remanescente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setProduto(Produto produto) {
        if(produto.getQuantidadeProduto()==0){
            JOptionPane.showMessageDialog(null, "produto esgotado!");
        }else{
        this.produto = produto;
        }
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= this.quantidade) {
            int dif = quantidade - this.quantidade;
            empty(dif,quantidade);
            

        } else {
            int dif1 = this.quantidade - quantidade;
            remanescente = produto.getQuantidadeProduto() + dif1;
            produto.setQuantidadeProduto(remanescente);
            this.quantidade = quantidade;
        }
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void empty(int dif,int quantidade) {
        if (produto.getQuantidadeProduto() < dif) {
            JOptionPane.showMessageDialog(null, " quantidade excedida");
        } else {

            produto.setQuantidadeProduto(produto.getQuantidadeProduto() - dif);
            
            this.quantidade = quantidade;
            
        }
    }

    public double getTotal() {
        return quantidade * produto.getValor();
    }

    private void quantificar(int quantidade) {
        if (produto.getQuantidadeProduto() >= quantidade) {
            
            this.quantidade = quantidade;
            remanescente = produto.getQuantidadeProduto() - quantidade;
            System.out.println(""+remanescente);
            produto.setQuantidadeProduto(remanescente);
            status = true;

        } else {
           throw new NullPointerException(" Quantidade resmanescente: "+produto.getQuantidadeProduto());
        }
    }
    
    private void cancelar(){
        if(status == true){
        produto.setQuantidadeProduto(produto.getQuantidadeProduto() + quantidade);
        status = false;
        }else{
            JOptionPane.showMessageDialog(null, "nao cancelavel");
        }
    }

}
