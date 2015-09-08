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
public class CruiseShip extends Ship {
    
    private int passengers;
    
    CruiseShip(String n, String y, int p) {
        super(n, y);
        passengers = p;
    }
    
    public void setPassengers(int newPassengers) {
        passengers = newPassengers;
    }
    
    public int getPassengers() {
        return passengers;
    }
    
    @Override
    public String toString() {
        return super.toString() + " passengers " + passengers;
    }
    
}
