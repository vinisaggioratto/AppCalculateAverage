/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

public class Motorcycle extends Vehicles{
    
    String potency; //potencia

    public Motorcycle() {
    }

    public Motorcycle(String licencePlate, String brand, String model, String name) {
        super(licencePlate, brand, model, name);
    }

    public Motorcycle(String licencePlate, String brand, String model, String fuel, String type, String potency, String name) {
        super(licencePlate, brand, model, fuel, type, name);
        
        this.potency = potency;
    }
    
    public String getPotency() {
        return potency;
    }

    public void setPotency(String potency) {
        this.potency = potency;
    }
    
    
    
    
    
}
