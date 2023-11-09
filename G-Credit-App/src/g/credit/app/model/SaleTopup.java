/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.credit.app.model;

/**
 * Representa uma venda de recarga de telemóvel.
 * Cada instância desta classe associa uma recarga de telemóvel (Topup) a uma venda específica.
 * Armazena informações sobre a recarga, quantidade, valor total e preço total.
 * 
 * @author rolas
 */
public class SaleTopup {
    private long saleTopupID; // ID da venda da recarga
    private Topup topup; // A recarga de telemóvel associada a esta venda
    private int quantity; // Quantidade de recargas vendidas
    private long saleID; // ID da venda à qual esta recarga está associada
    private int totalValue; // Valor total das recargas (quantity * valor da recarga)
    private double totalPrice; // Preço total das recargas (quantity * preço da recarga)

    /**
     * Construtor padrão da classe SaleTopup.
     * Cria uma nova instância de SaleTopup sem inicializar campos.
     */
    public SaleTopup() {}

    /**
     * Construtor da classe SaleTopup.
     * Cria uma nova instância de SaleTopup com a recarga de telemóvel, quantidade e ID da venda especificados.
     *
     * @param topup A recarga de telemóvel associada a esta venda.
     * @param quantity A quantidade de recargas vendidas.
     * @param saleID O ID da venda à qual esta recarga está associada.
     */
    public SaleTopup(Topup topup, int quantity, long saleID) {
        this.topup = topup;
        this.quantity = quantity;
        this.saleID = saleID;
        this.totalValue = quantity * topup.getValue();
        this.totalPrice = quantity * topup.getPrice();
    }

    /**
     * Obtém o ID da venda da recarga.
     *
     * @return O ID da venda da recarga.
     */
    public long getSaleTopupID() {
        return saleTopupID;
    }

    /**
     * Define o ID da venda da recarga.
     *
     * @param saleTopupID O ID da venda da recarga.
     */
    public void setSaleTopupID(long saleTopupID) {
        this.saleTopupID = saleTopupID;
    }

    /**
     * Obtém a recarga de telemóvel associada a esta venda.
     *
     * @return A recarga de telemóvel associada a esta venda.
     */
    public Topup getTopup() {
        return topup;
    }

    /**
     * Define a recarga de telemóvel associada a esta venda.
     *
     * @param topup A recarga de telemóvel associada a esta venda.
     */
    public void setTopup(Topup topup) {
        this.topup = topup;
        // Atualizar totalValue e totalPrice quando a recarga é alterada
        this.totalValue = quantity * topup.getValue();
        this.totalPrice = quantity * topup.getPrice();
    }

    /**
     * Obtém a quantidade de recargas vendidas.
     *
     * @return A quantidade de recargas vendidas.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Define a quantidade de recargas vendidas.
     *
     * @param quantity A quantidade de recargas vendidas.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
        // Atualizar totalValue e totalPrice quando a quantidade é alterada
        this.totalValue = quantity * topup.getValue();
        this.totalPrice = quantity * topup.getPrice();
    }

    /**
     * Obtém o ID da venda à qual esta recarga está associada.
     *
     * @return O ID da venda à qual esta recarga está associada.
     */
    public long getSaleID() {
        return saleID;
    }

    /**
     * Define o ID da venda à qual esta recarga está associada.
     *
     * @param saleID O ID da venda à qual esta recarga está associada.
     */
    public void setSaleID(long saleID) {
        this.saleID = saleID;
    }

    /**
     * Obtém o valor total das recargas (quantity * valor da recarga).
     *
     * @return O valor total das recargas.
     */
    public int getTotalValue() {
        return totalValue;
    }

    /**
     * Obtém o preço total das recargas (quantity * preço da recarga).
     *
     * @return O preço total das recargas.
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "SaleTopup{" +
               "saleTopupID=" + saleTopupID +
               ", topupID=" + topup.getId() +
               ", quantity=" + quantity +
               ", saleID=" + saleID +
               ", totalValue=" + totalValue +
               ", totalPrice=" + totalPrice +
               '}';
    }
}
