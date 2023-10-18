/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.VendaDAO;
import Modelos.Categoria;
import Modelos.Cliente;
import Modelos.Venda;
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
public class VendaDAOImpl implements VendaDAO {
    
    private List<Venda> vendas;

    public VendaDAOImpl() {
        vendas = new ArrayList();
        carregar();
    }
    
    
    @Override
    public void efetuarVenda(Venda venda) {
        venda.setId(600*vendas.size()+1);
        vendas.add(venda);
        salvar();
    }

    @Override
    public void atualizarVenda(Venda venda) {
        int index = 0;
        for (Venda venda1 : vendas) {
            if(venda.getId()==venda1.getId()){
                vendas.set(index, venda1);
            }
            index++;
            
        }salvar();
        
    }

    @Override
    public void cancelarVenda(Venda venda) {
        int index = 0;
        for (Venda venda1 : vendas) {
            if(venda1.getId()==venda.getId()){
               venda.setStatusVenda(false);
               vendas.set(index, venda);
            }
            index++;
        }
        salvar();
    }

    @Override
    public Venda buscarVenda(int id) {
        for (Venda venda : vendas) {
            if(venda.getId()==id){
                return venda;
            }
            
        }return null;
    }

    @Override
    public List listaVendas() {
        return vendas;
    }
    
    @Override
    public void carregar() {
        File file1 = new File("vendas.dat");
        
        if (file1.exists()) {
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file1))) {
                vendas = (List<Venda>) inputStream.readObject();
                inputStream.close();
//            atualizarTabela(0);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void salvar() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("vendas.dat"))) {
                outputStream.writeObject(vendas);
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    @Override
    public double getTotal(Cliente cliente) {
        int total = 0;
        for (Venda venda : vendas) {
            
        }
        return total;
    }
    
}
