/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Views.Painels.CategoriaR;
import Views.Painels.ClienteR;
import Views.Painels.FornecedorR;
import Views.Painels.ListaC;
import Views.Painels.ProdutoR;
import Views.Painels.Venda;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.fonts.roboto_mono.FlatRobotoMonoFont;
import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatHighContrastIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatMonokaiProIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatNordIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatVuesionIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialPalenightIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMoonlightIJTheme;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author Matavele's
 */
public class Home extends javax.swing.JFrame {

    private Venda painelVenda;
    private FornecedorR painelForn;
    private ProdutoR painelProd;
    private ListaC painelLista;
    private CategoriaR painelCateg;
    private ClienteR painelCliente;
    private DrawerController dr;

    private boolean a = false;

    /**
     * Creates new form Home
     */
    public Home() {
        painelVenda = new Venda();
        painelForn = new FornecedorR();
        painelProd = new ProdutoR();
        painelLista = new ListaC();
        painelCateg = new CategoriaR();
        painelCliente = new ClienteR();
//        UIManager.put("Button.arc", 999);
        initComponents();
        setTitle("Gwevissa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(800, 600));
        setLocationRelativeTo(null);
        jButton1.putClientProperty("JButton.buttonType", "help");
        jButton11.putClientProperty("JButton.buttonType", "toolBarButton");
        jButton10.putClientProperty("JButton.buttonType", "toolBarButton");
        jButton12.putClientProperty("JButton.buttonType", "toolBarButton");
        jButton13.putClientProperty("JButton.buttonType", "toolBarButton");
        jButton7.putClientProperty("JButton.buttonType", "toolBarButton");
        jButton20.putClientProperty("JButton.buttonType", "toolBarButton");
        jButton20.putClientProperty("JComponent.minimumHeight", 45);
        jButton21.putClientProperty("JButton.buttonType", "toolBarButton");
        jButton22.putClientProperty("JButton.buttonType", "toolBarButton");
        jButton23.putClientProperty("JButton.buttonType", "toolBarButton");
        jButton24.putClientProperty("JButton.buttonType", "toolBarButton");
        jButton25.putClientProperty("JButton.buttonType", "toolBarButton");
        jButton2.putClientProperty("JButton.buttonType", "toolBarButton");

        dr = Drawer.newDrawer(this).header(jPanel5)
                .background(new Color(33, 33, 33))
                .enableScroll(true)
                .enableScrollUI(false)
                .separator(1, new Color(33, 33, 33))
                .addChild(jPanel4)
                .separator(1, new Color(33, 33, 33))
                .addChild(jPanel10)
                .addFooter(jPanel6)
                .build();

        jPopupMenu1.add(jButton2);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        perf2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        perf1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel14 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();

        perf2.setPreferredSize(new java.awt.Dimension(140, 25));
        perf2.setLayout(new java.awt.BorderLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Terminar Sessão");
        perf2.add(jLabel7, java.awt.BorderLayout.CENTER);

        jLabel8.setText("t");
        perf2.add(jLabel8, java.awt.BorderLayout.LINE_START);

        perf1.setPreferredSize(new java.awt.Dimension(140, 25));
        perf1.setLayout(new java.awt.BorderLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Configurações");
        perf1.add(jLabel5, java.awt.BorderLayout.CENTER);

        jLabel6.setText("c");
        perf1.add(jLabel6, java.awt.BorderLayout.LINE_START);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jPanel10.setLayout(new java.awt.BorderLayout());
        jPanel10.add(jPanel16, java.awt.BorderLayout.CENTER);

        jButton2.setText("Sair");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 800));

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(638, 50));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel12.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });
        jPanel12.setLayout(new java.awt.GridLayout(2, 2));
        jPanel12.add(jLabel2);
        jPanel12.add(jLabel3);

        jPanel17.setLayout(new java.awt.GridLayout(1, 3));

        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/icons8-menu-24.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton10);

        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton12);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/icons8-notification-25.png"))); // NOI18N
        jPanel17.add(jButton11);

        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton13);

        jPanel12.add(jPanel17);

        jPanel7.setLayout(new java.awt.GridLayout(1, 3));
        jPanel12.add(jPanel7);

        jPanel1.add(jPanel12, java.awt.BorderLayout.LINE_START);

        jPanel13.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel13.setLayout(new java.awt.GridLayout(2, 3));
        jPanel13.add(jLabel15);
        jPanel13.add(jLabel10);
        jPanel13.add(jLabel16);
        jPanel13.add(jLabel12);
        jPanel13.add(jLabel13);

        jPanel3.setLayout(new java.awt.GridLayout(1, 2));

        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Terminar Sessão");
        jButton7.setOpaque(true);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);
        jPanel3.add(jButton1);

        jPanel13.add(jPanel3);

        jPanel1.add(jPanel13, java.awt.BorderLayout.LINE_END);

        jPanel2.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setToolTipText("");

        jPanel14.setPreferredSize(new java.awt.Dimension(0, 291));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jPanel5.setPreferredSize(new java.awt.Dimension(101, 50));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel9.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("GWEVISSA.proj");
        jPanel5.add(jLabel9, java.awt.BorderLayout.CENTER);

        jPanel14.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jPanel8.setLayout(new java.awt.GridLayout(10, 0));

        jLabel19.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setText("Principal");
        jPanel8.add(jLabel19);

        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("Clientes");
        jButton20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton20);

        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("Categoria");
        jButton21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton21);

        jLabel20.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 153, 153));
        jLabel20.setText("Admin");
        jPanel8.add(jLabel20);

        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("Venda");
        jButton22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton22);

        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("Produtos");
        jButton23.setHideActionText(true);
        jButton23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton23);

        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("Fornecedores");
        jButton24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton24);

        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("Lista");
        jButton25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton25);

        jPanel4.add(jPanel8);

        jPanel14.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel6.setLayout(new java.awt.GridLayout(1, 3));

        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("def");
        jPanel6.add(jButton8);

        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("night");
        jPanel6.add(jButton9);

        jPanel14.add(jPanel6, java.awt.BorderLayout.PAGE_END);

        jScrollPane1.setViewportView(jPanel14);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.WEST);
        jPanel2.add(jPanel9, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked

    }//GEN-LAST:event_jPanel12MouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        //create void for methode hide and show panel menu
//        if (a == true) {
//            hideshow(jPanel14, a);
//            SwingUtilities.updateComponentTreeUI(this);
//            //create methode change image
//
//            a = false;
//        } else {
//            hideshow(jPanel14, a);
//            SwingUtilities.updateComponentTreeUI(this);
//            a = true;
//        }
        if (dr.isShow()) {
            dr.hide();
        } else {
            dr.show();
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        jPopupMenu1.show(jButton7, WIDTH, 25);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        painelCliente = new ClienteR();
        jPanel9.removeAll();
        jPanel9.add(painelCliente, java.awt.BorderLayout.CENTER);
        revalidate();
        repaint();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed

        painelCateg = new CategoriaR();
        jPanel9.removeAll();
        jPanel9.add(painelCateg, java.awt.BorderLayout.CENTER);
        revalidate();
        repaint();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        painelVenda = new Venda();
        jPanel9.removeAll();
        jPanel9.add(painelVenda, java.awt.BorderLayout.CENTER);
        revalidate();
        repaint();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        painelProd = new ProdutoR();
        jPanel9.removeAll();
        jPanel9.add(painelProd, java.awt.BorderLayout.CENTER);
        revalidate();
        repaint();
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        painelForn = new FornecedorR();
        jPanel9.removeAll();
        jPanel9.add(painelForn, java.awt.BorderLayout.CENTER);
        revalidate();
        repaint();
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        painelLista = new ListaC();
        jPanel9.removeAll();
        jPanel9.add(painelLista, java.awt.BorderLayout.CENTER);
        revalidate();
        repaint();
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        FreshUi fresh = new FreshUi();
        fresh.setVisible(true);
        revalidate();
        repaint();
        
    }//GEN-LAST:event_jButton2MouseClicked
    public void hideshow(JPanel menushowhide, boolean dashboard) {
        if (dashboard == true) {
            menushowhide.setPreferredSize(new Dimension(0, menushowhide.getHeight()));

        } else {
            menushowhide.setPreferredSize(new Dimension(250, menushowhide.getHeight()));

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        FlatRobotoMonoFont.install(); //</editor-fold>
        FlatLaf.registerCustomDefaultsSource("Style");
        UIManager.put("defaultFont", new Font(FlatRobotoMonoFont.FAMILY, Font.PLAIN, 13));
        FlatAtomOneDarkIJTheme.setup();
//                    UIManager.put("Button.arc", 998);

//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel perf1;
    private javax.swing.JPanel perf2;
    // End of variables declaration//GEN-END:variables
}