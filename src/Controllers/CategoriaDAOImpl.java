/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.CategoriaDAO;
import Modelos.Categoria;
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
public class CategoriaDAOImpl implements CategoriaDAO {
    
    private List<Categoria> categorias;

    public CategoriaDAOImpl() {
        categorias = new ArrayList();
        carregar();
    }
    
    

    @Override
    public void adicionarCategoria(Categoria categoria) {
        categoria.setId(categorias.size()+1);
        categorias.add(categoria);
        salvar();
    }

    @Override
    public void atualizarCategoria(Categoria categoria) {
        int index = 0;
        
        for (Categoria categoria1 : categorias) {
            if(categoria1.getId() == categoria.getId()){
                categorias.set(index, categoria);
            }
            index++;
        }
        salvar();
    }

    @Override
    public void removerCategoria(Categoria categoria) {
        int index = 0;
        
        for (Categoria categoria1 : categorias) {
            if(categoria1.getId()==categoria.getId()){
                categoria.setStatus(false);
                categorias.set(index, categoria);
            }
            index++;
            
        }
        salvar();
    }

    @Override
    public Categoria buscarCategoria(int id) {
        
        for (Categoria categoria : categorias) {
            if (categoria.getId()==id) {
                return categoria;
                
            }
            
        }return null;
    }

    @Override
    public List listarCategorias() {
        return categorias;
    }

    @Override
    public void carregar() {
        File file1 = new File("categorias.dat");
        
        if (file1.exists()) {
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file1))) {
                categorias = (List<Categoria>) inputStream.readObject();
                inputStream.close();
//            atualizarTabela(0);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void salvar() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("categorias.dat"))) {
                outputStream.writeObject(categorias);
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    
}
