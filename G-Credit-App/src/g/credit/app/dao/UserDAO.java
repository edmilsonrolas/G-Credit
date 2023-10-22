/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.credit.app.dao;

import g.credit.app.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe DAO para a entidade User.
 * 
 * Esta classe é responsável por realizar operações de acesso a dados relacionadas aos utilizadores na base de dados.
 * Ela fornece métodos para inserir, atualizar, excluir, obter um utilizador por ID e obter todos os utilizadores.
 * 
 * @author rolas
 */
public class UserDAO {
    private final Connection connection;

    /**
     * Construtor da classe UserDAO.
     *
     * @throws SQLException Se ocorrer um erro durante a inicialização da conexão.
     */
    public UserDAO() throws SQLException {
        connection = SQLiteDBConnection.getConnection();
    }

    /**
     * Insere um novo utilizador na base de dados.
     *
     * @param user O objeto Utilizador a ser inserido.
     * @throws SQLException Se ocorrer um erro durante a inserção.
     */
    public void insertUser(User user) throws SQLException {
        String sql = "INSERT INTO users (firstName, lastName, dateOfBirth, email, phone, address, position, salary) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getDateOfBirth());
            statement.setString(4, user.getEmail());
            statement.setString(5, user.getPhone());
            statement.setString(6, user.getAddress());
            statement.setString(7, user.getPosition().toString());
            statement.setDouble(8, user.getSalary());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir o utilizador", e);
        }
    }

    /**
     * Actualiza um utilizador existente na base de dados.
     *
     * @param user O objeto Utilizador a ser atualizado.
     * @throws SQLException Se ocorrer um erro durante a atualização.
     */
    public void updateUser(User user) throws SQLException {
        String sql = "UPDATE users " +
                "SET firstName = ?, lastName = ?, dateOfBirth = ?, email = ?, phone = ?, address = ?, position = ?, salary = ? " +
                "WHERE userID = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getDateOfBirth());
            statement.setString(4, user.getEmail());
            statement.setString(5, user.getPhone());
            statement.setString(6, user.getAddress());
            statement.setString(7, user.getPosition().toString());
            statement.setDouble(8, user.getSalary());
            statement.setLong(9, user.getUserID());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao actualizar o utilizador", e);
        }
    }

    /**
     * Exclui um utilizador da base de dados com base no seu ID de utilizador.
     *
     * @param userID O ID de utilizador do utilizador a ser excluído.
     * @throws SQLException Se ocorrer um erro durante a exclusão.
     */
    public void deleteUser(long userID) throws SQLException {
        String sql = "DELETE FROM users WHERE userID = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setLong(1, userID);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao exluir o utilizador", e);
        }
    }

    /**
     * Obtém um utilizador da base de dados com base no seu ID de utilizador.
     *
     * @param userID O ID de utilizador do utilizador a ser obtido.
     * @return O utilizador com o ID de utilizador especificado.
     * @throws SQLException Se ocorrer um erro durante a consulta.
     */
    public User getUserById(long userID) throws SQLException {
        String sql = "SELECT * FROM users WHERE userID = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setLong(1, userID);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return mapResultSetToUser(resultSet);
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao obter o utilizador por ID", e);
        }
    }

    /**
     * Obtém uma lista de todos os utilizadores na base de dados.
     *
     * @return Uma lista de utilizadores.
     * @throws SQLException Se ocorrer um erro durante a consulta.
     */
    public List<User> getAllUsers() throws SQLException {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                users.add(mapResultSetToUser(resultSet));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao obter os utilizadores", e);
        }
        return users;
    }

    /**
     * Converte um ResultSet em um objeto Utilizador (User).
     *
     * @param resultSet O ResultSet contendo os dados do utilizador.
     * @return Um objeto Utilizador (User) com os dados do ResultSet.
     * @throws SQLException Se ocorrer um erro ao acessar os dados do ResultSet.
     */    
    private User mapResultSetToUser(ResultSet resultSet) throws SQLException {
        User u = new User();
        u.setUserID(resultSet.getLong("userID"));
        u.setFirstName(resultSet.getString("firstName"));
        u.setLastName(resultSet.getString("lastName"));
        u.setDateOfBirth(resultSet.getString("dateOfBirth"));
        u.setEmail(resultSet.getString("email"));
        u.setPhone(resultSet.getString("phone"));
        u.setAddress(resultSet.getString("address"));
        u.setPosition(User.Position.valueOf(resultSet.getString("position")));
        u.setSalary(resultSet.getDouble("salary"));
            
        return u;
    }
    
    /**
     * Fecha a conexão com a base de dados.
     */
    public void closeConnection() {
        try {
            SQLiteDBConnection.closeConnection();
        } catch (SQLException e) {
        }
    }
}

