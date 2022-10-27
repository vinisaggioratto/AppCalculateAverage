/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class FuelSupply {

    Scanner scan = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    
 Cars car = new Cars();
    
    FuelSupply addFs;
    Average av = new Average();
    List<FuelSupply> listFuelSupply = new ArrayList<FuelSupply>();
    Stack<Double> stackKm = new Stack<Double>();

    String licencePlate;
    double liters; //litros
    Date supplyDate; //data abastecimento
    double km;
    double average;

    double oldKm = 0.0;

    public FuelSupply() {
    }

    public FuelSupply(double km, double liters, Date supplyDate) {
        this.km = km;
        this.liters = liters;
        this.supplyDate = supplyDate;
    }

    public FuelSupply(String licencePlate, double km, double liters, Date supplyDate, double average) {
        this.licencePlate = licencePlate;
        this.km = km;
        this.liters = liters;
        this.supplyDate = supplyDate;
        this.average = average;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public Stack<Double> getStackKm() {
        return stackKm;
    }

    public void setStackKm(Stack<Double> stackKm) {
        this.stackKm = stackKm;
    }

    public List<FuelSupply> getListFuelSupply() {
        return listFuelSupply;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
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

    public void registerSupply() throws ParseException {
        System.out.println("----------------------------");
        System.out.println("Enter the Licence Plate: ");
        licencePlate = scan.nextLine();
        System.out.println("Enter the Date: ");
        Date data = sdf.parse(scan.nextLine());
        System.out.println("Enter the km: ");
        km = scan.nextDouble();
        System.out.println("Enter the liters: ");
        liters = scan.nextDouble();

        if (stackKm.isEmpty()) {
            oldKm = 1;
        } else {
            oldKm = getStackKm().peek();
        }
        average = av.calculateAverage(oldKm, km, liters);
        addFs = new FuelSupply(licencePlate, km, liters, data, average);
        getListFuelSupply().add(addFs);
        getStackKm().add(km);

        scan.nextLine();
    }

    public void printSupply() {

        if (!getListFuelSupply().isEmpty()) {
            for (FuelSupply ff : getListFuelSupply()) {
                System.out.println(ff);
            }
        } else {
            System.out.println("No supplies registered.");
        }
    }

    public void printKm() {
        if (!getStackKm().isEmpty()) {
            while (!getStackKm().isEmpty()) {
                double kmPrint = getStackKm().pop();
                System.out.println("km: " + kmPrint);
            }
        } else {
            System.out.println("No km registered.");
        }

    }

    @Override
    public String toString() {
        return "Fuel Supply Data: "
                + getLicencePlate() + " - "
                + getKm() + " - "
                + getLiters() + " - "
                + getAverage() + " - "
                + sdf.format(getSupplyDate());
    }

}
