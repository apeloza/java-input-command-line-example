/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputexample;

/**
 *
 * @author Tony
 */
import java.util.Scanner;

public class InputExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your favourite colour.");
        
        String colour = scanner.next();
        
        System.out.println("Your favourite colour is " + colour);
    }
    
}
