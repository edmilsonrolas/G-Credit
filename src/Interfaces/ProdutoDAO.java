/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelos.Operadora;
import Modelos.Produto;
import java.util.List;

/**
 *
 * @author Matavele's
 */
public interface ProdutoDAO {

    void adicionarProduto(Produto produto);

    void atualizarProdutos(Produto produto);

    Produto buscarProduto(int id);

    void removerProduto(Produto produto);
    
    List listarPorOperadora(Operadora operadora);

    List listarProdutos();
    
    double totalVendaProdutos();
    
    double totalPrecoProdutos();
    
    int totalQtdProdutos();
    
    void carregar();

    void salvar();
}
