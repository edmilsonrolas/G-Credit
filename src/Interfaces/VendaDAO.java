/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelos.Cliente;
import Modelos.Venda;
import java.util.List;

/**
 *
 * @author Matavele's
 */
public interface VendaDAO {

    void efetuarVenda(Venda venda);

    void atualizarVenda(Venda venda);

    void cancelarVenda(Venda venda);

    Venda buscarVenda(int id);

    List listaVendas();
    
    double getTotal(Cliente cliente);
    void carregar();

    void salvar();
}
