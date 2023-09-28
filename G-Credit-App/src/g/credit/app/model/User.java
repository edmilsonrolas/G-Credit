/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.credit.app.model;

/**
 * Representa um utilizador do sistema.
 * 
 * Esta classe estende a classe abstrata Person e adiciona atributos específicos de um utilizador,
 * como o ID de utilizador, a posição e o salário.
 * 
 * @author rolas
 */
public class User extends Person {
    private String userID;          // O ID de utilizador do utilizador.
    private Position position;       // A posição do utilizador.
    private double salary;          // O salário do utilizador.
    
    /**
     * Enumeração que representa as posições possíveis de um utilizador.
     */
    public enum Position {
        superUser,                  // Utilizador com privilégios de superutilizador.
        Attendant                   // Atendente ou utilizador comum.
    }

    /**
     * Construtor da classe User.
     * 
     * @param firstName    O primeiro nome do utilizador.
     * @param lastName     O sobrenome do utilizador.
     * @param dateOfBirth  A data de nascimento do utilizador no formato "yyyy-MM-dd".
     * @param email        O endereço de email do utilizador.
     * @param phone        O número de telefone do utilizador.
     * @param address      O endereço do utilizador.
     * @param userID       O ID de utilizador do utilizador.
     * @param position     A posição do utilizador (superUser ou Attendant).
     * @param salary       O salário do utilizador.
     */
    public User(String firstName, String lastName, String dateOfBirth, String email, String phone, String address,
                     String userID, Position position, double salary) {
        super(firstName, lastName, dateOfBirth, email, phone, address);
        
        if (salary < 0) {
            throw new IllegalArgumentException("Salário não pode ser negativo.");
        }
        this.userID = userID;
        this.position = position;
        this.salary = salary;
    }

    /**
     * Obtém o ID de utilizador do utilizador.
     *
     * @return O ID de utilizador.
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Define o ID de utilizador do utilizador.
     *
     * @param userID O ID de utilizador.
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * Obtém a posição do utilizador.
     *
     * @return A posição do utilizador (superUser ou Attendant).
     */
    public Position getPosition() {
        return position;
    }

    /**
     * Define a posição do utilizador.
     *
     * @param position A posição do utilizador (superUser ou Attendant).
     */
    public void setPosition(Position position) {
        // Verifica se a posição é uma das enumerações válidas
        if (position != Position.superUser && position != Position.Attendant) {
            throw new IllegalArgumentException("Posição inválida.");
        }
        this.position = position;
    }

    /**
     * Obtém o salário do utilizador.
     *
     * @return O salário do utilizador.
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Define o salário do utilizador.
     *
     * @param salary O salário do utilizador.
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    /**
     * Retorna uma representação em formato de string do utilizador.
     *
     * @return Uma representação em formato de string do utilizador.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User{");
        sb.append("userID=").append(userID);
        sb.append(", firstName=").append(getFirstName());
        sb.append(", lastName=").append(getLastName());
        sb.append(", dateOfBirth=").append(getDateOfBirth());
        sb.append(", email=").append(getEmail());
        sb.append(", phone=").append(getPhone());
        sb.append(", address=").append(getAddress());
        sb.append(", position=").append(position);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}

