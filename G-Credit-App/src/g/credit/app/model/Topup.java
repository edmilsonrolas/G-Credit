/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.credit.app.model;

/**
 * Representa uma recarga telefónica.
 * 
 * Esta classe armazena informações sobre uma recarga, incluindo o seu ID, valor, operadora e quantidade em stock.
 * 
 * @author rolas
 */
public class Topup {
    private String id;
    private int value;
    private Operator operator;
    private int stockQuantity;
    
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
        generateId();    
        this.value = value;
        this.operator = operator;
        this.stockQuantity = stockQuantity;
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
            // Lida com valores nulos ou inválidos de operadora ou valor
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
                    // Lidar com o caso padrão ou inválido, se necessário.
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
        sb.append("Topup{");
        sb.append("id=").append(id);
        sb.append(", value=").append(value);
        sb.append(", operator=").append(operator);
        sb.append(", stockQuantity=").append(stockQuantity);
        sb.append('}');
        return sb.toString();
    }
}

