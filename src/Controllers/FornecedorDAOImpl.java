/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.FornecedorDAO;
import Modelos.Categoria;
import Modelos.Fornecedor;
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
public class FornecedorDAOImpl implements FornecedorDAO{
    
    private List<Fornecedor> fornecedores;

    public FornecedorDAOImpl() {
        fornecedores = new ArrayList();
        carregar();
    }
    
    
    @Override
    public void adicionarFornecedor(Fornecedor fornecedor) {
        fornecedor.setId(200*fornecedores.size()+1);
        fornecedores.add(fornecedor);
        salvar();
    }

    @Override
    public void atualizarFornecedor(Fornecedor fornecedor) {
        int index = 0;
        
        for (Fornecedor fornecedore : fornecedores) {
            if(fornecedor.getId()==fornecedore.getId()){
                fornecedores.set(index, fornecedor);
            }
            index++;
        }
        salvar();
    }

    @Override
    public Fornecedor buscarFornecedor(int id) {
        
        for (Fornecedor fornecedore : fornecedores) {
            if(fornecedore.getId()==id){
                return fornecedore;
            }
        }return null;
    }

    @Override
    public void removerFornecedor(Fornecedor fornecedor) {
        int index = 0;
        
        for (Fornecedor fornecedore : fornecedores) {
            if (fornecedore.getId()==fornecedor.getId()) {
                fornecedor.setStatus(false);
                fornecedores.set(index, fornecedor);
                
            }
            index++;
        }
        salvar();
    }

    @Override
    public List listarFornecedores() {
        return fornecedores;
    }
    
    @Override
    public void carregar() {
        File file1 = new File("fornecedores.dat");
        
        if (file1.exists()) {
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file1))) {
                fornecedores = (List<Fornecedor>) inputStream.readObject();
                inputStream.close();
//            atualizarTabela(0);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void salvar() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("fornecedores.dat"))) {
                outputStream.writeObject(fornecedores);
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    
}
