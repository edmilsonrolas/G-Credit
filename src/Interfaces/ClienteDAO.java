/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelos.Cliente;
import java.util.List;

/**
 *
 * @author Matavele's
 */
public interface ClienteDAO {
    
    void adicionarCliente(Cliente cliente);
    void atualizarCliente(Cliente cliente);
    void removerCliente(Cliente cliente);
    Cliente buscarCliente(int id);
    
    List listarCliente();
    
    void carregar();
    void salvar();
}
