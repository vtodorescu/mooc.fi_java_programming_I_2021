/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Todo
 */
public class Container {
    private int container;
    
    public Container () {
        this.container = 0;
    }
    
    public int contains() {
        return container;
    }
    
    public void add(int amount) {
        if (amount < 0) {
            //do nothing    
        } else if (amount+container > 100) {
            container = 100;
        } else {
            container += amount;
        }
    }
    
    public void remove(int amount) {
        if (amount < 0) {
            //do nothing
        } else if (container-amount < 0) {
            container = 0;
        } else {
            container -= amount;
        }
    }
    
    public String toString() {
        return container + "/100";
    }
}
