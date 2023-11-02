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
    private final List<Topup> topups;
    private double totalAmount;
    private double totalPrice;
    private double profit;

    public Sale(User user, Client client) {
        this.saleDate = LocalDate.now();
        this.user = user;
        this.client = client;
        this.topups = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    /**
     * Construtor da classe Sale.
     * Cria um novo objeto `Sale` com a lista de recargas, o cliente e o utilizador associados. A data da venda é definida como a data atual.
     *
     * @param topups A lista de recargas vendidas.
     * @param client O cliente para o qual a venda é realizada.
     * @param user O utilizador que efetuou a venda.
     */
    public Sale(List<Topup> topups, Client client, User user) {
        this.topups = topups;
        this.client = client;
        this.user = user;
        this.saleDate = LocalDate.now(); 
        calculateTotalAmount();
        calculateTotalPrice();
        calculateProfit();
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
    public List<Topup> getTopups() {
        return topups;
    }

    public void addTopup(Topup topup) {
        topups.add(topup);
        // Atualizar o valor total da venda quando um produto é adicionado
        totalAmount += topup.getPrice();
    }

    public void removeTopup(Topup topup) {
        topups.remove(topup);
        // Atualizar o valor total da venda quando um produto é removido
        totalAmount -= topup.getPrice();
    }

    /**
     * Obtém o valor total da venda.
     *
     * @return O valor total da venda.
     */
    public double getTotalAmount() {
        return totalAmount;
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
    
    /**
     * Calcula o valor total da venda com base nas recargas vendidas.
     */
    private void calculateTotalAmount() {
        totalAmount = 0;
        for (Topup topup : topups) {
            totalAmount += topup.getValue();
        }
    }
    
    /**
     * Calcula o preço total da venda com base nas recargas vendidas.
     */
    private void calculateTotalPrice() {
        totalPrice = 0;
        for (Topup topup : topups) {
            totalPrice += topup.getPrice();
        }
    }

    /**
     * Calcula o lucro da venda como 0.2 por cada 100 meticais vendidos.
     */
    private void calculateProfit() {
        // Lucro é 0.2 por cada 100 meticais vendidos
        profit = totalAmount * 0.002;
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
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", profit=").append(profit);
        sb.append('}');
        return sb.toString();
    }
    
}

