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
import java.util.ArrayList;

public class UserInterface {
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            
            processCommand(input);
            System.out.println("");
        }
    }
    
    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("list")) {
            this.list.print();
        } else if (command.equals("remove")) {
            remove();
        }
    }
    
    public void add() {
        System.out.println("To add: "); 
        String word = this.scanner.nextLine();
        this.list.add(word);
    }

    public void remove() {
        System.out.println("Which one is remove? ");
        int removed = Integer.valueOf(scanner.nextLine());
        this.list.remove(removed);
       
    }
}
