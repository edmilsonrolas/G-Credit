/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.credit.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Esta classe representa uma conexão a uma base de dados SQLite.
 * 
 * A classe fornece métodos para obter e fechar uma conexão com a base de dados.
 * 
 * Certifique-se de ajustar o URL JDBC e o local da base de dados conforme necessário.
 * 
 * @author rolas
 */
public class SQLiteDBConnection {
    private static Connection connection;

    /**
     * Obtém uma conexão com a base de dados SQLite.
     *
     * @return A conexão com a base de dados.
     * @throws SQLException Se ocorrer um erro ao estabelecer a conexão.
     */
    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            try {
                Class.forName("org.sqlite.JDBC");
                connection = DriverManager.getConnection("jdbc:sqlite:G-CreditDataBase.db");
            } catch (ClassNotFoundException e) {
                throw new SQLException("Driver JDBC SQLite não encontrado.", e);
            } catch (SQLException e) {
                throw new SQLException("Erro ao estabelecer a conexão com a base de dados.", e);
            }
        }
        return connection;
    }

    /**
     * Fecha a conexão com a base de dados.
     * 
     * @throws SQLException Se ocorrer um erro ao fechar a conexão.
     */
    public static void closeConnection() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new SQLException("Erro ao fechar a conexão com a base de dados.", e);
            }
        }
    }
}