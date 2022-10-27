/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

public class Motorcycle extends Vehicles{
    
    String potency; //potencia

    public Motorcycle() {
    }

    public Motorcycle(String licencePlate, String brand, String model) {
        super(licencePlate, brand, model);
    }

    public Motorcycle(String licencePlate, String brand, String model, String fuel, String type, String potency) {
        super(licencePlate, brand, model, fuel, type);
        
        this.potency = potency;
    }
    
    public String getPotency() {
        return potency;
    }

    public void setPotency(String potency) {
        this.potency = potency;
    }
    
    
    
    
    
}
