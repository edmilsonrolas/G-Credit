/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g.credit.app;

import g.credit.app.controller.TopupController;
import g.credit.app.dao.SQLiteDBConnection;
import g.credit.app.model.Topup;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author rolas
 */
public class GCreditApp {
    private final Scanner scanner;
    private final TopupController topupController;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GCreditApp app = new GCreditApp();
        app.showMenu();
//        Topup topup = new Topup(10, Topup.Operator.Vodacom, 10);
//        System.out.println(topup.toString());
    }
    
    public GCreditApp(){
        scanner = new Scanner(System.in);
        topupController = new TopupController();
    }
    
    public void showMenu() {
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Recarga");
            System.out.println("2. Listar Todas os Recargas");
            System.out.println("3. Buscar Recarga por ID");
            System.out.println("4. Atualizar Recarga");
            System.out.println("5. Excluir Recarga");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

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
                    updateTopup();
                    break;
                case 5:
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
        System.out.println(topupController.getTopupById("TM50"));
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
        
    }
}
