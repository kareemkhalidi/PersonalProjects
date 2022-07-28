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
    
    public static void main(String args[]){
    
        h = new HomePage();
        g = new GamePage();
        h.setVisible(true);
        g.setVisible(false);
        
    }
    
    public static void startButtonClicked(){
    
        h.setVisible(false);
        g.setVisible(true);
        
    }
    
    public static void homeButtonClicked(){
    
        h.setVisible(true);
        g.setVisible(false);
        
    }
    
}
