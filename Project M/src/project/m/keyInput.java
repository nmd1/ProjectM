package project.m;
import java.awt.event.*;
import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.Scanner;
import javax.swing.*;

public class keyInput {
    ArrayList<cord> points = new ArrayList<cord>() {};
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
                        
                        int inter = 0;
                        for(int i = 1; i < points.size(); i++) {
                        	if(!points.isEmpty()){
                        		int new1 = i;
                        		int old1 = i - 1;
                            	if((points.get(new1).getX() == points.get(old1).getX() &&
                            		 points.get(new1).getY() == points.get(old1).getY()) ) {
                            		points.remove(i);
                            	}
                            }
                          
                        }//writes data from arrayList to array
                        Processing w = new Processing();
                        //debug
                        for(int i = 1; i < points.size(); i++) {
                        	System.out.println( "("+points.get(i).getTime()+", "+points.get(i).getX()+", " +points.get(i).getY() + ")");
                        }//enddebug
                        w.inputText(points); 
                        System.out.println("sent!");
                        points.removeAll(points);//resets arraylist
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
