/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelos.Clientes;
import java.util.List;

/**
 *
 * @author MATAVELE
 */
public interface ClienteDAO {
    
    void registarCliente(Clientes cliente);
    void actualizarCliente(Clientes cliente);
    Clientes buscarCliente(Clientes cliente);
    void removerCliente(Clientes cliente);
    List<Clientes> listarClientes();
    Clientes credenciais(String nome, String senha);
    
}
