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
public class Produto implements Serializable {
    
    private int id;
    private String nomeProduto;
    private Date validadeProduto;
    private double preco;
    private double valor;
    private int quantidadeProduto;
    private Fornecedor fornecedor;
    private Date entrada;
    private boolean status;

    public Produto(String nomeProduto, Date validadeProduto, double preco, double valor, int quantidadeProduto, Fornecedor fornecedor) {
        
        this.nomeProduto = nomeProduto;
        this.validadeProduto = validadeProduto;
        this.preco = preco;
        this.valor = valor;
        this.quantidadeProduto = quantidadeProduto;
        this.fornecedor = fornecedor;
        entrada = new Date();
    }

    public int getId() {
        return id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public Date getValidadeProduto() {
        return validadeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setValidadeProduto(Date validadeProduto) {
        this.validadeProduto = validadeProduto;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
    
    
}
