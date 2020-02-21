/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import static com.sun.webkit.graphics.WCImage.getImage;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferStrategy;
import java.io.BufferedInputStream;
/**
 *
 * @author brugiafreddo.fabio
 */
public class Intro extends Space {

    private int i = 0;
    private BufferStrategy strategy;

    void run() throws InterruptedException {
        createBufferStrategy(2);
        strategy = getBufferStrategy();
        setBackground(Color.BLACK);
        setSize(800, 600);
        for (i = 100; i >= 0; i -= 1) {
            System.out.println("i: " + i);
            paint();
            Thread.sleep(i);
        }
            for (i = 0; i < 10; i += 1) {
                System.out.println("i: " + i);
                paint();
            }

        }
    
        

    public void paint() {
        Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
        //cancelliamo l'immagine precedente coprendola con un rettangolo bianco
        Image img;
         g.setColor(Color.black);
        g.fillRect(0,0,800,600);
        //cielo
        g.setColor(Color.white);
      
      

        
        g.setColor(Color.red);
        g.setFont(new Font("Bold", Font.ITALIC, 40 + i));
        g.drawString("Space Invaders", 250 + i, 250 + i);
        g.setFont(new Font("Bold", Font.ITALIC, 10 + i));
        g.drawString("        by Fabio Brugiafreddo ", 260 + i + i, 260 + i + i);
        //rilascia risorse create per la composizione di questa immagine
        g.dispose();
        //visualizza la nuova immagine sullo schermo
        strategy.show();
    }
}
