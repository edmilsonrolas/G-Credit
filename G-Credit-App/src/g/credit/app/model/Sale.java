/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.credit.app.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa uma venda de recargas à grosso.
 *
 * Esta classe armazena informações sobre uma venda, incluindo o ID da venda, a data da venda, o utilizador que efetuou a venda,
 * o cliente para o qual a venda foi realizada, a lista de recargas vendidas, o valor total da venda, o preço total e o lucro.
 * O lucro é calculado como 0.2 por cada 100 meticais vendidos.
 * 
 * @author rolas
 */
public class Sale {
    private long saleID;
    private LocalDate saleDate;
    private User user;
    private Client client;
    private final List<SaleTopup> topups;
    private double totalValue;
    private double totalPrice;
    private double profit;

    /**
     * Construtor da classe Sale.
     * Cria um novo objeto `Sale` com a lista de recargas, o cliente e o utilizador associados. A data da venda é definida como a data atual.
     *
     * @param client O cliente para o qual a venda é realizada.
     * @param user O utilizador que efetuou a venda.
     */
    public Sale(Client client, User user) {
        topups = new ArrayList<>();
        this.client = client;
        this.user = user;
        saleDate = LocalDate.now(); 
        totalValue = 0.0;
        totalPrice = 0.0;
        profit = 0.0;
    }
    
    /**
     * Obtém o ID da venda.
     *
     * @return O ID da venda.
     */
    public long getSaleID() {
        return saleID;
    }

    /**
     * Define o ID da venda.
     *
     * @param saleID O ID da venda.
     */
    public void setSaleID(long saleID) {
        this.saleID = saleID;
    }

    /**
     * Obtém a data da venda.
     *
     * @return A data da venda.
     */
    public LocalDate getSaleDate() {
        return saleDate;
    }

    /**
     * Define a data da venda.
     *
     * @param saleDate A data da venda.
     */
    public void setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
    }

    /**
     * Obtém o utilizador que efetuou a venda.
     *
     * @return O utilizador que efetuou a venda.
     */
    public User getUser() {
        return user;
    }

    /**
     * Define o utilizador que efetuou a venda.
     *
     * @param user O utilizador que efetuou a venda.
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Obtém o cliente para o qual a venda é realizada.
     *
     * @return O cliente para o qual a venda é realizada.
     */
    public Client getClient() {
        return client;
    }

    /**
     * Define o cliente para o qual a venda é realizada.
     *
     * @param client O cliente para o qual a venda é realizada.
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * Obtém a lista de recargas vendidas.
     *
     * @return A lista de recargas vendidas.
     */
    public List<SaleTopup> getSaleTopups() {
        return topups;
    }

    /**
     * Adiciona uma recarga à venda.
     *
     * @param topup A recarga a ser adicionada.
     * @throws IllegalArgumentException Se a recarga for nula ou a quantidade for inválida.
     */
    public void addSaleTopup(SaleTopup topup) {
        if (topup == null) {
            throw new IllegalArgumentException("Recarga não pode ser nula.");
        }
        if (topup.getQuantity() <= 0) {
            throw new IllegalArgumentException("A quantidade da recarga deve ser maior que zero.");
        }

        topups.add(topup);
        totalValue += topup.getTotalValue();
        totalPrice += topup.getTotalPrice();
        profit = totalValue * 0.002;
    }

    /**
     * Remove uma recarga da venda.
     *
     * @param topup A recarga a ser removida.
     * @throws IllegalArgumentException Se a recarga for nula ou não estiver na lista.
     */
    public void removeSaleTopup(SaleTopup topup) {
        if (topup == null) {
            throw new IllegalArgumentException("Recarga não pode ser nula.");
        }
        if (!topups.contains(topup)) {
            throw new IllegalArgumentException("A recarga não está na lista de recargas da venda.");
        }

        topups.remove(topup);
        totalValue -= topup.getTotalValue();
        totalPrice -= topup.getTotalPrice();
        profit = totalValue * 0.002;
    }

    /**
     * Obtém o valor total da venda.
     *
     * @return O valor total da venda.
     */
    public double getTotalValue() {
        return totalValue;
    }

    /**
     * Obtém o preço total da venda.
     *
     * @return O preço total da venda.
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * Obtém o lucro da venda.
     *
     * @return O lucro da venda.
     */
    public double getProfit() {
        return profit;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nSale{");
        sb.append("saleID=").append(saleID);
        sb.append(", saleDate=").append(saleDate);
        sb.append(", user=").append(user);
        sb.append(", client=").append(client);
        sb.append(", topups=").append(topups);
        sb.append(", totalValue=").append(totalValue);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", profit=").append(profit);
        sb.append('}');
        return sb.toString();
    }
    
}

