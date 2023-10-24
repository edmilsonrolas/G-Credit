/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.Painels;

import Controllers.CategoriaDAOImpl;
import Controllers.ClienteDAOImpl;
import Controllers.ListaDAOImpl;
import Modelos.Categoria;
import Modelos.Cliente;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Matavele's
 */
public class ClienteR extends javax.swing.JPanel {
    
    private ClienteDAOImpl gestor;
    private CategoriaDAOImpl gero;
    private DefaultComboBoxModel model;
    private BufferedImage image;
    
    private DefaultTableModel modelo;
    /**
     * Creates new form Venda
     */
    public ClienteR() {
        gero = new CategoriaDAOImpl();
        gestor = new ClienteDAOImpl();
        initComponents();
        try {
            // Carregue a imagem desejada (substitua o caminho pelo caminho do seu arquivo de imagem)
            image = ImageIO.read(new File("src//Icones//Abstract-Wallpaper-HD-For-Desktop.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        registrar.putClientProperty("JButton.buttonType", "roundRect");
        alterar.putClientProperty("JButton.buttonType", "roundRect");
        eliminar.putClientProperty("JButton.buttonType", "roundRect");
        model = new DefaultComboBoxModel();
        modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nome");
        modelo.addColumn("Apelido");
        modelo.addColumn("Categoria");
        modelo.addColumn("Entrada");
        modelo.addColumn("Contacto");
        tabela();
        combo();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            g.drawImage(image, 0, 0, this);
            System.out.println("debugging");
        }else{
           JOptionPane.showInternalMessageDialog(null, "eeee");
        }

    }
    
    public void tabela(){
        modelo.setRowCount(0);
        
        List clientes = gestor.listarCliente();
        
        Iterator it = clientes.iterator();
        
        while(it.hasNext()){
            Cliente cliente = (Cliente) it.next();
            
            Object[] fila = new Object[6];
            
            fila[0] = cliente.getId();
            fila[1] = cliente.getNome();
            fila[2] = cliente.getApelido();
            fila[3] = cliente.getCategoria_cliente().getNome();
            fila[4] = cliente.getDateCreated();
            fila[5] = cliente.getContacto();
            
            modelo.addRow(fila);
        }
        
        tabela.setModel(modelo);
       
    }
    
    public void combo(){
         List cat = gero.listarCategorias();

        Iterator it = cat.iterator();
        
        while (it.hasNext()) {
            
            Categoria produto = (Categoria) it.next();
            String nome = produto.getNome();

            model.addElement(nome);
        }
        
        jComboBox1.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        apelidoField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        contField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        registrar = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(500, 500));

        jPanel7.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel7.setLayout(new java.awt.GridLayout(2, 0));

        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel9.setLayout(new java.awt.GridLayout(1, 0));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        jPanel9.add(jScrollPane4);

        jPanel2.setLayout(new java.awt.GridLayout(9, 0));

        jLabel2.setText("Nome ");
        jPanel2.add(jLabel2);
        jPanel2.add(nomeField);

        jPanel8.setLayout(new java.awt.GridLayout(1, 2));

        jLabel8.setText("Apelido");
        jPanel8.add(jLabel8);

        jPanel2.add(jPanel8);

        apelidoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apelidoFieldActionPerformed(evt);
            }
        });
        jPanel2.add(apelidoField);

        jLabel1.setText("Contacto");
        jPanel2.add(jLabel1);

        contField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contFieldActionPerformed(evt);
            }
        });
        jPanel2.add(contField);

        jLabel3.setText("Categoria");
        jPanel2.add(jLabel3);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox1);

        jPanel3.setLayout(new java.awt.GridLayout(1, 3));

        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        jPanel3.add(registrar);

        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });
        jPanel3.add(alterar);

        eliminar.setText("Remover");
        jPanel3.add(eliminar);

        jPanel2.add(jPanel3);

        jPanel9.add(jPanel2);

        jPanel11.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel11);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setPreferredSize(new java.awt.Dimension(600, 50));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Clientes Cadastrados");
        jPanel4.add(jLabel5, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setPreferredSize(new java.awt.Dimension(500, 427));
        jPanel5.setRequestFocusEnabled(false);
        jPanel5.setLayout(new java.awt.BorderLayout());

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

        jPanel5.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel1);

        jScrollPane2.setViewportView(jPanel7);

        add(jScrollPane2);
    }// </editor-fold>//GEN-END:initComponents

    private void contFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contFieldActionPerformed

    private void apelidoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apelidoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apelidoFieldActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
       String nome = nomeField.getText();
        String apelido = apelidoField.getText();
        String contato = contField.getText();
        
        int selectedIndex = jComboBox1.getSelectedIndex();
        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma Categoria.");
            return;
        }
        
        List cat = gero.listarCategorias();
        
        if (cat != null && selectedIndex >= 0 && selectedIndex < cat.size()) {
            Categoria prod = (Categoria) cat.get(selectedIndex);
            Cliente cliente = new Cliente(prod,nome,apelido,contato);

            try {
                gestor.adicionarCliente(cliente);
                JOptionPane.showMessageDialog(null, "novo Cliente adicionado!");
                nomeField.setText("");
                apelidoField.setText("");
                contField.setText("");
                tabela();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Categoria selecionada inválida.");
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
       List<Categoria> cs = gero.listarCategorias();
        List<Cliente> clientes = gestor.listarCliente();
        int com = jComboBox1.getSelectedIndex();
        int selected = tabela.getSelectedRow();

        if (selected != -1) {
            Categoria cat = cs.get(com);
            String nome = nomeField.getText();
            String apelido = apelidoField.getText();
            String contacto = contField.getText();

            //            String nome = JOptionPane.showInputDialog("Editar nome do cliente:", modelo.getValueAt(selected, 1));
            //            String email = JOptionPane.showInputDialog("Editar email do cliente:", modelo.getValueAt(selected, 1));
            if (nome != null && !nome.isEmpty()) {
                int id = (int) modelo.getValueAt(selected, 0);
                for (Cliente cliente : clientes) {
                    if (cliente.getId() == id) {
                        cliente.setNome(nome);
                        cliente.setApelido(apelido);
                        cliente.setContacto(contacto);
                        cliente.setCategoria_cliente(cat);
                        
                        gestor.atualizarCliente(cliente);
                        
                    }
                }
                tabela();

            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente para editar.");
        }
    }//GEN-LAST:event_alterarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JTextField apelidoField;
    private javax.swing.JTextField contField;
    private javax.swing.JButton eliminar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField nomeField;
    private javax.swing.JButton registrar;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
