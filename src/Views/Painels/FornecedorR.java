/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.Painels;

import Controllers.FornecedorDAOImpl;
import Controllers.ListaDAOImpl;
import Modelos.Fornecedor;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Matavele's
 */
public class FornecedorR extends javax.swing.JPanel {

    private FornecedorDAOImpl gestor;

    private DefaultTableModel modelo;

    /**
     * Creates new form Venda
     */
    public FornecedorR() {
        gestor = new FornecedorDAOImpl();
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nome");
        modelo.addColumn("Contacto");
        modelo.addColumn("Descrição");
        modelo.addColumn("Entrada");
        tabela();

    }

    public void tabela() {
        modelo.setRowCount(0);

        List fornecedores = gestor.listarFornecedores();

        Iterator it = fornecedores.iterator();

        while (it.hasNext()) {
            Fornecedor forn = (Fornecedor) it.next();

            Object[] fila = new Object[5];

            fila[0] = forn.getId();
            fila[1] = forn.getNome();
            fila[2] = forn.getDescricao();
            fila[3] = forn.getDescricao();
            fila[4] = forn.getEntrada();

            modelo.addRow(fila);
        }
        tabela.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        contField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        descField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setLayout(new java.awt.GridLayout(2, 2));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(7, 0));

        jLabel2.setText("Fornecedor");
        jPanel2.add(jLabel2);

        nomeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFieldActionPerformed(evt);
            }
        });
        jPanel2.add(nomeField);

        jLabel1.setText("Contacto");
        jPanel2.add(jLabel1);

        contField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contFieldActionPerformed(evt);
            }
        });
        jPanel2.add(contField);

        jLabel9.setText("Descrição");
        jPanel2.add(jLabel9);
        jPanel2.add(descField);

        jPanel3.setLayout(new java.awt.GridLayout(1, 3, 1, 0));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Adicionar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel6);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Editar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Eliminar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4);

        jPanel2.add(jPanel3);

        add(jPanel2);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 154, Short.MAX_VALUE)
        );

        add(jPanel1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        add(jScrollPane4);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFieldActionPerformed

    private void contFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contFieldActionPerformed

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        String nome = nomeField.getText();
        String contato = contField.getText();
        String desc = descField.getText();

        Fornecedor forn = new Fornecedor(nome, contato, desc);

        try {
            gestor.adicionarFornecedor(forn);
            JOptionPane.showMessageDialog(null, "Fornecedor Registrado!");
            nomeField.setText("");
            contField.setText("");
            descField.setText("");
            tabela();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        List<Fornecedor> forns = gestor.listarFornecedores();
        int selected = tabela.getSelectedRow();

        if (selected != -1) {
//
        String nome = nomeField.getText();
        String desc = descField.getText();
        String cont = contField.getText();
//
//            //            String nome = JOptionPane.showInputDialog("Editar nome do cliente:", modelo.getValueAt(selected, 1));
//            //            String email = JOptionPane.showInputDialog("Editar email do cliente:", modelo.getValueAt(selected, 1));
            if (nome != null && !nome.isEmpty()) {
                int id = (int) modelo.getValueAt(selected, 0);
                for (Fornecedor forn : forns) {
                    if (forn.getId() == id) {
                        forn.setNome(nome);
                        forn.setContacto(cont);    
                        gestor.atualizarFornecedor(forn);
                    }
                }
                tabela();

            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Fornecedor para editar.");
        }
    }//GEN-LAST:event_jPanel5MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contField;
    private javax.swing.JTextField descField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField nomeField;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
