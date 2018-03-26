/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import py.com.test.tomcatdeployautomation.MainController;

/**
 *
 * @author carlos
 */
public class MainControllerTest {

    private final MainController mainController;

    public MainControllerTest() {
        mainController = new MainController();
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
        String result = mainController.hello("Carlos");
        String message = "Hello Carlos";
        assertTrue(result.equals(message));
    }
}
