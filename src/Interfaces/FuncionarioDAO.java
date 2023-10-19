/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Abstract.Pessoa;
import Modelos.Funcionario;
import java.util.List;

/**
 *
 * @author Matavele's
 */
public interface FuncionarioDAO {

    void adicionarFuncionario(Pessoa pessoa);

    void atualizarFuncionario(Funcionario funcionario);

    void removerFuncionario(Funcionario funcionario);

    Funcionario buscarFuncionario(int id);

    List listarFuncionarios();

    void carregar();

    void salvar();
}
