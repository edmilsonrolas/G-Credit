/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Views;

import Views.Painels.Assino;
import Views.Painels.Logino;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto_mono.FlatRobotoMonoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author Matavele's
 */
public class FreshUi extends JFrame {

    private JPanel panel;
    private Logino login;

    /**
     * @param args the command line arguments
     */
    public FreshUi() {
        login = new Logino(this);
        
        panel = login;
        init(panel);
        
        
    }

    public static void main(String[] args) {
        
        FlatRobotoMonoFont.install();
        FlatLaf.registerCustomDefaultsSource("Style");
        UIManager.put("defaultFont", new Font(FlatRobotoMonoFont.FAMILY, Font.PLAIN, 13));
        FlatMacDarkLaf.setup();
        EventQueue.invokeLater(() -> new FreshUi().setVisible(true));
    }

    public Logino getLogin() {
        return login;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
        init(panel);
    }

    private void init(JPanel panel) {
        
        dispose();
        setTitle("Gwevissa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(800, 600));
        setLocationRelativeTo(null);
        setContentPane(panel);

    }

}
