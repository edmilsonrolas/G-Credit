/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Modelos.Categoria;
import Modelos.Operadora;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import Interfaces.OperadoraDAO;

/**
 *
 * @author Matavele's
 */
public class OperadoraDAOImpl implements OperadoraDAO{
    
    private List<Operadora> operadoras;

    public OperadoraDAOImpl() {
        operadoras = new ArrayList();
        carregar();
    }
    
    
    @Override
    public void adicionarOperadora(Operadora fornecedor) {
        fornecedor.setId(200*operadoras.size()+1);
        operadoras.add(fornecedor);
        salvar();
    }

    @Override
    public void atualizarOperadora(Operadora fornecedor) {
        int index = 0;
        
        for (Operadora fornecedore : operadoras) {
            if(fornecedor.getId()==fornecedore.getId()){
                operadoras.set(index, fornecedor);
            }
            index++;
        }
        salvar();
    }

    @Override
    public Operadora buscarOperadora(int id) {
        
        for (Operadora fornecedore : operadoras) {
            if(fornecedore.getId()==id){
                return fornecedore;
            }
        }return null;
    }

    @Override
    public void removerOperadora(Operadora fornecedor) {
        int index = 0;
        
        for (Operadora fornecedore : operadoras) {
            if (fornecedore.getId()==fornecedor.getId()) {
                fornecedor.setStatus(false);
                operadoras.set(index, fornecedor);
                
            }
            index++;
        }
        salvar();
    }

    @Override
    public List listarOperadoras() {
        return operadoras;
    }
    
    @Override
    public void carregar() {
        File file1 = new File("fornecedores.dat");
        
        if (file1.exists()) {
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file1))) {
                operadoras = (List<Operadora>) inputStream.readObject();
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
                outputStream.writeObject(operadoras);
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    
}
