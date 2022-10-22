/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

public class Cars extends Vehicles {

    String motor;
    int qtdPortas;

    public Cars() {
    }

    public Cars(String licencePlate, String model, String name){
        super(licencePlate, model, name);
        this.licencePlate = licencePlate;
        this.model = model;
        this.name = name;        
    }
    
    public Cars(String licencePlate, String model, String motor, int qtdPortas,
            String fuel, String type, String name) {
        super(licencePlate, model, fuel, type, name);
        
        this.licencePlate = licencePlate;
        this.model = model;
        this.motor = motor;
        this.qtdPortas = qtdPortas;
        this.fuel = fuel;
        this.type = type;
        this.name = name;           
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
    
    

}
