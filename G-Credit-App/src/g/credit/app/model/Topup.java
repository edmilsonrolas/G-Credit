/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.credit.app.model;

/**
 * Representa uma recarga telefónica.
 * 
 * Esta classe armazena informações sobre uma recarga, incluindo o seu ID, valor, operadora, quantidade em stock e preço.
 * 
 * @author rolas
 */
public class Topup {
    private String id;
    private int value;
    private Operator operator;
    private int stockQuantity;
    private double price;
    
    public enum Operator{
        Vodacom, Movitel, Tmcel 
   }

    /**
     * Construtor para a classe Topup.
     * 
     * @param value         O valor da recarga.
     * @param operator      A operadora.
     * @param stockQuantity A quantidade em stock da recarga.
     */
    public Topup(int value, Operator operator, int stockQuantity) {
        this.value = value;
        this.operator = operator;
        this.stockQuantity = stockQuantity;
        calculatePrice();   // Calcula o preço com base na operadora
        generateId();    // deve ser chamado depois da inicializacao de value e operator
    }

    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * Obtém o ID da recarga.
     *
     * @return O ID da recarga.
     */
    public String getId() {
        return id;
    }
    
    /**
     * Define o ID da recarga com base na operadora e valor.
     */
    private void generateId() {
        if (operator != null && value >= 0) {
            this.id = setOperatorCode() + value;
        } else {
            throw new IllegalArgumentException("Operadora ou valor inválidos para criar o ID da recarga.");
        }
    }
    
    /**
     * Define o código da operadora com base no valor do enumerador Operator.
     *
     * @return O código da operadora.
     */
    private String setOperatorCode(){
        String operatorCode = "";

            switch (operator) {
                case Vodacom:
                    operatorCode = "VO";
                    break;
                case Movitel:
                    operatorCode = "MO";
                    break;
                case Tmcel:
                    operatorCode = "TM";
                    break;
                default:
                    break;
            }
        return operatorCode;
    }

    /**
     * Obtém o valor da recarga.
     *
     * @return O valor da recarga.
     */
    public int getValue() {
        return value;
    }

    /**
     * Define o valor da recarga.
     *
     * @param value O valor da recarga.
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Obtém a operadora.
     *
     * @return A operadora.
     */
    public Operator getOperator() {
        return operator;
    }

    /**
     * Define a operadora.
     *
     * @param operator A operadora.
     */
    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    /**
     * Calcula o preço com base na operadora.
     */
    private void calculatePrice() {
        if (operator != null && value >= 0) {
            // Preço padrão é 91% do valor se a operadora for Vodacom, 90% se for outra operadora
            price = (operator == Operator.Vodacom) ? value * 0.91 : value * 0.90;
        } else {
            throw new IllegalArgumentException("Operadora ou valor inválidos para calcular o preço da recarga.");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    /**
     * Obtém a quantidade em stock da recarga.
     *
     * @return A quantidade em stock da recarga.
     */
    public int getStockQuantity() {
        return stockQuantity;
    }

    /**
     * Define a quantidade em stock da recarga.
     *
     * @param stockQuantity A quantidade em stock da recarga.
     */
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nTopup{");
        sb.append("id=").append(id);
        sb.append(", value=").append(value);
        sb.append(", operator=").append(operator);
        sb.append(", stockQuantity=").append(stockQuantity);
        sb.append(", preço unitário=").append(price);
        sb.append('}');
        return sb.toString();
    }
}

