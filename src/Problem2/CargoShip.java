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
public class CargoShip extends Ship {
    
    private int tonnage;
    
    CargoShip(String n, String y, int t) {
        super(n, y);
        tonnage = t;
    }
    
    public void setTonnage(int newTonnage) {
        tonnage = newTonnage;
    }
    
    public int getTonnage() {
        return tonnage;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Tonnage: " + tonnage;
    }
}
