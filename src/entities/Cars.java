/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import interfaces.RegisterVehicles;
import java.util.Scanner;

public class Cars extends Vehicles implements RegisterVehicles {

    Scanner scan = new Scanner(System.in);

    Cars car;
    Vehicles vehicles = new Vehicles();
    Users users;

    String motor;
    int qtdPortas;

    public Cars() {
    }

    public Cars(String licencePlate, String brand, String model) {
        super(licencePlate, brand, model);
        this.licencePlate = licencePlate;
        this.brand = brand;
        this.model = model;

    }

    public Cars(String licencePlate, String brand, String model, String motor, int qtdPortas,
            String fuel, String type) {
        super(licencePlate, brand, model, fuel, type);

        this.licencePlate = licencePlate;
        this.brand = brand;
        this.model = model;
        this.motor = motor;
        this.qtdPortas = qtdPortas;
        this.fuel = fuel;
        this.type = type;

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

    @Override
    public void registerVehicle() {
        System.out.println("Informe a placa: ");
        String placa = scan.nextLine();
        System.out.println("Informe a marca: ");
        String marca = scan.nextLine();
        System.out.println("Informe a modelo:");
        String modelo = scan.nextLine();
        System.out.println("Motor: (1.0 / 2.0)");
        String motor = scan.nextLine();
        System.out.println("Portas: ");
        int portas = scan.nextInt();
        scan.nextLine();
        System.out.println("Combustível: ");
        String comb = scan.nextLine();
        System.out.println("Tipo: ");
        String tipo = scan.nextLine();
        car = new Cars(placa, marca, modelo, motor, portas, comb, tipo);
        vehicles.getListVehicles().add(car);

    }
    
    
    public void searchVehicle() {
        System.out.println("Informe a placa do veículo: ");
        String licenceP = scan.nextLine();
        boolean retorno = false;

        for (int i = 0; i < vehicles.getListVehicles().size(); i++) {
            if (vehicles.getListVehicles().get(i).getLicencePlate().equalsIgnoreCase(licenceP)) {
                System.out.println(vehicles.getListVehicles().get(i).getLicencePlate());
                retorno = true;
                System.out.println("Veículo encontrado.");
                break;
            }
        }
        if (!retorno == true) {
            System.out.println("Veículo não encontrado.");
        }
    }
    
    
    

    public void printVehicles() {
        if (!vehicles.getListVehicles().isEmpty()) {

            System.out.println("Vehicle data list: ");
            for (Vehicles lv : vehicles.getListVehicles()) {
                System.out.println(lv);
            }
        }else{
            System.out.println("Nenhum veículo cadastrado.");
        }
        System.out.println("------------------------------------------------------------------------------------------");
    }

}
