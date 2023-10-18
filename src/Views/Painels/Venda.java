/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.Painels;

import Controllers.ClienteDAOImpl;
import Controllers.ListaDAOImpl;
import Controllers.VendaDAOImpl;
import Modelos.Cliente;
import Modelos.Fornecedor;
import Modelos.Lista;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Matavele's
 */
public class Venda extends javax.swing.JPanel {
    
    private ListaDAOImpl gestor;
    private ClienteDAOImpl gestor1;
    private VendaDAOImpl gestor2;
    private DefaultComboBoxModel model;
    private DefaultTableModel modelo;
    private double total;
    /**
     * Creates new form Venda
     */
    public Venda() {
        gestor = new ListaDAOImpl();
        gestor1 = new ClienteDAOImpl();
        gestor2 = new VendaDAOImpl();
        initComponents();
        modelo = new DefaultTableModel();
        model = new DefaultComboBoxModel();
        
        modelo.addColumn("Id");
        modelo.addColumn("Produto");
        modelo.addColumn("Quantidade");
        combo();
    }
    
    public void combo(){
         List cat = gestor1.listarCliente();

        Iterator it = cat.iterator();
        
        while (it.hasNext()) {
            
           Cliente produto = (Cliente) it.next();
            String nome = produto.getNome();

            model.addElement(nome);
        }
        
        combox.setModel(model);
    }
    
    public void tabela(){
        total = 0;
        modelo.setRowCount(0);
        int selected = combox.getSelectedIndex();
        
        if(selected == -1){
            JOptionPane.showMessageDialog(null, "selecione o Cliente!");
            return;
        }
        
        List clientes = gestor1.listarCliente();
        
        if (clientes != null && selected>= 0 && selected < clientes.size()){
            Cliente cliente = (Cliente) clientes.get(selected);
            
            List vens = gestor.buscarListaCliente(cliente);
            
            Iterator it = vens.iterator();
            
            while(it.hasNext()){
                Lista li = (Lista) it.next();
                
                Object[] fila = new Object[3];
                
                fila[0] = li.getCliente().getId();
                fila[1] = li.getProduto().getNomeProduto();
                fila[2] = li.getQuantidade();
                
                total += li.getTotal();
                
                modelo.addRow(fila);
                
            }
            tabela.setModel(modelo);
        }
//        List<Venda> vendas = gestor.buscarListaCliente(cliente);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        combox = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tPane = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setLayout(new java.awt.GridLayout(2, 2));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        add(jScrollPane1);

        jPanel4.setLayout(new java.awt.GridLayout());

        jPanel2.setLayout(new java.awt.GridLayout(7, 0));

        combox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxActionPerformed(evt);
            }
        });
        jPanel2.add(combox);

        jPanel8.setLayout(new java.awt.GridLayout(1, 2));

        jLabel8.setText("Total da Lista");
        jPanel8.add(jLabel8);

        tPane.setEditable(false);
        tPane.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(tPane);

        jPanel8.add(jScrollPane3);

        jPanel2.add(jPanel8);

        jLabel3.setText("Valor Pago");
        jPanel2.add(jLabel3);
        jPanel2.add(jTextField1);

        jPanel7.setLayout(new java.awt.GridLayout(1, 2));

        jLabel4.setText("Trocos");
        jPanel7.add(jLabel4);

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(jTextPane1);

        jPanel7.add(jScrollPane2);

        jPanel2.add(jPanel7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1);

        jPanel3.setLayout(new java.awt.GridLayout(1, 3));

        jButton1.setText("Vender");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        jButton4.setText("Atualizar");
        jPanel3.add(jButton4);

        jButton2.setText("Cancelar");
        jPanel3.add(jButton2);

        jButton3.setText("Eliminar");
        jPanel3.add(jButton3);

        jPanel2.add(jPanel3);

        jPanel4.add(jPanel2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 161, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5);

        add(jPanel4);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        add(jScrollPane4);
    }// </editor-fold>//GEN-END:initComponents

    private void comboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxActionPerformed
        tabela();
        tPane.setText(""+total);
    }//GEN-LAST:event_comboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane tPane;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
