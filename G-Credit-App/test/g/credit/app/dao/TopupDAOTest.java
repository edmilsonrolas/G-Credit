/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package g.credit.app.dao;

import g.credit.app.model.Topup;
import java.sql.SQLException;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rolas
 */
public class TopupDAOTest {
    
    public TopupDAOTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of insertTopup method, of class TopupDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testInsertTopup() throws Exception {
        System.out.println("insertTopup");
        Topup topup = new Topup(10, Topup.Operator.Vodacom, 100);
        TopupDAO instance = new TopupDAO();
        instance.insertTopup(topup);
        // TODO review the generated test code and remove the default call to fail.
        Topup retrievedTopup = instance.getTopupById(topup.getId());
        assertEquals(topup, retrievedTopup);
        instance.deleteTopup(topup.getId());
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateTopup method, of class TopupDAO.
     */
    @Test
    public void testUpdateTopup() throws Exception {
        System.out.println("updateTopup");
        Topup topup = null;
        TopupDAO instance = new TopupDAO();
        instance.updateTopup(topup);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTopup method, of class TopupDAO.
     */
    @Test
    public void testDeleteTopup() throws Exception {
        System.out.println("deleteTopup");
        String id = "";
        TopupDAO instance = new TopupDAO();
        instance.deleteTopup(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTopupById method, of class TopupDAO.
     */
    @Test
    public void testGetTopupById() throws Exception {
        System.out.println("getTopupById");
        String id = "";
        TopupDAO instance = new TopupDAO();
        Topup expResult = null;
        Topup result = instance.getTopupById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllTopups method, of class TopupDAO.
     */
    @Test
    public void testGetAllTopups() throws Exception {
        System.out.println("getAllTopups");
        TopupDAO instance = new TopupDAO();
        List<Topup> expResult = null;
        List<Topup> result = instance.getAllTopups();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of closeConnection method, of class TopupDAO.
     */
    @Test
    public void testCloseConnection() throws SQLException {
        System.out.println("closeConnection");
        var instance = new TopupDAO();
        instance.closeConnection();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
