import java.awt.Color;
import java.util.*;
import java.io.*;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karee
 */
public class WalmartWordle {
    
    private static HomePage h;
    private static GamePage g;
    private static String answer;
    private static HashSet<String> dict;
    private static int guess;
    
    public static void main(String args[]) throws FileNotFoundException{
    
        dict = new HashSet<>();
        Scanner fileReader = new Scanner(new File("C:\\Users\\karee\\Documents\\NetBeansProjects\\WalmartWordle\\src\\wordlist.txt"));
        while(fileReader.hasNextLine()){
        
            dict.add(fileReader.nextLine());
            
        }
        h = new HomePage();
        g = new GamePage();
        guess = 0;
        h.setVisible(true);
        g.setVisible(false);
        
    }
    
    public static void startButtonClicked(String s){
    
        h.setVisible(false);
        g.setLocation(h.getX(), h.getY());
        g.setVisible(true);
        answer = s;
        guess = 0;
        
        
    }
    
    public static void homeButtonClicked(){
    
        h.setVisible(true);
        g.dispose();
        g = new GamePage();
        g.setVisible(false);
        
    }
    
    public static void enterButtonClicked(String s){
    
        guess++;
        
        char[] answerArray = new char[5];
        for(int i = 0; i < 5; i++){
        
            answerArray[i] = answer.charAt(i);
            
        }
        
        int[] status = new int[5];
        for(int i = 0; i < 5; i++){
        
            if(answerArray[i] == s.charAt(i)){
            
                status[i] = 2;
                answerArray[i] = ' ';
                
            }
            
        }
        
        for(int i = 0; i < 5; i++){
        
            if(status[i] == 0){
            
                for(int j = 0; j < 5; j++){
                
                    if(answerArray[j] == s.charAt(i)){
                    
                        status[i] = 1;
                        
                    }
                
                }
                
            }
            
        }
        
        if(guess == 1){
        
            displayGuess(g.word1panel1, g.word1label1, status[0], s.charAt(0));
            displayGuess(g.word1panel2, g.word1label2, status[1], s.charAt(1));
            displayGuess(g.word1panel3, g.word1label3, status[2], s.charAt(2));
            displayGuess(g.word1panel4, g.word1label4, status[3], s.charAt(3));
            displayGuess(g.word1panel5, g.word1label5, status[4], s.charAt(4));
            if(s.equals(answer)){
            
                guess = 6;
            
            }
        
        }
        else if(guess == 2){
        
            displayGuess(g.word2panel1, g.word2label1, status[0], s.charAt(0));
            displayGuess(g.word2panel2, g.word2label2, status[1], s.charAt(1));
            displayGuess(g.word2panel3, g.word2label3, status[2], s.charAt(2));
            displayGuess(g.word2panel4, g.word2label4, status[3], s.charAt(3));
            displayGuess(g.word2panel5, g.word2label5, status[4], s.charAt(4));
            if(s.equals(answer)){
            
                guess = 6;
            
            }
        
        }
        else if(guess == 3){
        
            displayGuess(g.word3panel1, g.word3label1, status[0], s.charAt(0));
            displayGuess(g.word3panel2, g.word3label2, status[1], s.charAt(1));
            displayGuess(g.word3panel3, g.word3label3, status[2], s.charAt(2));
            displayGuess(g.word3panel4, g.word3label4, status[3], s.charAt(3));
            displayGuess(g.word3panel5, g.word3label5, status[4], s.charAt(4));
            if(s.equals(answer)){
            
                guess = 6;
            
            }
        
        }
        else if(guess == 4){
        
            displayGuess(g.word4panel1, g.word4label1, status[0], s.charAt(0));
            displayGuess(g.word4panel2, g.word4label2, status[1], s.charAt(1));
            displayGuess(g.word4panel3, g.word4label3, status[2], s.charAt(2));
            displayGuess(g.word4panel4, g.word4label4, status[3], s.charAt(3));
            displayGuess(g.word4panel5, g.word4label5, status[4], s.charAt(4));
            if(s.equals(answer)){
            
                guess = 6;
            
            }
        
        }
        else if(guess == 5){
        
            displayGuess(g.word5panel1, g.word5label1, status[0], s.charAt(0));
            displayGuess(g.word5panel2, g.word5label2, status[1], s.charAt(1));
            displayGuess(g.word5panel3, g.word5label3, status[2], s.charAt(2));
            displayGuess(g.word5panel4, g.word5label4, status[3], s.charAt(3));
            displayGuess(g.word5panel5, g.word5label5, status[4], s.charAt(4));
            if(s.equals(answer)){
            
                guess = 6;
            
            }
        
        }
        else if(guess == 6){
        
            displayGuess(g.word6panel1, g.word6label1, status[0], s.charAt(0));
            displayGuess(g.word6panel2, g.word6label2, status[1], s.charAt(1));
            displayGuess(g.word6panel3, g.word6label3, status[2], s.charAt(2));
            displayGuess(g.word6panel4, g.word6label4, status[3], s.charAt(3));
            displayGuess(g.word6panel5, g.word6label5, status[4], s.charAt(4));
            if(s.equals(answer)){
            
                guess = 6;
            
            }
            else{
            
                g.jLabel2.setText("Sorry, the word was " + answer);
                g.lost = true;
            
            }
        
        }
        
    }
    
    private static void displayGuess(JPanel p, JLabel l, int status, char c){
    
        l.setText(Character.toString(c).toUpperCase());
        if(status == 2){
        
            p.setBackground(new Color(108, 172, 100));
        
        }
        else if(status == 1){
        
            p.setBackground(new Color(200, 180, 92));
        
        }
    
    }
    
    public static boolean wordInDict(String s){
    
        return(dict.contains(s));
    
    }
    
}
