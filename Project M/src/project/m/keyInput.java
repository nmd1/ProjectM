package project.m;
import java.awt.event.*;
import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.Scanner;
import javax.swing.*;

public class keyInput {
    List<cord> points = new LinkedList<cord>() {};
    int restTime = 500;
    boolean go = true;
    char keyboard[][] = {
        {'1','2','3','4','5','6','7','8','9','0','-','='},  //k[0][n]
        {'q','w','e','r','t','y','u','i','o','p','[',']'},  //k[1][n]
        {'a','s','d','f','g','h','j','k','l',';','\\',','}, //k[2][n]
        {'z','x','c','v','b','n','m',',','.','/','`','`'},  //k[3][n]
        //3,11
    };
    javax.swing.Timer timer = new javax.swing.Timer((int) restTime, new ActionListener() {

                    @Override
                    //Timer that sends information to processor
                    public void actionPerformed(ActionEvent e) {
                        if(go) {//prevents the program from constantly sending information to processing idlely
                        //points.add(new cord(0, 0, 0));//useless delimiter
                        cord[] data = new cord[points.size()];//creates array
                        int inter = 0;
                        for(cord a : points) {
                            //System.out.println(a.time);
                            data[inter] = a;
                            inter++;
                        }//writes data from arrayList to array
                        points.removeAll(points);//resets arraylist
                        //Processing w = new Processing();
                        //w.inputText(data); 
                        System.out.println("sent!");
                        go = false;
                        }
                    }
                    
                });
    public void keyInput() {
        //Important but useless
    }
    public void keys() {
        
        
        JFrame empty = new JFrame();
        empty.setVisible(true);
        //empty.setEnabled(false);
        //empty.setSize(300,300);
        empty.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        empty.addKeyListener(new KeyListener() {
            long startTime = 0;
            long endTime = 0;                  
                    
            char c = 0;
            boolean pressed = false;
            
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                c = e.getKeyChar();
                if (!pressed) {//prevents the end-start time sequence from resetting constantly
                startTime = System.currentTimeMillis();
                pressed = true;
                }
                timer.restart();//resets the timer so that it only begins at the last key pressed
                go = true;//allows it so that the timer object can be called
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
                endTime = System.currentTimeMillis();
                
                long timeE = (endTime - startTime);
                //if(startTime != 0 || endTime != 0) System.out.println("Time: " + ((endTime - startTime) ));
                pressed = false;
                
                points.add(new cord(timeE, cordX(c), cordY(c)));
                System.out.println( "("+timeE+", "+cordX(c)+", " +cordY(c) + ")");
                
                timer.start();

            }
            
        }); 
        
    }
    
    public int cordY(char c){
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
    public int cordX(char c) {
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
