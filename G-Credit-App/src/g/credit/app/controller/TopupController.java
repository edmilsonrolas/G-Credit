/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.credit.app.controller;

import g.credit.app.dao.TopupDAO;
import g.credit.app.model.Topup;

import java.sql.SQLException;
import java.util.List;

/**
 * Controlador para a entidade Topup.
 * 
 * Este controlador gerencia as operações relacionadas a recargas telefônicas,
 * interagindo com a classe TopupDAO.
 * 
 * Certifique-se de chamar o método 'closeConnection()' ao encerrar o uso do controlador.
 * 
 * @author rolas
 */
public class TopupController {
    private final TopupDAO topupDAO;

    /**
     * Construtor padrão do controlador.
     * Inicializa uma instância da classe TopupDAO.
     * 
     * @throws RuntimeException Se ocorrer um erro durante a inicialização do controlador.
     */
    public TopupController() {
        try {
            topupDAO = new TopupDAO();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar TopupController.", e);
        }
    }

    /**
     * Insere uma nova recarga telefônica na base de dados.
     * 
     * @param topup A recarga telefônica a ser inserida.
     */
    public void insertTopup(Topup topup) {
        try {
            topupDAO.insertTopup(topup);
        } catch (SQLException e) {
        }
    }
    
    /**
     * Aumenta a quantidade de estoque de uma recarga telefônica na base de dados.
     *
     * @param id       O ID da recarga telefônica.
     * @param quantity A quantidade a ser acrescentada ao estoque da recarga.
     * @throws SQLException Se ocorrer um erro ao acessar a base de dados.
     */
    public void increaseTopupStockQuantity(String id, int quantity) throws SQLException {
        Topup topup = getTopupById(id);
        topup.setStockQuantity(topup.getStockQuantity() + quantity);
        updateTopup(topup);
    }

    /**
     * Reduz a quantidade de estoque de uma recarga telefônica na base de dados.
     *
     * @param id       O ID da recarga telefônica.
     * @param quantity A quantidade a ser reduzida do estoque da recarga.
     * @throws SQLException Se ocorrer um erro ao acessar a base de dados.
     */
    public void decreaseTopupStockQuantity(String id, int quantity) throws SQLException {
        Topup topup = getTopupById(id);
        topup.setStockQuantity(topup.getStockQuantity() - quantity);
        updateTopup(topup);
    }

    /**
     * Atualiza uma recarga telefônica existente na base de dados.
     * 
     * @param topup A recarga telefônica a ser atualizada.
     */
    private void updateTopup(Topup topup) {
        try {
            topupDAO.updateTopup(topup);
        } catch (SQLException e) {
        }
    }

    /**
     * Exclui uma recarga telefônica da base de dados com base no seu ID.
     * 
     * @param id O ID da recarga telefônica a ser excluída.
     */
    public void deleteTopup(String id) {
        try {
            topupDAO.deleteTopup(id);
        } catch (SQLException e) {
        }
    }

    /**
     * Obtém uma recarga telefônica da base de dados com base no seu ID.
     * 
     * @param id O ID da recarga telefônica a ser obtida.
     * @return A recarga telefônica com o ID especificado.
     */
    public Topup getTopupById(String id) {
        try {
            return topupDAO.getTopupById(id);
        } catch (SQLException e) {
            return null;
        }
    }

    /**
     * Obtém uma lista de todas as recargas telefônicas na base de dados.
     * 
     * @return Uma lista de recargas telefônicas.
     */
    public List<Topup> getAllTopups() {
        try {
            return topupDAO.getAllTopups();
        } catch (SQLException e) {
            return null;
        }
    }

    /**
     * Fecha a conexão com a base de dados.
     */
    public void closeConnection() {
        topupDAO.closeConnection();
    }
    
    
}

