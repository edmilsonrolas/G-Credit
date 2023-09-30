/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g.credit.app;

import g.credit.app.dao.SQLiteDBConnection;
import java.sql.SQLException;

/**
 *
 * @author rolas
 */
public class GCreditApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        SQLiteDBConnection.getConnection();
    }
    
}
