/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Todo
 */
import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> birds;
    
    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }
    
    public void add(String name, String nameInLatin) {
        birds.add(new Bird(name, nameInLatin));
    }
    
    public String observations(String observed) {
        for (Bird bird: birds) {
            if (bird.Name().equals(observed)) {
                bird.Observations();
                return bird.Name();
            }
        }
        return null;
    }
    
    public String printAll() {
        String allBirds = "";
        for (Bird bird : birds) {
            allBirds += bird.toString();
        }
        return allBirds;
    }
    
    public String printOne(String name) {
        for (Bird bird : birds) {
            if (bird.Name().equals(name)) {
                return bird.toString();
            }
        }
        return null;
    }
}
