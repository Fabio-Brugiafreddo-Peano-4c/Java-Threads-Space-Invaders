/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Canvas;
import java.awt.Color;

/**
 *
 * @author brugiafreddo.fabio
 */

    class Space extends Canvas {

    Space() {
       System.out.println("Setting canvas background and dimentions ");

       setBackground (Color.BLACK);
       setSize(800, 600);
    }
    
}

