
package entities;

import interfaces.RegisterVehicles;
import java.util.Scanner;

public class Cars extends Vehicles implements RegisterVehicles {

    Scanner scan = new Scanner(System.in);

    Cars car;
    Vehicles vehicles = new Vehicles();
    Users users;

    String motor;
    int qtdDoors;

    public Cars() {
    }

    public Cars(String licencePlate, String brand, String model, String color, String motor, int qtdDoors,
            String fuel, String type) {
        super(licencePlate, brand, model, color, fuel, type);

        this.licencePlate = licencePlate;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.motor = motor;
        this.qtdDoors = qtdDoors;
        this.fuel = fuel;
        this.type = type;

    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getQtdDoors() {
        return qtdDoors;
    }

    public void setQtdDoors(int qtdDoors) {
        this.qtdDoors = qtdDoors;
    }

    @Override
    public void registerVehicle() {
        System.out.println("Enter the Licence Plate: ");
        licencePlate = scan.nextLine();
        System.out.println("Enter the Brand: ");
        brand = scan.nextLine();
        System.out.println("Enter the model:");
        model = scan.nextLine();
        System.out.println("Enter the color: ");
        color = scan.nextLine();
        System.out.println("Motor: (1.0 / 2.0)");
        motor = scan.nextLine();
        System.out.println("Doors: ");
        qtdDoors = scan.nextInt();
        scan.nextLine();
        System.out.println("Fuel type: ");
        fuel = scan.nextLine();
        System.out.println("Type: (sedan/hatch)");
        type = scan.nextLine();
        car = new Cars(licencePlate, brand, model, color, motor, qtdDoors, fuel, type);
        vehicles.getListVehicles().add(car);

    }

    public void searchVehicle() {
        System.out.println("Enter the Licence Plate: ");
        String licenceP = scan.nextLine();
        boolean retorno = false;

        for (int i = 0; i < vehicles.getListVehicles().size(); i++) {
            if (vehicles.getListVehicles().get(i).getLicencePlate().equalsIgnoreCase(licenceP)) {
                retorno = true;
                System.out.println("Vehicle found.");
                System.out.println(vehicles.getListVehicles().get(i).getLicencePlate());
                break;
            }
        }
        if (!retorno == true) {
            System.out.println("No registered vehicle.");
        }
    }

    public void printVehiclesMin() {

            System.out.println("Registered vehicles: ");
            for (int i = 0; i < vehicles.getListVehicles().size(); i++) {
                System.out.println(vehicles.getListVehicles().get(i).getLicencePlate() + " | ");
            }
    }

    public void printVehicles() {
        if (!vehicles.getListVehicles().isEmpty()) {

            for (Vehicles lv : vehicles.getListVehicles()) {
                System.out.println(lv);
            }
        } else {
            System.out.println("No registered vehicle.");
        }
    }

}
