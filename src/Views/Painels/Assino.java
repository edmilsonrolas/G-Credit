/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views.Painels;

import Controllers.FuncionarioDAOImpl;
import Views.FreshUi;

import Views.Painels.Componentes.PasswordStrengthStatus;
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
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;
import raven.glasspanepopup.GlassPanePopup;
import raven.toast.Notifications;

/**
 *
 * @author Matavele's
 */
public class Assino extends JPanel {

    private final JTextField user;
    private final JTextField nome;
    private final JTextField apelido;
    private final JPasswordField pass;
    private final JPasswordField passC;
    private final JButton login;
    private final JFrame frame;
    private PasswordStrengthStatus pss;
    private Notifications notes;
    private BufferedImage image;
    private JRadioButton masc;
    private JRadioButton fem;
    private ButtonGroup grupoGenero;

    private Component criarTabela() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        panel.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:null");

        JButton registar = new JButton("<html><a href=\"#\">Acessar</a></html>");
        registar.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:3,3,3,3");
        registar.setContentAreaFilled(false);
        registar.setCursor(new Cursor(Cursor.HAND_CURSOR));

        registar.addActionListener(e -> {
            FreshUi casa = (FreshUi) frame;
            casa.setPanel(new Logino(casa));
            casa.setVisible(true);
            repaint();
            revalidate();
        });

        JLabel label = new JLabel("Já possui conta?");
        label.putClientProperty(FlatClientProperties.STYLE, ""
                + "[light]foreground:lighten(@background,30%);"
                + "[dark]foreground:darken(@foreground,30%)");
        panel.add(label);
        panel.add(registar);

        return panel;
    }

    public Assino(JFrame frame) {

        init();
        GlassPanePopup.install(frame);
        Notifications.getInstance().setJFrame(frame);
        try {
            // Carregue a imagem desejada (substitua o caminho pelo caminho do seu arquivo de imagem)
            image = ImageIO.read(new File("src//Icones//Abstract-Wallpaper-HD-For-Desktop.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        user = new JTextField();
        nome = new JTextField();
        apelido = new JTextField();
        pass = new JPasswordField();
        passC = new JPasswordField();
        pss = new PasswordStrengthStatus();
        
        login = new JButton("Assinar");
        this.frame = frame;

        JPanel panel = new JPanel(new MigLayout("wrap,fillx,insets 35 45 30 45", "fill,360"));
        panel.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:20;"
                + "[light]background:darken(@background,3%);"
                + "[dark]background:lighten(@background,3%)");
        pass.putClientProperty(FlatClientProperties.STYLE, ""
                + "showRevealButton:true");
        passC.putClientProperty(FlatClientProperties.STYLE, ""
                + "showRevealButton:true");
        user.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "entre o nome do usuario ou email");
        nome.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "entre o nome");
        apelido.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "entre o apelido");
        pass.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "entre a sua senha");
        passC.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "confirme a sua senha");
        
        login.putClientProperty(FlatClientProperties.STYLE, ""
                + "[light]background:darken(@background,10%);"
                + "[dark]background:lighten(@background,10%);"
                + "borderWidth:0;"
                + "focusWidth:0;"
                + "innerFocusWidth:0");
        
        JLabel label = new JLabel("Bem-Vindo ao Gwevissa");
        JLabel descricao = new JLabel("Assine para começar");
        label.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:bold +10");
        descricao.putClientProperty(FlatClientProperties.STYLE, ""
                + "[light]foreground:lighten(@foreground,30%);"
                + "[dark]foreground:darken(@foreground,30%)");
        pss.initPasswordField(pass);

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                

               
            }
        });

        panel.add(label);
        panel.add(descricao);
        panel.add(new JLabel("Nome Completo"), "gapy 10");
        panel.add(nome,"split 2");
        panel.add(apelido);
         panel.add(new JLabel("Genero"),"gapy 8");
         panel.add(createGenderPanel());
        panel.add(new JSeparator(),"gapy 5 5");
        panel.add(new JLabel("nome do usuario ou Email"));
        panel.add(user);
        panel.add(new JLabel("Senha"),"gapy 8");
        panel.add(pass);
        panel.add(pss,"gapy 0");
        panel.add(new JLabel("Confirme a senha"), "gapy 0");
        panel.add(passC);
        
        panel.add(login, "gapy 20");
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
        setLayout(new MigLayout("fill,insets 20", "[center]","[center]"));
    }
    
    private Component createGenderPanel(){
        JPanel panel = new JPanel(new MigLayout("insets 0"));
        panel.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:null");
        masc = new JRadioButton("Masulino");
        fem = new JRadioButton("Feminino");
        grupoGenero = new ButtonGroup();
        grupoGenero.add(masc);
        grupoGenero.add(fem);
        fem.setSelected(true);
        panel.add(masc);
        panel.add(fem);
        return panel;
        
    }

}
