/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.credit.app.model;

/**
 *
 * @author rolas
 */
public class SaleTopup {
    private long saleTopupID;
    private long topupID;
    private int quantity;
    private long saleID;

    public SaleTopup() {}

    public SaleTopup(long topupID, int quantity, long saleID) {
        this.topupID = topupID;
        this.quantity = quantity;
        this.saleID = saleID;
    }

    public long getSaleTopupID() {
        return saleTopupID;
    }

    public void setSaleTopupID(long saleTopupID) {
        this.saleTopupID = saleTopupID;
    }

    public long getTopupID() {
        return topupID;
    }

    public void setTopupID(long topupID) {
        this.topupID = topupID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getSaleID() {
        return saleID;
    }

    public void setSaleID(long saleID) {
        this.saleID = saleID;
    }

    @Override
    public String toString() {
        return "SaleTopup{" +
               "saleTopupID=" + saleTopupID +
               ", topupID=" + topupID +
               ", quantity=" + quantity +
               ", saleID=" + saleID +
               '}';
    }
}
