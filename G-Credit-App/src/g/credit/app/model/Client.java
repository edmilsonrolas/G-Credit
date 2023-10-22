/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.credit.app.model;

/**
 * Representa um cliente do sistema.
 * 
 * Esta classe estende a classe abstrata Person e adiciona atributos específicos de um cliente,
 * como o ID de cliente, o estado de associação (membership status) e pontos de fidelidade.
 * 
 * @author rolas
 */
public class Client extends Person {
    private long customerID;            // O ID de cliente do cliente.
    private MembershipStatus membershipStatus; // O estado de associação do cliente.
    private int loyaltyPoints;           // Pontos de fidelidade do cliente.
    
    /**
     * Enumeração que representa os estados de associação possíveis de um cliente.
     */
    public enum MembershipStatus{
        NORMAL, // Estado de associação padrão.
        PREMIUM   // Estado de associação premium.
    }

    /**
     * Construtor da classe Client.
     * 
     * @param firstName         O primeiro nome do cliente.
     * @param lastName          O sobrenome do cliente.
     * @param dateOfBirth       A data de nascimento do cliente no formato "yyyy-MM-dd".
     * @param email             O endereço de email do cliente.
     * @param phone             O número de telefone do cliente.
     * @param address           O endereço do cliente.
     * @param membershipStatus  O estado de associação do cliente (Standard ou Premium).
     * @param loyaltyPoints     Os pontos de fidelidade do cliente.
     */
    public Client(String firstName, String lastName, String dateOfBirth, String email, String phone, String address, int loyaltyPoints) {
        super(firstName, lastName, dateOfBirth, email, phone, address);
        this.loyaltyPoints = loyaltyPoints;
        this.membershipStatus = MembershipStatus.NORMAL;
    }

    /**
     * Construtor da classe Client.
     * Cria um novo objeto `Client` com informações básicas do cliente.
     * 
     * @param firstName O primeiro nome do cliente.
     * @param lastName O sobrenome do cliente.
     * @param dateOfBirth A data de nascimento do cliente no formato "yyyy-MM-dd".
     * @param email O endereço de email do cliente.
     * @param phone O número de telefone do cliente.
     * @param address O endereço do cliente.
     */    
    public Client(String firstName, String lastName, String dateOfBirth, String email, String phone, String address) {
        super(firstName, lastName, dateOfBirth, email, phone, address);
    }

    /**
     * Construtor da classe Client.
     * Cria um novo objeto `Client` com informações básicas do cliente.
     * 
     * @param firstName O primeiro nome do cliente.
     * @param lastName O sobrenome do cliente.
     * @param phone O número de telefone do cliente.
     * @param address O endereço do cliente.
     */    
    public Client(String firstName, String lastName, String phone, String address) {
        super(firstName, lastName, phone, address);
        membershipStatus = MembershipStatus.NORMAL;
    }

    /**
     * Construtor vazio da classe Client.
     * Cria um novo objeto `Client` sem atribuir valores iniciais a nenhum campo.
     */    
    public Client() {
    }

    /**
     * Obtém o ID de cliente do cliente.
     *
     * @return O ID de cliente.
     */
    public long getCustomerID() {
        return customerID;
    }

    /**
     * Define o ID de cliente do cliente.
     *
     * @param customerID O ID de cliente.
     */
    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }

    /**
     * Obtém o estado de associação do cliente.
     *
     * @return O estado de associação do cliente (Standard ou Premium).
     */
    public MembershipStatus getMembershipStatus() {
        return membershipStatus;
    }

    /**
     * Define o estado de associação do cliente.
     *
     * @param membershipStatus O estado de associação do cliente (Standard ou Premium).
     */
    public void setMembershipStatus(MembershipStatus membershipStatus) {
        this.membershipStatus = membershipStatus;
    }

    /**
     * Obtém os pontos de fidelidade do cliente.
     *
     * @return Os pontos de fidelidade do cliente.
     */
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    /**
     * Define os pontos de fidelidade do cliente.
     *
     * @param loyaltyPoints Os pontos de fidelidade do cliente.
     */
    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    /**
     * Retorna uma representação em formato de string do cliente.
     *
     * @return Uma representação em formato de string do cliente.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nClient{");
        sb.append("customerID=").append(customerID);
        sb.append(", firstName=").append(getFirstName());
        sb.append(", lastName=").append(getLastName());
        sb.append(", dateOfBirth=").append(getDateOfBirth());
        sb.append(", email=").append(getEmail());
        sb.append(", phone=").append(getPhone());
        sb.append(", address=").append(getAddress());
        sb.append(", membershipStatus=").append(membershipStatus);
        sb.append(", loyaltyPoints=").append(loyaltyPoints);
        sb.append('}');
        return sb.toString();
    }
}

