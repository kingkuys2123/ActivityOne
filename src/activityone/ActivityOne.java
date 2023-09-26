/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activityone;

import GreetingsWorld.*;

/**
 *
 * @author Quitco, Kyle Matthew M.      BSIT - 2       CSIT228 - G1      September 26, 2023
 */
public class ActivityOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        showMessage();
        showBye();
        Welcome.showWelcome();
        Greetings.showGreeting();
        System.out.println("Farewell World");
    }
    
    public static void showMessage(){
        System.out.println("Hello World");
    }
    
    public static void showBye(){
        System.out.println("Bye World");
    }
}