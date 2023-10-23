/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Abstract.Pessoa;
import Modelos.Fornecedor;
import java.util.List;

/**
 *
 * @author Matavele's
 */
public interface FornecedorDAO {

    void adicionarFornecedor(Fornecedor fornecedor);

    void atualizarFornecedor(Fornecedor fornecedor);

    Fornecedor buscarFornecedor(int id);

    void removerFornecedor(Fornecedor fornecedor);

    List listarFornecedores();

    void carregar();

    void salvar();
}
