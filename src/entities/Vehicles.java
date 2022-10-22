/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.ArrayList;
import java.util.List;

public class Vehicles extends Users {

    //Lists:
    List<Cars> listCars = new ArrayList<Cars>();
    List<Truck> listTrucks = new ArrayList<Truck>();
    List<Motorcycle> listMotorcycle = new ArrayList<Motorcycle>();

    //Variables
    String licencePlate; //placa de carro
    String model; //modelo
    int tankCapacity; //capacidade do tanque
    String color;
    float standardAverage; //média padrão
    String fuel; //combustivel
    float km;
    String type; //tipo sedan, hatch

    //Constructors
    public Vehicles() {

    }

    public Vehicles(String licencePlate, String model, String name) {
        super(name);
        this.licencePlate = licencePlate;
        this.model = model;
        this.name = name;
    }

    public Vehicles(String licencePlate, String model, String fuel, String type, String name) {
        super(name);
        this.licencePlate = licencePlate;
        this.model = model;
        this.fuel = fuel;
        this.type = type;
        this.name = name;
    }

    public Vehicles(String licencePlate, String model, int tankCapacity, String color,
            float standardAverage, String fuel, float km, String type, String name) {
        super(name);
        this.licencePlate = licencePlate;
        this.model = model;
        this.tankCapacity = tankCapacity;
        this.color = color;
        this.standardAverage = standardAverage;
        this.fuel = fuel;
        this.km = km;
        this.type = type;
        this.name = name;
    }

    //Getters and Setters
    public List<Cars> getListCars() {
        return listCars;
    }

    public String getLicencePlate() {
        return licencePlate;
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

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
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
        return "Vehicles data: \n"
                + getLicencePlate() + " - "
                + getName() + " - "
                + getModel() + " - "
                + getType();
    }

}
