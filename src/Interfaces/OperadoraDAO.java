/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Abstract.Pessoa;
import Modelos.Operadora;
import java.util.List;

/**
 *
 * @author Matavele's
 */
public interface OperadoraDAO {

    void adicionarOperadora(Operadora fornecedor);

    void atualizarOperadora(Operadora fornecedor);

    Operadora buscarOperadora(int id);

    void removerOperadora(Operadora fornecedor);

    List listarOperadoras();

    void carregar();

    void salvar();
}
