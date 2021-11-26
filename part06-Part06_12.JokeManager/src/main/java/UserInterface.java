/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Todo
 */
import java.util.Scanner;

public class UserInterface {
    private JokeManager manager;
    private Scanner scanner;
    
    public UserInterface(JokeManager manager,Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands: ");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String input = scanner.nextLine();
            if (input.equals("X")) {
                break;
            }
            
            if (input.equals("1")) {
                System.out.println("Write the joke to be added: ");
                String joke = scanner.nextLine();
                manager.addJoke(joke);
            } 
            
            if (input.equals("2")) {
                System.out.println("Drawing a joke.");
                System.out.println(manager.drawJoke());
            }
            
            if (input.equals("3")) {
                System.out.println("Printing the jokes.");
                manager.printJokes();
            }
            
        }
    }
}
