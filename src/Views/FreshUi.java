/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Views;

import Views.Painels.Logino;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto_mono.FlatRobotoMonoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.UIManager;


/**
 *
 * @author Matavele's
 */
public class FreshUi extends JFrame{

    /**
     * @param args the command line arguments
     */
    public FreshUi(){
        init();
    }
    public static void main(String[] args) {
        FlatRobotoMonoFont.install();
        FlatLaf.registerCustomDefaultsSource("Style");
        UIManager.put("defaultFont", new Font(FlatRobotoMonoFont.FAMILY, Font.PLAIN,13));
        FlatMacDarkLaf.setup();
        EventQueue.invokeLater(()-> new FreshUi().setVisible(true));
    }

    private void init() {
        setTitle("Gwevissa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(800,600));
        setLocationRelativeTo(null);
        setContentPane(new Logino());
        
    }
    
}
