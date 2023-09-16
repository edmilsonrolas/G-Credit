/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelos.Clientes;
import Modelos.Produtos;
import java.util.List;

/**
 *
 * @author MATAVELE
 */
public interface ProdutoDAO {
    
    void registarProduto(Produtos cliente);
    void actualizarProduto(Produtos cliente);
    Produtos buscarProduto(Produtos cliente);
    void removerProduto(Produtos cliente);
    List<Produtos> listarProdutos();  
}
