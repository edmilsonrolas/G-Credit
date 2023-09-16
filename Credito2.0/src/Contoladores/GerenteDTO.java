/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoladores;

import DAO.ClienteDAO;
import DAO.Hibernate;
import DAO.PedidoDAO;
import DAO.ProdutoDAO;
import Modelos.Clientes;
import Modelos.Pedidos;
import Modelos.Produtos;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author MATAVELE
 */
public class GerenteDTO implements ClienteDAO, PedidoDAO, ProdutoDAO, Hibernate {
    
    private Session session;

    @Override
    public void registarCliente(Clientes cliente) {
        iniciar();
        session.save(cliente);
        terminar();
    }

    @Override
    public void actualizarCliente(Clientes cliente) {
        iniciar();
        session.merge(cliente);
        terminar();
    }

    @Override
    public Clientes buscarCliente(Clientes cliente) {
        Clientes cli = null;
        iniciar();
        org.hibernate.Query query = session.createQuery("from Clientes where cliente_id = :identificacao");
        query.setParameter("identificacao", cliente.getClienteId());
        
        cli = (Clientes) query.uniqueResult();
        terminar();
        return cliente;
    }

    @Override
    public void removerCliente(Clientes cliente) {
        iniciar();
        session.merge(cliente);
        terminar();
    }

    @Override
    public List<Clientes> listarClientes() {
        List <Clientes> clientes = null;
        iniciar();
        clientes = session.createQuery("from Clientes").list();
        terminar();
        return clientes;
    }

    @Override
    public void fazerPedido(Clientes cliente, Produtos produtos, int quantidade, Date data_pedido) {
         Pedidos pedido = new Pedidos();
         pedido.setClientes(cliente);
         pedido.setProdutos(produtos);
         pedido.setQuantidade(quantidade);
         pedido.setPedidoId(listarPedidos().size()+1);
        iniciar();
        session.save(pedido);
        terminar();
    }

    @Override
    public List<Pedidos> pedidosDoCliente(Clientes cliente) {
        int id = cliente.getClienteId();
        List<Pedidos> pedidos = null;
        iniciar();
        org.hibernate.Query query = session.createQuery("from Pedidos where cliente_id = :identificacao");
        query.setParameter("identificacao", id);
        
        pedidos = query.list();
        terminar();
        return pedidos;
    }

    @Override
    public void registarProduto(Produtos cliente) {
       iniciar();
       session.save(cliente);
       terminar();
    }

    @Override
    public void actualizarProduto(Produtos cliente) {
        iniciar();
        session.merge(cliente);
        terminar();
    }

    @Override
    public Produtos buscarProduto(Produtos cliente) {
        Produtos client = null;
        iniciar();
        org.hibernate.Query query = session.createQuery("from Produtos where produto_id = :identificacao");
        query.setParameter("identificacao", cliente.getProdutoId());
        
        client = (Produtos) query.uniqueResult();
        terminar();
        return client;
    }

    @Override
    public void removerProduto(Produtos cliente) {
        iniciar();
        terminar();
    }

    @Override
    public List<Produtos> listarProdutos() {
        List<Produtos> produtos = null;
        iniciar();
        produtos = session.createQuery("from Produtos").list();
        terminar();
        return produtos;
    }

    @Override
    public void iniciar(){
        SessionFactory sessionFactory = Conexao.HibernateUtil.getSessionFactory();
        session=sessionFactory.openSession();
        session.getTransaction().begin();
    }
    

    @Override
    public void terminar() {
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List listarPedidos() {
       List pedidos = null;
       iniciar();
       pedidos = session.createQuery("from Pedidos").list();
       terminar();
       return pedidos;
    }

    @Override
    public Clientes credenciais(String nome, String senha) {
       Clientes cli = null;
        iniciar();
        org.hibernate.Query query = session.createQuery("from Clientes where nome = :nomeCliente and senha = :senhaCliente");
        query.setParameter("nomeCliente", nome);
        query.setParameter("senhaCliente", senha);
        
        cli = (Clientes) query.uniqueResult();
        terminar();
        return cli;
    }
    
}
