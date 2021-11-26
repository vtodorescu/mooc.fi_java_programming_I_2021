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

public class Suitcase {
    private ArrayList<Item> items;
    private int maxSuitcaseWeight;
    private int currentWeight;
    
    public Suitcase(int maxSuitcaseWeight) {
        this.maxSuitcaseWeight = maxSuitcaseWeight;
        this.items = new ArrayList<>();
        this.currentWeight = 0;
    }
    
    public void addItem(Item item) {       
        if (currentWeight + item.getWeight() <= maxSuitcaseWeight ) {
            currentWeight+= item.getWeight();       
            this.items.add(item);
        }
        
    }
    
    public void printItems() {
        for (Item item: this.items){
            System.out.println(item);
        }          
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Item item: this.items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item heaviest = this.items.get(0);
        for (Item item: this.items) {
            if (heaviest.getWeight() < item.getWeight()){
                heaviest = item;
            }
        }
        return heaviest;
    }
    
    public String toString() {
        int i=0;
        int totalWeight = 0;
        for (Item item: this.items) {
            i++;
            totalWeight += item.getWeight();
        }
        if (i == 0) {
            return "no items (0kg)";
        }
        if ( i==1 ) {
            return i + " item (" + totalWeight + " kg)";
        }
        return i + " items (" + totalWeight + " kg)";
    }
}
