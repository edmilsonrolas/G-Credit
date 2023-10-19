/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelos.Cesto;
import java.util.List;

/**
 *
 * @author Matavele's
 */
public interface CestoDAO {

    void adicionarCesto(Cesto cesto);

    void atualizarCesto(Cesto cesto);

    void removerCesto(Cesto cesto);

    Cesto buscarCesto(int id);

    List listaCestos();

    void carregar();

    void salvar();

    double getTotal();
}
