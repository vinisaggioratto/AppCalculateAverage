/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class FuelSupply {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    
    List<FuelSupply> listFuelSupply = new ArrayList<FuelSupply>();
    
    Vehicles vehicles;
    double liters; //litros
    Date supplyDate; //data abastecimento

    public FuelSupply() {
    }

    public FuelSupply(double liters, Date supplyDate) {
        this.liters = liters;
        this.supplyDate = supplyDate;
    }

    public FuelSupply(Vehicles licencePlate, double liters, Date supplyDate){
        this.vehicles = licencePlate;
        this.liters = liters;
        this.supplyDate = supplyDate;
    }

    public List<FuelSupply> getListFuelSupply() {
        return listFuelSupply;
    }

    public Vehicles getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicles vehicles) {
        this.vehicles = vehicles;
    }

    public double getLiters() {
        return liters;
    }

    public void setLiters(double liters) {
        this.liters = liters;
    }

    public Date getSupplyDate() {
        return supplyDate;
    }

    public void setSupplyDate(Date supplyDate) {
        this.supplyDate = supplyDate;
    }
    
    @Override
    public String toString(){
        return
                "Fuel Supply Data: " +
                getVehicles().getLicencePlate() + " - " +
                getLiters() + " - " +
                sdf.format(getSupplyDate());
    }
    
}
