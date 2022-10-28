
package entities;

import interfaces.CalculateAverage;


public class Average implements CalculateAverage{

    @Override
    public float calculateAverage(float oldKm, float currentKm, float liters) {
       return (currentKm - oldKm) / liters; 
    }
    
}
