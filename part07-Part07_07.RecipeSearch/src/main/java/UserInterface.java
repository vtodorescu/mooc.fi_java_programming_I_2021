/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Todo
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private FileRead inputFile;
    
    public UserInterface (Scanner scanner) {
        this.scanner = scanner;
        this.inputFile = new FileRead(this.scanner.nextLine());
    }
    
    public void start() {
        ArrayList <Recipe> listedFile = this.inputFile.fileToRecipe();
        
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        
        while (true) {
            System.out.println("Enter command: ");
            String input = scanner.nextLine();
            
            if (input.equals("stop")) {
                break;
            }
            
            if (input.equals("list")) {
                for (Recipe line : listedFile) {
                    System.out.println(line.toString());
                }
                System.out.println("");
            }
            
            if (input.equals("find name")) {
                System.out.println("Searched word: ");
                String searched = scanner.nextLine();
                for (Recipe recipe: listedFile) {
                    if (recipe.getName().contains(searched)) {
                        System.out.println(recipe.toString());
                    }
                }
            }
            
            if (input.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int searched = Integer.valueOf(scanner.nextLine());
                for (Recipe recipe: listedFile) {
                    if(recipe.getTime() <= searched) {
                        System.out.println(recipe.toString());
                    }
                }
            }
            
            if (input.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String searched = scanner.nextLine();
                for (Recipe recipe: listedFile) {
                    if(recipe.getIngredients().contains(searched)) {
                        System.out.println(recipe.toString());
                    }
                }
            }         
        }
    }
}
