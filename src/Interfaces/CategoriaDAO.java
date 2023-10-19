/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelos.Categoria;
import java.util.List;

/**
 *
 * @author Matavele's
 */
public interface CategoriaDAO {

    void adicionarCategoria(Categoria categoria);

    void atualizarCategoria(Categoria categoria);

    void removerCategoria(Categoria categoria);

    Categoria buscarCategoria(int id);

    List listarCategorias();

    void carregar();

    void salvar();
}
