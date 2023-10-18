/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mercearia;

import Abstract.Pessoa;
import Controllers.CategoriaDAOImpl;
import Controllers.FuncionarioDAOImpl;
import Interfaces.FuncionarioDAO;
import Modelos.Categoria;
import Modelos.Cliente;
import Modelos.Funcionario;
import java.util.List;

/**
 *
 * @author Matavele's
 */
public class Mercearia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        
        FuncionarioDAOImpl gestor = new FuncionarioDAOImpl();
        Funcionario func = new Funcionario("admin","admin","admin","funcionario","funcionario","12345678");
        
        gestor.adicionarFuncionario(func);
        
        List<Funcionario> funcionarios = gestor.listarFuncionarios();
        
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome()+" "+funcionario.getId()+" "+funcionario.isStatus());
        }
    }
    
}
