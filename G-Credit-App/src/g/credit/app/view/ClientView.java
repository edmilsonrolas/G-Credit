/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.credit.app.view;

import g.credit.app.controller.ClientController;
import g.credit.app.model.Client;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Classe para interagir com operações relacionadas a Clientes.
 */
public class ClientView {
    private final Scanner scanner;
    private final ClientController clientController;

    public ClientView() {
        scanner = new Scanner(System.in);
        clientController = new ClientController();
    }

    public void showMenu() throws SQLException {
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Cliente");
            System.out.println("2. Listar Todos os Clientes");
            System.out.println("3. Buscar Cliente por ID");
            System.out.println("4. Atualizar Cliente");
            System.out.println("5. Excluir Cliente");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    insertClient();
                    break;
                case 2:
                    getAllClients();
                    break;
                case 3:
                    getClientById();
                    break;
                case 4:
                    updateClient();
                    break;
                case 5:
                    deleteClient();
                    break;
                case 0:
                    System.out.println("A sair do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (choice != 0);

        clientController.closeConnection();
    }

    void insertClient() {
        System.out.print("Nome: ");
        String name = scanner.nextLine();
        System.out.print("Apelido: ");
        String lastName = scanner.nextLine();
        System.out.print("Telefone: ");
        String phone = scanner.nextLine();
        System.out.print("Endereço: ");
        String address = scanner.nextLine();
        Client client = new Client(name, lastName, phone, address);
        clientController.insertClient(client);
    }


    void getAllClients() {
        System.out.println(clientController.getAllClients());
    }

    void getClientById() {
        System.out.print("ID do Cliente: ");
        long id = scanner.nextLong();
        System.out.println(clientController.getClientById(id));
    }

    void updateClient() {
        System.out.print("ID do Cliente: ");
        long customerID = scanner.nextLong();
        System.out.print("Novo Nome: ");
        String firstName = scanner.nextLine();
        System.out.print("Novo Apelido: ");
        String lastName = scanner.nextLine();
        System.out.print("Nova Data de Nascimento: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Novo Email: ");
        String email = scanner.nextLine();
        System.out.print("Novo Telefone: ");
        String phone = scanner.nextLine();
        System.out.print("Novo Endereço: ");
        String address = scanner.nextLine();
        System.out.print("Pontos de Fidelidade: ");
        int loyaltyPoints = scanner.nextInt();

        Client client = new Client(firstName, lastName, dateOfBirth, email, phone, address, loyaltyPoints);
        client.setCustomerID(customerID);
        clientController.updateClient(client);
    }

    void deleteClient() {
        System.out.print("ID do Cliente a ser excluído: ");
        long id = scanner.nextLong();
        clientController.deleteUser(id);
    }

    public static void main(String[] args) throws SQLException {
        ClientView app = new ClientView();
        app.showMenu();
    }
}

