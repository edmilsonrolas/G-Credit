/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.credit.app.dao;

import g.credit.app.model.Topup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe representa o Data Access Object (DAO) para a entidade Topup.
 * 
 * Ela fornece métodos para acessar e manipular dados de recargas telefônicas na base de dados.
 * 
 * @author rolas
 */
public class TopupDAO {
    private final Connection connection;

    /**
     * Construtor da classe TopupDAO que inicializa a conexão com a base de dados.
     * 
     * @throws SQLException Se ocorrer um erro ao estabelecer a conexão com a base de dados.
     */
    public TopupDAO() throws SQLException{
            connection = SQLiteDBConnection.getConnection();
    }

    /**
     * Insere uma nova recarga telefônica na base de dados.
     * 
     * @param topup A recarga telefônica a ser inserida.
     * @throws SQLException Se ocorrer um erro durante a inserção.
     */
    public void insertTopup(Topup topup) throws SQLException {
        String sql = "INSERT INTO topups (id, value, operator, stock_quantity) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, topup.getId());
            statement.setInt(2, topup.getValue());
            statement.setString(3, topup.getOperator().toString());
            statement.setInt(4, topup.getStockQuantity());
            statement.executeUpdate();
        }catch (SQLException e) {
            throw new SQLException("Erro ao inserir a recarga telefônica.", e);
        }
    }

    /**
     * Atualiza uma recarga telefônica existente na base de dados.
     * 
     * @param topup A recarga telefônica a ser atualizada.
     * @throws SQLException Se ocorrer um erro durante a atualização.
     */
    public void updateTopup(Topup topup) throws SQLException {
        String sql = "UPDATE topups SET value = ?, operator = ?, stock_quantity = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, topup.getValue());
            statement.setString(2, topup.getOperator().toString());
            statement.setInt(3, topup.getStockQuantity());
            statement.setString(4, topup.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException("Erro ao atualizar a recarga telefônica.", e);
        }
    }

    /**
     * Exclui uma recarga telefônica da base de dados com base no seu ID.
     * 
     * @param id O ID da recarga telefônica a ser excluída.
     * @throws SQLException Se ocorrer um erro durante a exclusão.
     */
    public void deleteTopup(String id) throws SQLException {
        String sql = "DELETE FROM topups WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException("Erro ao excluir a recarga telefônica.", e);
        }
    }

    /**
     * Obtém uma recarga telefônica da base de dados com base no seu ID.
     * 
     * @param id O ID da recarga telefônica a ser obtida.
     * @return A recarga telefônica com o ID especificado.
     * @throws SQLException Se ocorrer um erro durante a consulta.
     */
    public Topup getTopupById(String id) throws SQLException {
        String sql = "SELECT * FROM topups WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, id);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return mapResultSetToTopup(resultSet);
            }
        } catch (SQLException e) {
            throw new SQLException("Erro ao obter a recarga telefônica por ID.", e);
        }
        return null;
    }

    /**
     * Retorna uma lista de todas as recargas telefônicas na base de dados.
     * 
     * @return Uma lista de recargas telefônicas.
     * @throws SQLException Se ocorrer um erro durante a consulta.
     */
    public List<Topup> getAllTopups() throws SQLException {
        List<Topup> topups = new ArrayList<>();
        String sql = "SELECT * FROM topups";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                topups.add(mapResultSetToTopup(resultSet));
//                topups.add(EntityMapper.mapResultSetToEntity(resultSet, Topup.class));
            }
        } catch (SQLException e) {
            throw new SQLException("Erro ao obter todas as recargas telefônicas.", e);
        }
        return topups;
    }
    
    /**
     * Converte um ResultSet em um objeto Topup.
     *
     * @param resultSet O ResultSet contendo os dados da recarga telefônica.
     * @return Um objeto Topup com os dados do ResultSet.
     * @throws SQLException Se ocorrer um erro ao acessar os dados do ResultSet.
     */
    private Topup mapResultSetToTopup(ResultSet resultSet) throws SQLException {
        try {
            String id = resultSet.getString("id");
            int value = resultSet.getInt("value");
            String operatorStr = resultSet.getString("operator");
            Topup.Operator operator = Topup.Operator.valueOf(operatorStr);
            int stockQuantity = resultSet.getInt("stock_quantity");
            Topup topup = new Topup(value, operator, stockQuantity);
            topup.setId(id);
            return topup;
        } catch (SQLException e) {
            throw new SQLException("Erro ao mapear ResultSet para Topup.", e);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Valor de operador inválido no ResultSet.", e);
        }
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

