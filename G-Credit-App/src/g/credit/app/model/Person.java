/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.credit.app.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * A classe abstrata que representa uma pessoa.
 * 
 * Esta classe fornece uma estrutura básica para armazenar informações sobre uma pessoa,
 * como nome, data de nascimento, email, telefone e endereço.
 * As subclasses podem estender esta classe para representar tipos específicos de pessoas,
 * como atendentes ou clientes.
 * 
 * @author rolas
 */
public abstract class Person {
    private String firstName;    // O primeiro nome da pessoa.
    private String lastName;     // O sobrenome da pessoa.
    private String dateOfBirth;  // A data de nascimento da pessoa no formato "yyyy-MM-dd".
    private String email;        // O endereço de email da pessoa.
    private String phone;        // O número de telefone da pessoa.
    private String address;      // O endereço da pessoa.

    /**
     * Construtor da classe Person.
     * 
     * @param firstName    O primeiro nome da pessoa.
     * @param lastName     O sobrenome da pessoa.
     * @param dateOfBirth  A data de nascimento da pessoa no formato "yyyy-MM-dd".
     * @param email        O endereço de email da pessoa.
     * @param phone        O número de telefone da pessoa.
     * @param address      O endereço da pessoa.
     */
    public Person(String firstName, String lastName, String dateOfBirth, String email, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    /**
     * Obtém o endereço da pessoa.
     *
     * @return O endereço da pessoa.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Define o endereço da pessoa.
     *
     * @param address O endereço da pessoa.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Obtém o primeiro nome da pessoa.
     *
     * @return O primeiro nome da pessoa.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Define o primeiro nome da pessoa.
     *
     * @param firstName O primeiro nome da pessoa.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Obtém o sobrenome da pessoa.
     *
     * @return O sobrenome da pessoa.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Define o sobrenome da pessoa.
     *
     * @param lastName O sobrenome da pessoa.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Obtém a data de nascimento da pessoa no formato "yyyy-MM-dd".
     *
     * @return A data de nascimento da pessoa.
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Define a data de nascimento da pessoa no formato "yyyy-MM-dd".
     *
     * @param dateOfBirth A data de nascimento da pessoa.
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Obtém o endereço de email da pessoa.
     *
     * @return O endereço de email da pessoa.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o endereço de email da pessoa.
     *
     * @param email O endereço de email da pessoa.
     */
    public void setEmail(String email) {
        // Verifica se o email está em um formato válido usando uma expressão regular
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        if (!email.matches(emailRegex)) {
            throw new IllegalArgumentException("Endereço de email inválido.");
        }
        this.email = email;
    }


    /**
     * Obtém o número de telefone da pessoa.
     *
     * @return O número de telefone da pessoa.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Define o número de telefone da pessoa.
     *
     * @param phone O número de telefone da pessoa.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Obtém o nome completo da pessoa (primeiro nome + sobrenome).
     *
     * @return O nome completo da pessoa.
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }

    /**
     * Calcula e retorna a idade da pessoa com base na data de nascimento.
     *
     * @return A idade da pessoa em anos.
     * @throws DateTimeParseException Se a data de nascimento estiver em um formato inválido.
     * @throws IllegalArgumentException Se a data de nascimento não estiver no formato "yyyy-MM-dd".
     */
    public int getAge() throws DateTimeParseException, IllegalArgumentException {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate birthDate = LocalDate.parse(dateOfBirth, formatter);
            LocalDate currentDate = LocalDate.now();
            Period period = Period.between(birthDate, currentDate);
            return period.getYears();
        } catch (DateTimeParseException e) {
            throw e; // Lança a exceção original se ocorrer um erro de análise de data.
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("A data de nascimento deve estar no formato 'yyyy-MM-dd'.", e);
        }
    }
}
