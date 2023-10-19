/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.ClienteDAO;
import Modelos.Categoria;
import Modelos.Cliente;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matavele's
 */
public class ClienteDAOImpl implements ClienteDAO{
    
    private List<Cliente> clientes;

    public ClienteDAOImpl() {
        clientes = new ArrayList();
        carregar();
    }
    
    @Override
    public void adicionarCliente(Cliente cliente) {
        cliente.setId(100*clientes.size()+1);
        clientes.add(cliente);
        salvar();
    }

    @Override
    public void atualizarCliente(Cliente cliente) {
        int index = 0;
        
        for (Cliente cliente1 : clientes) {
            if(cliente.getId()== cliente1.getId()){
                clientes.set(index, cliente);
            }
            index++;
        }
        salvar();
    }

    @Override
    public void removerCliente(Cliente cliente) {
        int index = 0;
        
        for (Cliente cliente1 : clientes) {
            if(cliente1.getId() == cliente.getId()){
                cliente.setStatus(false);
                clientes.set(index, cliente);
            }
            index++;
        }
        salvar();
    }

    @Override
    public Cliente buscarCliente(int id) {
        for (Cliente cliente : clientes) {
            if(cliente.getId()==id){
                return cliente;
            }
        }return null;
    }

    @Override
    public List listarCliente() {
        return clientes;
    }
    
    @Override
    public void carregar() {
        File file1 = new File("clientes.dat");
        
        if (file1.exists()) {
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file1))) {
                clientes = (List<Cliente>) inputStream.readObject();
                inputStream.close();
//            atualizarTabela(0);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void salvar() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("clientes.dat"))) {
                outputStream.writeObject(clientes);
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    
}
