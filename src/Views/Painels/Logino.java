/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views.Painels;

import Controllers.FuncionarioDAOImpl;
import Views.FreshUi;
import Views.Home;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;
import raven.toast.Notifications;

/**
 *
 * @author Matavele's
 */
public class Logino extends JPanel {

    private final JTextField user;
    private final JPasswordField pass;
    private final JCheckBox lembrete;
    private final JButton login;
    private final JFrame frame;
    private Notifications notes;
    private BufferedImage image;

    private Component criarTabela() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        panel.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:null");

        JButton registar = new JButton("<html><a href=\"#\">Assinar</a></html>");
        registar.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:3,3,3,3");
        registar.setContentAreaFilled(false);
        registar.setCursor(new Cursor(Cursor.HAND_CURSOR));

        registar.addActionListener(e -> {
            System.out.println("Vai Para Assinar");
        });

        JLabel label = new JLabel("não possui nenhuma conta?");
        label.putClientProperty(FlatClientProperties.STYLE, ""
                + "[light]foreground:lighten(@background,30%);"
                + "[dark]foreground:darken(@foreground,30%)");
        panel.add(label);
        panel.add(registar);

        return panel;
    }

    public Logino(JFrame frame) {

        init();
        try {
            // Carregue a imagem desejada (substitua o caminho pelo caminho do seu arquivo de imagem)
            image = ImageIO.read(new File("src//Icones//Abstract-Wallpaper-HD-For-Desktop.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        user = new JTextField();
        pass = new JPasswordField();
        lembrete = new JCheckBox("Lembrar senha");
        login = new JButton("Login");
        this.frame = frame;

        JPanel panel = new JPanel(new MigLayout("wrap,fillx,insets 35 45 30 45", "fill,250:280"));
        panel.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:20;"
                + "[light]background:darken(@background,3%);"
                + "[dark]background:lighten(@background,3%)");
        pass.putClientProperty(FlatClientProperties.STYLE, ""
                + "showRevealButton:true");
        user.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "entre o nome do usuario ou email");
        pass.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "entre a sua senha");
        JLabel label = new JLabel("Olá de novo");
        JLabel descricao = new JLabel("Por Favor faça o login para ter acesso");
        descricao.putClientProperty(FlatClientProperties.STYLE, ""
                + "[light]foreground:lighten(@foreground,30%);"
                + "[dark]foreground:darken(@foreground,30%)");

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FuncionarioDAOImpl gestor = new FuncionarioDAOImpl();

                if ("admin".equals(user.getText())) {

                    FreshUi casa = (FreshUi) frame;
                    casa.setPanel(new Log(casa));
                    casa.setVisible(true);
                    repaint();
                    revalidate();
                } else {
                    
                    notes.show(Notifications.Type.INFO, "Crede");
                }
            }
        });

        panel.add(label);
        panel.add(descricao);
        panel.add(new JLabel("usuario"), "gapy 8");
        panel.add(user);
        panel.add(new JLabel("senha"), "gapy 8");
        panel.add(pass);
        panel.add(lembrete, "grow 0");
        panel.add(login, "gapy 10");
        panel.add(criarTabela(), "gapy 10");
        add(panel);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            g.drawImage(image, 0, 0, this);
        }else{
           JOptionPane.showInternalMessageDialog(null, "eeee");
        }

    }

    private void init() {
        setLayout(new MigLayout("fill,insets 20", "[center]"));
    }

}
