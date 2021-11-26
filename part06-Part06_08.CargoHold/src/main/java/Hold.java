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

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> hold;
    private int holdWeight;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.hold = new ArrayList<>();
        this.holdWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (holdWeight+ suitcase.totalWeight() <= maxWeight) {
            hold.add(suitcase);
            holdWeight+=suitcase.totalWeight();
        }
    }
    
    public void printItems() {
        for (Suitcase suitcase: this.hold) {
            suitcase.printItems();
        }
    }
    
    public String toString() {      
        int totalWeight = 0;
        for (Suitcase suitcase: hold) {
            totalWeight+= suitcase.totalWeight();
        }
        return hold.size() + " suitcases (" + totalWeight + " kg)";
    }
    
    
}
