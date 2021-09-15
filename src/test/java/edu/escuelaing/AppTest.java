package edu.escuelaing;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Unit test for simple Nano Spark Web App.
 */
public class AppTest extends TestCase {


    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    public void testDeberiaEncontrarJS() {
        try {
            String urlString = "https://taller-de-arquitectura.herokuapp.com/";
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL(urlString + "/webapp.js").openStream()));
            assertTrue(true);
        } catch (IOException e) {
            fail(" 404 not found");
        }
    }

    public void testDeberiaEncontrarImg() {
        try {
            String urlString = "https://taller-de-arquitectura.herokuapp.com/";
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL(urlString + "/Kri.PNG").openStream()));
            assertTrue(true);
        } catch (IOException e) {
            fail("404 not found");
        }
    }

    public void testDeberiaEncontrarHTML() {
        try {
            String urlString = "https://taller-de-arquitectura.herokuapp.com/";
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL(urlString + "/index.html").openStream()));
            assertTrue(true);
        } catch (IOException e) {
            fail("404 not found");
        }
    }

}