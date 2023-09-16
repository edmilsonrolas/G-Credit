/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelos.Clientes;
import Modelos.Pedidos;
import Modelos.Produtos;
import java.util.Date;
import java.util.List;

/**
 *
 * @author MATAVELE
 */
public interface PedidoDAO {
    List listarPedidos();
    void fazerPedido(Clientes cliente, Produtos produtos, int quantidade, Date data_pedido);
    List<Pedidos> pedidosDoCliente(Clientes cliente);
    
}
