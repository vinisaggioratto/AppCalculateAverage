
package entities;

import java.util.ArrayList;
import java.util.List;

public class Vehicles extends Users {

    //Lists:
    List<Vehicles> listVehicles = new ArrayList<Vehicles>();

    //Variables
    protected String licencePlate; //placa de carro
    protected String brand; //marca
    protected String model; //modelo
    protected int tankCapacity; //capacidade do tanque
    protected String color;
    protected float standardAverage = 0.00f; //média padrão
    protected String fuel; //combustivel
    protected float startingKm = 0.00f; //km de cadastro
    protected String type; //tipo sedan, hatch

    //Constructors
    public Vehicles() {

    }

    public Vehicles(String licencePlate, String brand, String model, String color, String fuel, String type) {
        this.licencePlate = licencePlate;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.fuel = fuel;
        this.type = type;
    }

    //Getters and Setters
    public List<Vehicles> getListVehicles() {
        return listVehicles;
    }

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
        return "Licence Plate: " + getLicencePlate() + " - "
                + "Brand: " + getBrand() + " - "
                + "Model: " + getModel() + " - "
                + "Type: " + getType() + " - "
                + "Color: " + getColor();
    }

}
