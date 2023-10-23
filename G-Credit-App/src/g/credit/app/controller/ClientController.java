/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.credit.app.controller;

import g.credit.app.dao.ClientDAO;
import g.credit.app.model.Client;

import java.sql.SQLException;
import java.util.List;

/**
 * Controlador para a entidade Cliente (Client).
 * 
 * Esta classe fornece métodos para realizar operações relacionadas aos clientes,
 * interagindo com a classe de acesso a dados (DAO) correspondente.
 * 
 * @author rolas
 */
public class ClientController {
    private final ClientDAO clientDAO;

    /**
     * Construtor da classe ClientController.
     * Inicializa a classe ClientDAO.
     */
    public ClientController() {
        try {
            clientDAO = new ClientDAO();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar ClientController", e);
        }
    }

    /**
     * Insere um novo cliente na base de dados.
     *
     * @param client O objeto Cliente a ser inserido.
     * @throws RuntimeException Se ocorrer um erro durante a inserção.
     */
    public void insertClient(Client client) {
        try {
            clientDAO.insertClient(client);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir o cliente", e);
        }
    }

    /**
     * Atualiza um cliente existente na base de dados.
     *
     * @param client O objeto Cliente a ser atualizado.
     * @throws RuntimeException Se ocorrer um erro durante a atualização.
     */
    public void updateClient(Client client) {
        try {
            clientDAO.updateClient(client);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao actualizar o cliente", e);
        }
    }

    /**
     * Exclui um cliente da base de dados com base no seu ID de cliente.
     *
     * @param customerID O ID de cliente do cliente a ser excluído.
     * @throws RuntimeException Se ocorrer um erro durante a exclusão.
     */
    public void deleteClient(long customerID) {
        try {
            clientDAO.deleteClient(customerID);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao excluir o cliente", e);
        }
    }

    /**
     * Obtém um cliente da base de dados com base no seu ID de cliente.
     *
     * @param customerID O ID de cliente do cliente a ser obtido.
     * @return O objeto Cliente com o ID de cliente especificado.
     * @throws RuntimeException Se ocorrer um erro durante a consulta.
     */
    public Client getClientById(long customerID) {
        try {
            return clientDAO.getClientById(customerID);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao obter o cliente por ID", e);
        }
    }

    /**
     * Obtém uma lista de todos os clientes na base de dados.
     *
     * @return Uma lista de clientes.
     * @throws RuntimeException Se ocorrer um erro durante a consulta.
     */
    public List<Client> getAllClients() {
        try {
            return clientDAO.getAllClients();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao obter os clientes", e);
        }
    }

    /**
     * Fecha a conexão com a base de dados.
     */
    public void closeConnection() {
        clientDAO.closeConnection();
    }
}

