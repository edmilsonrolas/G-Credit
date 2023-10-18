/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

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

    List listarProdutos();

    void carregar();

    void salvar();
}
