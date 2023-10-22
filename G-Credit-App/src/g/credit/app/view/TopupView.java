/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.credit.app.view;

import g.credit.app.controller.TopupController;
import g.credit.app.model.Topup;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author rolas
 */
public class TopupView {
    private final Scanner scanner;
    private final TopupController topupController;

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        TopupView topupView = new TopupView();
        topupView.showMenu();
    }
    
    public TopupView(){
        scanner = new Scanner(System.in);
        topupController = new TopupController();
    }
    
    public void showMenu() throws SQLException {
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Recarga");
            System.out.println("2. Listar Todas os Recargas");
            System.out.println("3. Buscar Recarga por ID");
            System.out.println("4. Entrada de Recargas");
            System.out.println("5. Saida de Recargas");
            System.out.println("6. Excluir Recarga");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    insertTopup();
                    break;
                case 2:
                    getAllTopups();
                    break;
                case 3:
                    getTopupById();
                    break;
                case 4:
                    increaseTopupStockQuantity();
                    break;
                case 5:
                    decreaseTopupStockQuantity();
                    break;
                case 6:
                    deleteTopup();
                    break;
                case 0:
                    System.out.println("A sair do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tenta novamente.");
                    break;
            }
        } while (choice != 0);
        
        topupController.closeConnection();
    }
    
    void insertTopup(){
        System.out.print("Valor: ");
        int value = scanner.nextInt();
        System.out.print("Operadora: ");
        String operator = scanner.next();
        System.out.print("Quantidade: ");
        int qtt = scanner.nextInt();
        Topup t = new Topup(value, Topup.Operator.valueOf(operator), qtt);
        topupController.insertTopup(t);
    }
    
    void getAllTopups(){
        System.out.println(topupController.getAllTopups());
    }
    
    void getTopupById(){
        System.out.print("id: ");
        String id = scanner.next();
        System.out.println(topupController.getTopupById(id));
    }
    
    void updateTopup(){
        System.out.println("id: ");
//        String id = 
//        System.out.print("Quantidade: ");
//        int qtt = scanner.nextInt();
//        Topup t = new Topup(value, Topup.Operator.valueOf(operator), qtt);
//        topupController.updateTopup(t);
    }
    
    void deleteTopup(){
        System.out.println("id: ");
        String id = scanner.next();
        topupController.deleteTopup(id);
    }

    private void increaseTopupStockQuantity() throws SQLException {
        System.out.println("id: ");
        String id = scanner.next();
        System.out.print("Quantidade: ");
        int qtt = scanner.nextInt();
        topupController.increaseTopupStockQuantity(id, qtt);
    }

    private void decreaseTopupStockQuantity() throws SQLException {
        System.out.println("id: "); 
        String id = scanner.next();
        System.out.print("Quantidade: ");
        int qtt = scanner.nextInt();
        topupController.decreaseTopupStockQuantity(id, qtt);
    }
}
