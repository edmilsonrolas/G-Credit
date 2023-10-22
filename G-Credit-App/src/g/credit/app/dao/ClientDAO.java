/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.credit.app.dao;

import g.credit.app.model.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe DAO para a entidade Client.
 * 
 * Esta classe é responsável por realizar operações de acesso a dados relacionadas aos clientes na base de dados.
 * Ela fornece métodos para inserir, atualizar, excluir, obter um cliente por ID e obter todos os clientes.
 * 
 * @author rolas
 */
public class ClientDAO {
    private final Connection connection;

    /**
     * Construtor da classe ClientDAO.
     *
     * @throws SQLException Se ocorrer um erro durante a inicialização da conexão.
     */
    public ClientDAO() throws SQLException {
        connection = SQLiteDBConnection.getConnection();
    }

    /**
     * Insere um novo cliente na base de dados.
     *
     * @param client O objeto Cliente a ser inserido.
     * @throws SQLException Se ocorrer um erro durante a inserção.
     */
    public void insertClient(Client client) throws SQLException {
        String sql = "INSERT INTO clients (firstName, lastName, dateOfBirth, email, phone, address, membershipStatus, loyaltyPoints) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, client.getFirstName());
            statement.setString(2, client.getLastName());
            statement.setString(3, client.getDateOfBirth());
            statement.setString(4, client.getEmail());
            statement.setString(5, client.getPhone());
            statement.setString(6, client.getAddress());
            statement.setString(7, client.getMembershipStatus().toString());
            statement.setInt(8, client.getLoyaltyPoints());
            statement.executeUpdate();
        } catch (SQLException e){
            throw new RuntimeException("Erro ao inserir o cliente", e);
        }
    }

    /**
     * Atualiza um cliente existente na base de dados.
     *
     * @param client O objeto Cliente a ser atualizado.
     * @throws SQLException Se ocorrer um erro durante a atualização.
     */
    public void updateClient(Client client) throws SQLException {
        String sql = "UPDATE clients " +
                "SET firstName = ?, lastName = ?, dateOfBirth = ?, email = ?, phone = ?, address = ?, membershipStatus = ?, loyaltyPoints = ? " +
                "WHERE customerID = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, client.getFirstName());
            statement.setString(2, client.getLastName());
            statement.setString(3, client.getDateOfBirth());
            statement.setString(4, client.getEmail());
            statement.setString(5, client.getPhone());
            statement.setString(6, client.getAddress());
            statement.setString(7, client.getMembershipStatus().toString());
            statement.setInt(8, client.getLoyaltyPoints());
            statement.setLong(9, client.getCustomerID());
            statement.executeUpdate();
        } catch (SQLException e){
            throw new RuntimeException("Erro ao tualizar o cliente", e);
        }
    }

    /**
     * Exclui um cliente da base de dados com base no seu ID de cliente.
     *
     * @param customerID O ID de cliente do cliente a ser excluído.
     * @throws SQLException Se ocorrer um erro durante a exclusão.
     */
    public void deleteClient(long customerID) throws SQLException {
        String sql = "DELETE FROM clients WHERE customerID = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setLong(1, customerID);
            statement.executeUpdate();
        } catch (SQLException e){
            throw new RuntimeException("Erro ao excluir o cliente", e);
        }
    }

    /**
     * Obtém um cliente da base de dados com base no seu ID de cliente.
     *
     * @param customerID O ID de cliente do cliente a ser obtido.
     * @return O objeto Cliente com o ID de cliente especificado.
     * @throws SQLException Se ocorrer um erro durante a consulta.
     */
    public Client getClientById(long customerID) throws SQLException {
        String sql = "SELECT * FROM clients WHERE customerID = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setLong(1, customerID);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return mapResultSetToClient(resultSet);
            }
            return null;
        } catch (SQLException e){
            throw new RuntimeException("Erro ao obter o cliente por ID", e);
        }
    }

    /**
     * Obtém uma lista de todos os clientes na base de dados.
     *
     * @return Uma lista de clientes.
     * @throws SQLException Se ocorrer um erro durante a consulta.
     */
    public List<Client> getAllClients() throws SQLException {
        List<Client> clients = new ArrayList<>();
        String sql = "SELECT * FROM clients";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                clients.add(mapResultSetToClient(resultSet));
            }
        } catch (SQLException e){
            throw new RuntimeException("Erro ao obter os clientes", e);
        }
        return clients;
    }

    /**
     * Converte um ResultSet em um objeto Cliente (Client).
     *
     * @param resultSet O ResultSet contendo os dados do cliente.
     * @return Um objeto Cliente com os dados do ResultSet.
     * @throws SQLException Se ocorrer um erro ao acessar os dados do ResultSet.
     */    
    private Client mapResultSetToClient(ResultSet resultSet) throws SQLException {
        Client c = new Client();
        c.setCustomerID(resultSet.getLong("customerID"));
        c.setFirstName(resultSet.getString("firstName"));
        c.setLastName(resultSet.getString("lastName"));
//        c.setEmail(resultSet.getString("email"));
        c.setPhone(resultSet.getString("phone"));
        c.setDateOfBirth(resultSet.getString("dateOfBirth"));
        c.setAddress(resultSet.getString("address"));
        c.setLoyaltyPoints(resultSet.getInt("loyaltyPoints"));
        c.setMembershipStatus(Client.MembershipStatus.valueOf(resultSet.getString("membershipStatus")));
            
        return c;
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

