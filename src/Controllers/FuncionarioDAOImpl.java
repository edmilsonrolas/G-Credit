/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Abstract.Pessoa;
import Interfaces.FuncionarioDAO;
import Modelos.Categoria;
import Modelos.Funcionario;
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
public class FuncionarioDAOImpl implements FuncionarioDAO {
    
    private List<Funcionario> funcionarios;
    
    public FuncionarioDAOImpl(){
        funcionarios = new ArrayList();
        carregar();
    }

    @Override
    public void adicionarFuncionario(Pessoa pessoa) {
        if(pessoa instanceof Funcionario){
        Funcionario funcionario = (Funcionario) pessoa;
        funcionario.setId(400*funcionarios.size()+1);
        funcionarios.add(funcionario);
        salvar();
        }
    }

    @Override
    public void atualizarFuncionario(Funcionario funcionario) {
        int index = 0;
        for (Funcionario funcionario1 : funcionarios) {
            if (funcionario1.getId()==funcionario.getId()) {
                funcionarios.set(index, funcionario);
            }
            index++;
        }
        salvar();
    }

    @Override
    public void removerFuncionario(Funcionario funcionario) {
        int index = 0;
        for (Funcionario funcionario1 : funcionarios) {
            if(funcionario1.getId()==funcionario.getId()){
                funcionario.setStatus(false);
                funcionarios.set(index, funcionario);
            }
            index++;
            
        }
        salvar();
    }

    @Override
    public Funcionario buscarFuncionario(int id) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId()==id) {
                return funcionario;
                
                
            }
            
        }return null;
    }

    @Override
    public List listarFuncionarios() {
        return funcionarios;
    }
    
    @Override
    public void carregar() {
        File file1 = new File("funcionarios.dat");
        
        if (file1.exists()) {
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file1))) {
                funcionarios = (List<Funcionario>) inputStream.readObject();
                inputStream.close();
//            atualizarTabela(0);
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("");
                e.printStackTrace();
            }
        }
    }

    @Override
    public void salvar() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("funcionarios.dat"))) {
                outputStream.writeObject(funcionarios);
                outputStream.close();
            } catch (IOException e) {
                System.out.println("eee");
                e.printStackTrace();
            }
    }
    
    public Funcionario credencial(String username, String senha){
        for (Funcionario funcionario : funcionarios) {
            if(funcionario.getUsername().equals(username) && funcionario.getSenha().equals(senha)){
                return funcionario;
            }
        }return null;
    }

    
    
}
