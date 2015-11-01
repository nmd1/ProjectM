package project.m;
import java.awt.event.*;
import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.Scanner;
import javax.swing.*;

public class keyInput {
    
    static char keyboard[][] = {
        {'1','2','3','4','5','6','7','8','9','0','-','='},  //k[0][n]
        {'q','w','e','r','t','y','u','i','o','p','[',']'},  //k[1][n]
        {'a','s','d','f','g','h','j','k','l',';','\\',','}, //k[2][n]
        {'z','x','c','v','b','n','m',',','.','/','`','`'},  //k[3][n]
        //3,11
    };
    
    public static void keys() {
        List<cord> points = new LinkedList<cord>() {};
        
        JFrame empty = new JFrame();
        empty.setVisible(true);
        //empty.setEnabled(false);
        //empty.setSize(300,300);
        empty.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        empty.addKeyListener(new KeyListener() {
            long startTime = 0;
            long endTime = 0;
            char c = 0;
            boolean pressed = false;
            
            @Override
            public void keyTyped(KeyEvent e) {
                //long startTime1 = System.nanoTime();
                
                //END IT SOMEHOW
                /*
                if(e.getKeyChar() == ' ' ){
                    empty.removeAll();
                }*/
                //long endTime1 = System.nanoTime();
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                c = e.getKeyChar();
                if (!pressed) {
                startTime = System.currentTimeMillis();
                pressed = true;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                endTime = System.currentTimeMillis();
                long timeE = (endTime - startTime);
                if(startTime != 0 || endTime != 0) System.out.println("Time: " + ((endTime - startTime) ));
                pressed = false;
                
                points.add(new cord(timeE, cordX(c), cordY(c)));
                System.out.println( "("+timeE+", "+cordX(c)+", " +cordY(c) + ")");
                
                
                
                
                cord[] data = new cord[points.size() - 1];
                int inter = 0;
                for(cord a : points) {
                    data[inter] = a;
                    inter++;
                }
                
                //Processing w = new Processing();
                //w.inputText(data);
            }
            
        }); 
        
    }
    
    public static int cordY(char c){
        //up and down
        int answer = 0;
        for (int i = 0; i < keyboard.length; i++) {
            for (int j = 0; j < keyboard[i].length; j++) {
                if(keyboard[i][j] == c) {
                    answer = i;
                }
            }
        }
        return answer;
    }
    public static int cordX(char c) {
        int answer = 0;
        //left and right
        for (int i = 0; i < keyboard.length; i++) {
            for (int j = 0; j < keyboard[i].length; j++) {
                if(keyboard[i][j] == c) {
                    answer = j;
                }
            }
        }
        return answer;
    }
    
}
