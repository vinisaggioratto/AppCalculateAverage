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

    private List<FuelSupply> listFuelSupply = new ArrayList<FuelSupply>();
    private Stack<Float> stackKm = new Stack<Float>();
    private Cars car = new Cars();
    private Average av = new Average();
    private FuelSupply addFs;

    private String licencePlate;
    private float liters = 0.0f; //litros
    private Date supplyDate; //data abastecimento
    private Date data;
    private float km = 0.0f;
    private float average = 0.0f;
    private float oldKm = 0.0f;

    //CONSTRUCTOR
    public FuelSupply() {
    }

    public FuelSupply(String licencePlate, float km, float liters, Date supplyDate, float average) {
        this.licencePlate = licencePlate;
        this.km = km;
        this.liters = liters;
        this.supplyDate = supplyDate;
        this.average = average;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public Stack<Float> getStackKm() {
        return stackKm;
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

    public void setKm(float km) {
        this.km = km;
    }

    public double getLiters() {
        return liters;
    }

    public void setLiters(float liters) {
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
        data = sdf.parse(scan.nextLine());
        System.out.println("Enter the km: ");
        km = scan.nextFloat();
        System.out.println("Enter the liters: ");
        liters = scan.nextFloat();

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
                + "Licence Plate: " + getLicencePlate() + " - "
                + "KM: " + getKm() + " - "
                + "Liters: " + getLiters() + " - "
                + "Average: " + String.format("%.2f", getAverage()) + " - "
                + "Date: " + sdf.format(getSupplyDate());
    }

}
