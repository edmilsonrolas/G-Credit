/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.credit.app.controller;

import g.credit.app.dao.UserDAO;
import g.credit.app.model.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Controlador para a entidade Utilizador (User).
 * 
 * Esta classe fornece métodos para realizar operações relacionadas aos utilizadores,
 * interagindo com a classe de acesso a dados (DAO) correspondente.
 * 
 * @author rolas
 */
public class UserController {
    private final UserDAO userDAO;

    /**
     * Construtor da classe UserController.
     * Inicializa a classe UserDAO.
     */
    public UserController() {
        try {
            userDAO = new UserDAO();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar UserController", e);
        }
    }

    /**
     * Insere um novo utilizador na base de dados.
     *
     * @param user O objeto Utilizador a ser inserido.
     * @throws RuntimeException Se ocorrer um erro durante a inserção.
     */
    public void insertUser(User user) {
        try {
            userDAO.insertUser(user);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir o utilizador", e);
        }
    }

    /**
     * Atualiza um utilizador existente na base de dados.
     *
     * @param user O objeto Utilizador a ser atualizado.
     * @throws RuntimeException Se ocorrer um erro durante a atualização.
     */
    public void updateUser(User user) {
        try {
            userDAO.updateUser(user);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar o utilizador", e);
        }
    }

    /**
     * Exclui um utilizador da base de dados com base no seu ID de utilizador.
     *
     * @param userID O ID de utilizador do utilizador a ser excluído.
     * @throws RuntimeException Se ocorrer um erro durante a exclusão.
     */
    public void deleteUser(String userID) {
        try {
            userDAO.deleteUser(userID);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao excluir o utilizador", e);
        }
    }

    /**
     * Obtém um utilizador da base de dados com base no seu ID de utilizador.
     *
     * @param userID O ID de utilizador do utilizador a ser obtido.
     * @return O utilizador com o ID de utilizador especificado.
     * @throws RuntimeException Se ocorrer um erro durante a consulta.
     */
    public User getUserById(String userID) {
        try {
            return userDAO.getUserById(userID);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao obter o utilizador por ID", e);
        }
    }

    /**
     * Obtém uma lista de todos os utilizadores na base de dados.
     *
     * @return Uma lista de utilizadores.
     * @throws RuntimeException Se ocorrer um erro durante a consulta.
     */
    public List<User> getAllUsers() {
        try {
            return userDAO.getAllUsers();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao obter os utilizadores", e);
        }
    }

    /**
     * Fecha a conexão com a base de dados.
     */
    public void closeConnection() {
        userDAO.closeConnection();
    }
}

