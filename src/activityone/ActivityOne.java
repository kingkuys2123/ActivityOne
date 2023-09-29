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
        int result = add(2,4);
        
        showMessage();
        showBye();
        Welcome.showWelcome();
        Greetings.showGreeting();
        System.out.println("Farewell World!");
        
        System.out.println("The Result #1: " + div(2,4));
        System.out.println("The Result #2: " + mul(2,4));
        
        ShowOutput.simplePrint(result);
    }
    
    public static void showMessage(){
        System.out.println("Hello World!");
    }
    
    public static void showBye(){
        System.out.println("Bye World");
    }
    
    public static int add(int num1, int num2){
        return num1+num2;
    }
    
    public static int sub(int num1, int num2){
        return num1-num2;
    }
    
    public static int mul(int num1, int num2){
        return num1*num2;
    }
    
    public static int div(int num1, int num2){
        return num1/num2;
    }
}