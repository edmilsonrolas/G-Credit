/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package g.credit.app.dao;
//
//import g.credit.app.model.Client;
//import g.credit.app.model.Sale;
//import g.credit.app.model.User;
//
//import java.sql.*;
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// *
// * @author rolas
// */
//public class SaleDAO {
//    private Connection connection;
//
//    public SaleDAO() {
//        try {
//            connection = SQLiteDBConnection.getConnection();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void insertSale(Sale sale) {
//        String sql = "INSERT INTO sales (saleDate, userID, clientID, totalAmount, totalPrice, profit) VALUES (?, ?, ?, ?, ?, ?)";
//
//        try (PreparedStatement statement = connection.prepareStatement(sql)) {
//            statement.setDate(1, Date.valueOf(sale.getSaleDate()));
//            statement.setLong(2, sale.getUser().getUserID());
//            statement.setLong(3, sale.getClient().getCustomerID());
//            statement.setDouble(4, sale.getTotalAmount());
//            statement.setDouble(5, sale.getTotalPrice());
//            statement.setDouble(6, sale.getProfit());
//
//            statement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public List<Sale> getAllSales() {
//        List<Sale> sales = new ArrayList<>();
//        String sql = "SELECT * FROM sales";
//
//        try (Statement statement = connection.createStatement();
//             ResultSet resultSet = statement.executeQuery(sql)) {
//            while (resultSet.next()) {
//                long saleID = resultSet.getLong("saleID");
//                LocalDate saleDate = resultSet.getDate("saleDate").toLocalDate();
//                long userID = resultSet.getLong("userID");
//                long clientID = resultSet.getLong("clientID");
//                double totalAmount = resultSet.getDouble("totalAmount");
//                double totalPrice = resultSet.getDouble("totalPrice");
//                double profit = resultSet.getDouble("profit");
//
//                UserDAO userDAO = new UserDAO();
//                User user = userDAO.getUserById(userID);
//
//                ClientDAO clientDAO = new ClientDAO();
//                Client client = clientDAO.getClientById(clientID);
//
//                Sale sale = new Sale(saleDate, user, client);
//                sale.setSaleID(saleID);
//                sale.setTotalAmount(totalAmount);
//                sale.setTotalPrice(totalPrice);
//                sale.setProfit(profit);
//
//                sales.add(sale);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return sales;
//    }
//
//    public void updateSale(Sale sale) {
//        String sql = "UPDATE sales SET saleDate = ?, userID = ?, clientID = ?, totalAmount = ?, totalPrice = ?, profit = ? WHERE saleID = ?";
//
//        try (PreparedStatement statement = connection.prepareStatement(sql)) {
//            statement.setDate(1, Date.valueOf(sale.getSaleDate()));
//            statement.setLong(2, sale.getUser().getUserID());
//            statement.setLong(3, sale.getClient().getCustomerID());
//            statement.setDouble(4, sale.getTotalAmount());
//            statement.setDouble(5, sale.getTotalPrice());
//            statement.setDouble(6, sale.getProfit());
//            statement.setLong(7, sale.getSaleID());
//
//            statement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void deleteSale(long saleID) {
//        String sql = "DELETE FROM sales WHERE saleID = ?";
//
//        try (PreparedStatement statement = connection.prepareStatement(sql)) {
//            statement.setLong(1, saleID);
//
//            statement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
