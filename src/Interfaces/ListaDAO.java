/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelos.Cliente;
import Modelos.Lista;
import java.util.List;

/**
 *
 * @author Matavele's
 */
public interface ListaDAO {

    void adicionarLista(Lista lista);

    void atualizarLista(Lista lista);

    void removerLista(Lista lista);
    

    List buscarListaCliente(Cliente cliente);

    List listarLista(Cliente cliente);

    void carregar();

    void salvar();
}
