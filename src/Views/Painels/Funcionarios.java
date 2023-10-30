/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.Painels;

import Controllers.CategoriaDAOImpl;
import Controllers.ClienteDAOImpl;
import Controllers.FuncionarioDAOImpl;
import Controllers.ListaDAOImpl;
import Modelos.Categoria;
import Modelos.Cliente;
import Modelos.Funcionario;
import Modelos.NivelAcesso;
import Views.Painels.Componentes.PasswordStrengthStatus;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Matavele's
 */
public class Funcionarios extends javax.swing.JPanel {

    private FuncionarioDAOImpl gestor;
    private CategoriaDAOImpl gero;
    private DefaultComboBoxModel model;
    private BufferedImage image;
    private PasswordStrengthStatus pss;

    private DefaultTableModel modelo;

    /**
     * Creates new form Venda
     */
    public Funcionarios() {
        gero = new CategoriaDAOImpl();
        gestor = new FuncionarioDAOImpl();
        initComponents();
        pss = new PasswordStrengthStatus();
        

        try {
            // Carregue a imagem desejada (substitua o caminho pelo caminho do seu arquivo de imagem)
            image = ImageIO.read(new File("src//Icones//Abstract-Wallpaper-HD-For-Desktop.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        registrar.putClientProperty("JButton.buttonType", "roundRect");
        alterar.putClientProperty("JButton.buttonType", "roundRect");
        eliminar.putClientProperty("JButton.buttonType", "roundRect");
        pass.putClientProperty(FlatClientProperties.STYLE, ""
                + "showRevealButton:true");
        pass.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "editar senha");
        
        model = new DefaultComboBoxModel();
        modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nome");
        modelo.addColumn("Apelido");
        modelo.addColumn("Nivel de Acesso");
        modelo.addColumn("Entrada");
        modelo.addColumn("Contacto");
        modelo.addColumn("Senha");
        modelo.addColumn("Salario");
        modelo.addColumn("Bonus");
        pss.initPasswordField(pass);
        jPanel2.add(pass);
        jPanel3.add(pss);
        tabela();
        combo();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            g.drawImage(image, 0, 0, this);

        }

    }

    public void tabela() {
        modelo.setRowCount(0);

        List funcionarios = gestor.listarFuncionarios();

        Iterator it = funcionarios.iterator();

        while (it.hasNext()) {
            Funcionario funcionario = (Funcionario) it.next();

            Object[] fila = new Object[9];

            fila[0] = funcionario.getId();
            fila[1] = funcionario.getNome();
            fila[2] = funcionario.getApelido();
            fila[3] = funcionario.getNivelAcesso();
            fila[4] = funcionario.getDateCreated();
            fila[5] = funcionario.getContacto();
            fila[6] = funcionario.getSenha();
            fila[7] = funcionario.getSalario();
            fila[8] = funcionario.getBonus();

            modelo.addRow(fila);
        }

        tabela.setModel(modelo);

    }

    public void combo() {
        NivelAcesso[] cat = NivelAcesso.values();
       
        for (NivelAcesso nivelAcesso : cat) {
            model.addElement(nivelAcesso);
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

        pass = new javax.swing.JPasswordField();
        panelBorder2 = new com.raven.swing.PanelBorder();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        imageAvatar1 = new Views.Painels.ImageAvatar();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        panelBorder3 = new com.raven.swing.PanelBorder();
        jLabel2 = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        apelidoField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        contField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        panelBorder4 = new com.raven.swing.PanelBorder();
        registrar = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        panelBorder1 = new com.raven.swing.PanelBorder();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(500, 500));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

        panelBorder2.setPreferredSize(new java.awt.Dimension(467, 250));
        panelBorder2.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        jLayeredPane1.setLayout(new javax.swing.OverlayLayout(jLayeredPane1));

        imageAvatar1.setLayout(new java.awt.FlowLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jButton1.setText("Adicionar Fotografia");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setText("jButton2");
        jPanel1.add(jButton2);

        jButton3.setText("jButton3");
        jPanel1.add(jButton3);

        imageAvatar1.add(jPanel1);

        jLayeredPane1.add(imageAvatar1);

        panelBorder2.add(jLayeredPane1);

        panelBorder3.setLayout(new java.awt.GridLayout(14, 0));

        jLabel2.setText("Nome ");
        panelBorder3.add(jLabel2);
        panelBorder3.add(nomeField);

        jLabel8.setText("Apelido");
        panelBorder3.add(jLabel8);

        apelidoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apelidoFieldActionPerformed(evt);
            }
        });
        panelBorder3.add(apelidoField);

        jLabel1.setText("Contacto");
        panelBorder3.add(jLabel1);

        contField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contFieldActionPerformed(evt);
            }
        });
        panelBorder3.add(contField);

        jLabel4.setText("Username");
        panelBorder3.add(jLabel4);

        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        panelBorder3.add(jTextField1);

        jLabel6.setText("Senha");
        panelBorder3.add(jLabel6);

        jPanel2.setLayout(new java.awt.BorderLayout());
        panelBorder3.add(jPanel2);

        jPanel3.setLayout(new java.awt.BorderLayout());
        panelBorder3.add(jPanel3);

        jLabel3.setText("Nivel De Acesso");
        panelBorder3.add(jLabel3);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelBorder3.add(jComboBox1);

        panelBorder4.setLayout(new java.awt.GridLayout(1, 3));

        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        panelBorder4.add(registrar);

        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });
        panelBorder4.add(alterar);

        eliminar.setText("Remover");
        panelBorder4.add(eliminar);

        panelBorder3.add(panelBorder4);

        panelBorder2.add(panelBorder3);

        add(panelBorder2);

        panelBorder1.setPreferredSize(new java.awt.Dimension(600, 240));
        panelBorder1.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Funcionarios Cadastrados");
        panelBorder1.add(jLabel5, java.awt.BorderLayout.NORTH);

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
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        panelBorder1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(panelBorder1);
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
            Funcionario funcionario = new Funcionario(nome, contato, apelido, nome, apelido, contato);
            funcionario.setPerfil((ImageIcon) imageAvatar1.getIcon());

            try {
                gestor.adicionarFuncionario(funcionario);
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
        NivelAcesso[] cs = NivelAcesso.values();
        List<Funcionario> funcionarios = gestor.listarFuncionarios();
        int com = jComboBox1.getSelectedIndex();
        int selected = tabela.getSelectedRow();

        if (selected != -1) {
            
            String nome = nomeField.getText();
            String apelido = apelidoField.getText();
            String contacto = contField.getText();

            //            String nome = JOptionPane.showInputDialog("Editar nome do cliente:", modelo.getValueAt(selected, 1));
            //            String email = JOptionPane.showInputDialog("Editar email do cliente:", modelo.getValueAt(selected, 1));
            if (nome != null && !nome.isEmpty()) {
                int id = (int) modelo.getValueAt(selected, 0);
                for (Funcionario funcionario : funcionarios) {
                    if (funcionario.getId() == id) {
                        funcionario.setNome(nome);
                        funcionario.setApelido(apelido);
                        funcionario.setContacto(contacto);
                        funcionario.setNivelAcesso(contacto);

                        gestor.atualizarFuncionario(funcionario);

                    }
                }
                tabela();

            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente para editar.");
        }
    }//GEN-LAST:event_alterarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            // Carregue a imagem no JLabel
            ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());

            imageAvatar1.setIcon(imageIcon);
            revalidate();
            repaint();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked

        int selected = tabela.getSelectedRow();
        if (selected != -1) {
            int id = (int) modelo.getValueAt(selected, 0);

            Funcionario funcionario = gestor.buscarFuncionario(id);
            nomeField.setText(funcionario.getNome());
            apelidoField.setText(funcionario.getApelido());
            contField.setText(funcionario.getContacto());
            jComboBox1.setSelectedItem(funcionario.getNivelAcesso());
            imageAvatar1.setIcon(funcionario.getPerfil());
            revalidate();
            repaint();
        } else {
            System.out.println("yoo");
        }

    }//GEN-LAST:event_tabelaMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JTextField apelidoField;
    private javax.swing.JTextField contField;
    private javax.swing.JButton eliminar;
    private Views.Painels.ImageAvatar imageAvatar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nomeField;
    private com.raven.swing.PanelBorder panelBorder1;
    private com.raven.swing.PanelBorder panelBorder2;
    private com.raven.swing.PanelBorder panelBorder3;
    private com.raven.swing.PanelBorder panelBorder4;
    private javax.swing.JPasswordField pass;
    private javax.swing.JButton registrar;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
