/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Abstract.Pessoa;
import java.io.Serializable;

/**
 *
 * @author Matavele's
 */
public class Funcionario extends Pessoa implements Serializable{
    
    private String username;
    private String senha;
    private String nivelAcesso;
    private double salario;
    private double bonus;

    public Funcionario(String username, String senha, String nivelAcesso, String nome, String apelido, String contacto) {
        super(nome, apelido, contacto);
        this.username = username;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public String getUsername() {
        return username;
    }

    public String getSenha() {
        return senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public double getSalario() {
        return salario;
    }

    public double getBonus() {
        return bonus;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    
    
    
    
    
    
    
}
