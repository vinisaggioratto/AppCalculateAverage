/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.ArrayList;
import java.util.List;

public class Vehicles extends Users {

    //Lists:
    List<Vehicles> listVehicles = new ArrayList<Vehicles>();
    
    //Variables
    String licencePlate; //placa de carro
    String brand; //marca
    String model; //modelo
    int tankCapacity; //capacidade do tanque
    String color;
    float standardAverage = 0.00f; //média padrão
    String fuel; //combustivel
    float startingKm = 0.00f; //km de cadastro
    String type; //tipo sedan, hatch

    //Constructors
    public Vehicles() {

    }

    public Vehicles(String licencePlate, String brand, String model, String name) {
        super(name);
        this.licencePlate = licencePlate;
        this.brand = brand;
        this.model = model;
        this.name = name;
    }

    public Vehicles(String licencePlate, String brand, String model, String fuel, String type, String name) {
        super(name);
        this.licencePlate = licencePlate;
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.type = type;
        this.name = name;
    }

    public Vehicles(String licencePlate, String brand, String model, int tankCapacity, String color,
            float standardAverage, String fuel, float startingKm, String type, String name) {
        super(name);
        this.licencePlate = licencePlate;
        this.brand = brand;
        this.model = model;
        this.tankCapacity = tankCapacity;
        this.color = color;
        this.standardAverage = standardAverage;
        this.fuel = fuel;
        this.startingKm = startingKm;
        this.type = type;
        this.name = name;
    }

    //Getters and Setters
    
        public List<Vehicles> getListVehicles() {
        return listVehicles;
    }
    
//    public List<Cars> getListCars() {
//        return listCars;
//    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getStandardAverage() {
        return standardAverage;
    }

    public void setStandardAverage(float standardAverage) {
        this.standardAverage = standardAverage;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public float getStartingKm() {
        return startingKm;
    }

    public void setStartingKm(float startingKm) {
        this.startingKm = startingKm;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return 
                "Licence Plate: " + getLicencePlate() + " - "
                + "Owner: " + getName() + " - "
                + "Model: " + getModel() + " - "
                + "Type: " + getType();
    }

}
