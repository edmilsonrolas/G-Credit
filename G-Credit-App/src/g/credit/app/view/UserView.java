/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.credit.app.view;

import g.credit.app.controller.UserController;
import g.credit.app.model.User;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Classe para interagir com operações relacionadas a Utilizadores.
 */
public class UserView {
    private final Scanner scanner;
    private final UserController userController;

    public UserView() {
        scanner = new Scanner(System.in);
        userController = new UserController();
    }

    public void showMenu() throws SQLException {
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Utilizador");
            System.out.println("2. Listar Todos os Utilizadores");
            System.out.println("3. Buscar Utilizador por ID");
            System.out.println("4. Atualizar Utilizador");
            System.out.println("5. Excluir Utilizador");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    insertUser();
                    break;
                case 2:
                    getAllUsers();
                    break;
                case 3:
                    getUserById();
                    break;
                case 4:
                    updateUser();
                    break;
                case 5:
                    deleteUser();
                    break;
                case 0:
                    System.out.println("A sair do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (choice != 0);

        userController.closeConnection();
    }

    void insertUser() {
        System.out.print("Primeiro Nome: ");
        String firstName = scanner.next();
        System.out.print("Último Nome: ");
        String lastName = scanner.next();
        System.out.print("Data de Nascimento: ");
        String dateOfBirth = scanner.next();
        System.out.print("Email: ");
        String email = scanner.next();
        System.out.print("Telefone: ");
        String phone = scanner.next();
        System.out.print("Endereço: ");
        String address = scanner.next();
        System.out.print("Posição (MANAGER/ATTENDANT): ");
        String positionStr = scanner.next();
        User.Position position = User.Position.valueOf(positionStr);
        System.out.print("Salário: ");
        double salary = scanner.nextDouble();

        User user = new User(firstName, lastName, dateOfBirth, email, phone, address, position, salary);
        userController.insertUser(user);
    }

    void getAllUsers() {
        System.out.println(userController.getAllUsers());
    }

    void getUserById() {
        System.out.print("ID do Utilizador: ");
        long id = scanner.nextLong();
        System.out.println(userController.getUserById(id));
    }

    void updateUser() {
        System.out.print("ID do Utilizador: ");
        long id = scanner.nextLong();
        System.out.print("Primeiro Nome: ");
        String firstName = scanner.next();
        System.out.print("Último Nome: ");
        String lastName = scanner.next();
        System.out.print("Data de Nascimento: ");
        String dateOfBirth = scanner.next();
        System.out.print("Email: ");
        String email = scanner.next();
        System.out.print("Telefone: ");
        String phone = scanner.next();
        System.out.print("Endereço: ");
        String address = scanner.next();
        System.out.print("Cargo (MANAGER ou ATTENDANT): ");
        String positionStr = scanner.next();
        User.Position position = User.Position.valueOf(positionStr);
        System.out.print("Salário: ");
        double salary = scanner.nextDouble();

        User user = new User(firstName, lastName, dateOfBirth, email, phone, address, position, salary);
        user.setUserID(id);
        userController.updateUser(user);
    }

    void deleteUser() {
        System.out.print("ID do Utilizador a ser excluído: ");
        long id = scanner.nextLong();
        userController.deleteUser(id);
    }

    public static void main(String[] args) throws SQLException {
        UserView userView = new UserView();
        userView.showMenu();
    }
}

