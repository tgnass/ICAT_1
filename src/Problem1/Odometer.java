/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem1;

/**
 *
 * @author tgnas_000
 */
public class Odometer {
    public final int MAX_MILEAGE = 999999;
    
    public final int MPG = 24;
    
    private int mileage;  
    private int setPoint;
     
    private FuelGauge fuelGauge;
     
    public Odometer(int m, FuelGauge fg) {
       mileage = m; 
       fuelGauge = fg;
    }
    
    public int getMileage() {
        return mileage;
    }
    
    public void incrementMileage() {
        mileage++;
        if (mileage - setPoint >= MPG) {
            setPoint = mileage;
            fuelGauge.decrementGallons();
        }
    }
        
}
