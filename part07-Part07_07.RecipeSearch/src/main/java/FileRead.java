/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Todo
 */
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FileRead {
    
    private String file;
    
    public FileRead(String file) {
        this.file = file;
    }
    
    public ArrayList<Recipe> fileToRecipe() {
        ArrayList<Recipe> recipes = new ArrayList<>();
        
        try (Scanner scanner = new Scanner(Paths.get(this.file))) {
            String recipe = "";
            int count = 0;
            ArrayList<String> helper = new ArrayList<>();
            
            while (scanner.hasNextLine()) {
                String nextLine = scanner.nextLine();
                if (!(nextLine.equals(""))) {
                    recipe += nextLine + ",";
                }
                if (nextLine.equals("")) {
                    helper.add(recipe);
                    recipe = "";
                    count++;
                }
            }   
            helper.add(recipe);
            count++;
               
            for (int i=0; i< count; i++) {
                String line = helper.get(i);
                String[] parts = line.split(",");
                ArrayList<String> ingredients = new ArrayList<>();
                for (int j =2; j< parts.length; j++) {
                   ingredients.add(parts[j]);
                }
                recipes.add(new Recipe(parts[0], Integer.valueOf(parts[1]), ingredients));
            }         
        } catch (Exception e) {
            System.out.println("Error");
        }    
        return recipes;
    }
    
}
