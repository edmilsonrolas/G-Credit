/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.ProdutoDAO;
import Modelos.Categoria;
import Modelos.Produto;
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
public class ProdutosDAOImpl implements ProdutoDAO {
    private List<Produto> produtos;

    public ProdutosDAOImpl() {
       produtos = new ArrayList();
       carregar();
    }
    
    
    @Override
    public void adicionarProduto(Produto produto) {
        produto.setId(500*produtos.size()+1);
        produtos.add(produto);
        salvar();
    }

    @Override
    public void atualizarProdutos(Produto produto) {
        int index = 0;
        for (Produto produto1 : produtos) {
            if(produto1.getId()==produto.getId()){
                produtos.set(index, produto);
            }
            index++;
        }
        salvar();
    }

    @Override
    public Produto buscarProduto(int id) {
        for (Produto produto : produtos) {
            if(produto.getId()==id){
                return produto;
            }
        }return null;
    }

    @Override
    public void removerProduto(Produto produto) {
        int index = 0;
        for (Produto produto1 : produtos) {
            if (produto1.getId()==produto.getId()) {
                
                produto.setStatus(false);
                produtos.set(index, produto);
                
            }
            index++;
        }
        salvar();
    }

    @Override
    public List listarProdutos() {
        return produtos;
    }
    
    @Override
    public void carregar() {
        File file1 = new File("produtos.dat");
        
        if (file1.exists()) {
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file1))) {
                produtos = (List<Produto>) inputStream.readObject();
                inputStream.close();
//            atualizarTabela(0);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void salvar() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("produtos.dat"))) {
                outputStream.writeObject(produtos);
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    
}
