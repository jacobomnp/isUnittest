/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jacob
 */
public class TennisGameTest {
    TennisGame juego = new TennisGame("Mario", "Luigi");
    
    public TennisGameTest() {
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


    @Test
    public void pruebaUno() {
        marcador(15, 6);
        String score = juego.getScore();
	assertEquals("Mario wins", score);
    }


    @Test
    public void pruebaDos() {
        marcador(6, 15);
        String score = juego.getScore();
	assertEquals("Luigi wins", score);
    }

    @Test
    public void pruebaTres() {
        marcador(15, 15);
        String score = juego.getScore();
	assertEquals("Deuce", score);
    }
    
    @Test
    public void pruebaCuatro() {
        marcador(4, 5);	
        String score = juego.getScore();
        assertEquals("Advantage Luigi", score);
    }
    
    @Test
    public void pruebaCinco(){
        marcador(5, 4);
	String score = juego.getScore();
	assertEquals("Advantage Mario", score);
	}

    private void marcador(int Mario, int Luigi) {
        /*MAnda a llamar al metodo playerOneBalls y playerTwoBalls del obejeto
        tennisgame y con el ciclo for va incrementado su puntuaje*/
        for (int i = 0; i < Mario; i++) {
			juego.playerOneScores();
		}
		for (int i = 0; i < Luigi; i++) {
			juego.playerTwoScores();
		}
    }
    
}
