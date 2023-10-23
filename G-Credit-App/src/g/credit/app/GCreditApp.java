/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g.credit.app;

import g.credit.app.view.ClientView;
import g.credit.app.view.TopupView;
import g.credit.app.view.UserView;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author rolas
 */
public class GCreditApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à sua aplicação de gestão!");
        try {
            while (true) {
                System.out.println("Escolha uma opção:");
                System.out.println("1. Gerir Recargas");
                System.out.println("2. Gerir Utilizadores");
                System.out.println("3. Gerir Clientes");
                System.out.println("0. Sair");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        manageTopups();
                        break;
                    case 2:
                        manageUsers();
                        break;
                    case 3:
                        manageClients();
                        break;
                    case 0:
                        System.out.println("A sair da aplicação. Obrigado!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao ligar à base de dados: " + e.getMessage());
        }
    }

    public static void manageTopups() throws SQLException {
        TopupView topupView = new TopupView();
        topupView.showMenu();
    }

    public static void manageUsers() throws SQLException {
        UserView userView = new UserView();
        userView.showMenu();
    }

    public static void manageClients() throws SQLException {
        ClientView clientView = new ClientView();
        clientView.showMenu();
    }
}
