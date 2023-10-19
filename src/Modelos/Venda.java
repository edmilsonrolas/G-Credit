/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Matavele's
 */
public class Venda implements Serializable {

    private int id;
    private Funcionario funcionario;
    private List<Lista> lista;
    private double total;
    private double valorPago;
    private double trocos;
    private Date dataVenda;
    private boolean statusVenda;

    public Venda(Funcionario funcionario, List lista, double valorPago) {
        this.funcionario = funcionario;
        this.lista = lista;
        this.valorPago = valorPago;

    }

    public List<Lista> getLista() {
        return lista;
    }

    public double getTotal() {
        int aux = 0;
        for (Lista lista1 : lista) {
            aux += lista1.getProduto().getPreco() * lista1.getQuantidade();
        }
        return total = aux;
    }

    public boolean isStatusVenda() {
        return statusVenda;
    }

    public int getId() {
        return id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public double getValorPago() {
        return valorPago;
    }

    public double getTrocos() {
        double troco = 0;
        troco = getValorPago() - getTotal();
        return trocos = troco;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public void setStatusVenda(boolean statusVenda) {
        this.statusVenda = statusVenda;
    }

    public void setLista(List<Lista> lista) {
        this.lista = lista;
    }

    public void setId(int id) {
        this.id = id;
    }
    

}
