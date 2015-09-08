package Problem1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tgnas_000
 */
public class FuelGauge {
    final int MAX_GALLONS = 15;
    
    private int gallons;
    
    public FuelGauge() {
        
    }   
    
    public FuelGauge(int g) {
        gallons = Math.min(g, MAX_GALLONS);
    }
    
    public int getGallons() {
        return gallons;
    }
    
    public void incrementGallons() {
        gallons++;
        gallons = Math.min(gallons, MAX_GALLONS);
    }
    
    public void decrementGallons() {
        gallons--;
    }
}
