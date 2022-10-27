/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import interfaces.CalculateAverage;


public class Average implements CalculateAverage{

    @Override
    public double calculateAverage(double oldKm, double currentKm, double liters) {
       return (currentKm - oldKm) / liters; 
    }
    
}
