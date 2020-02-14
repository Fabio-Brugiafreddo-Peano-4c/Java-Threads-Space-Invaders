/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author brugiafreddo.fabio
 */
public class SpaceInvaders extends JFrame {

    public SpaceInvaders() throws InterruptedException {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
        this.setResizable(false);
        setIgnoreRepaint(true);
        Intro intro = new Intro();
        this.add(intro);
        // impacchetto il tutto e rendi visibile
        this.pack();
        this.setVisible(true);
        // avvia l'introduzione
        intro.run();      
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        SpaceInvaders space = new SpaceInvaders();
    }
    
}
