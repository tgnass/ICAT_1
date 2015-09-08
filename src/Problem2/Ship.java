/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem2;

/**
 *
 * @author tgnas_000
 */
public class Ship {
    
    private String name;
    private String yearBuilt;
    
    public Ship(String n, String y) {
        name = n;
        yearBuilt = y;
    }
    
    public void setName(String newName) {
        name = newName;
    }
    
    public void setYearBuilt(String newYearBuilt) {
        yearBuilt = newYearBuilt;
    }
    
    public String getName() {
        return name;
    }
    
    public String getYearBuilt() {
        return yearBuilt;
    }
    
    @Override
    public String toString() {
        return name + " year built: " + yearBuilt;
    }
    
}
