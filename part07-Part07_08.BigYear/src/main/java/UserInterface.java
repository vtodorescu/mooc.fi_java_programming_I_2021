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
    private Scanner scanner;
    private BirdDatabase birds;
    
    public UserInterface(Scanner scanner, BirdDatabase birds) {
        this.scanner = scanner;
        this.birds = birds;
    }
    
    public void start () {
        
        while (true) {
            System.out.println("?");
            String command = scanner.nextLine();
            
            if (command.equals("Quit")|| command.equals("quit")|| command.equals("QUIT")) {
                break;
            }
            
            else if (command.equals("Add")|| command.equals("add")|| command.equals("ADD")) {
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Name in Latin: ");
                String nameInLatin = scanner.nextLine();
                
                this.birds.add(name, nameInLatin);
            }
            
            else if (command.equals("Observation") || command.equals("observation") || command.equals("OBSERVATION")) {
                System.out.println("Bird?");
                String name = scanner.nextLine();
                if (birds.observations(name) == null) {
                    System.out.println(name + " Not a bird!");
                }           
            }
             
            else if (command.equals("All") || command.equals("all")|| command.equals("ALL")) {
                System.out.println(birds.printAll());
            }
            
            else if (command.equals("One") || command.equals("one") || command.equals("ONE")) {
                System.out.println("Bird? ");
                String name = scanner.nextLine();
                
                if (birds.printOne(name) == null) {
                    System.out.println(name + " is not a bird!");
                } else {
                    System.out.println(birds.printOne(name));
                }
            }
            
            else {
                System.out.println("Unknown commnad!");
            }
        }
    }
}
