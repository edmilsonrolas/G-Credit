/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.ListaDAO;
import Modelos.Categoria;
import Modelos.Cliente;
import Modelos.Lista;
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
public class ListaDAOImpl implements ListaDAO {

    private List<Lista> listas;

    public ListaDAOImpl() {
        listas = new ArrayList();
        carregar();
    }

    @Override
    public void adicionarLista(Lista lista) {
        listas.add(lista);
        salvar();
    }

    @Override
    public void atualizarLista(Lista lista) {
        int index = 0;
        for (Lista lista1 : listas) {
            if (lista1.getProduto().getId() == lista.getProduto().getId()) {
                listas.set(index, lista1);
            }
            index++;

        }
        salvar();
    }

    @Override
    public void removerLista(Lista lista) {
        int index = 0;
        for (Lista lista1 : listas) {
            if (lista1.getProduto().getId() == lista.getProduto().getId()) {
                lista.setStatus(false);
                listas.set(index, lista1);
            }
            index++;

        }
        salvar();
    }

    @Override
    public List buscarListaCliente(Cliente cliente) {
        List listinha = new ArrayList();
        for (Lista lista : listas) {
            if (lista.getCliente().getId() == cliente.getId()) {
                listinha.add(lista);
            }
        }
        return listinha;
    }

    @Override
    public List listarLista(Cliente cliente) {
        return listas;
    }

    @Override
    public void carregar() {
        File file1 = new File("listas.dat");

        if (file1.exists()) {
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file1))) {
                listas = (List<Lista>) inputStream.readObject();
                inputStream.close();
//            atualizarTabela(0);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void salvar() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("listas.dat"))) {
            outputStream.writeObject(listas);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
