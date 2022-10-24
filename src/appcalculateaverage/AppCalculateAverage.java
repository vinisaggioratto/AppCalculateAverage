/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appcalculateaverage;

import entities.Cars;
import entities.FuelSupply;
import entities.Motorcycle;
import entities.Truck;
import entities.Users;
import entities.Vehicles;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class AppCalculateAverage {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //Instantiated user object
        Users user = new Users();
        Users createListUser = new Users();

        Vehicles vehicle = new Vehicles();
        Cars cars = new Cars();
        Motorcycle bike = new Motorcycle();
        Truck truck = new Truck();

        FuelSupply fs = new FuelSupply(); //object that inserts the new object into the list
        FuelSupply addFs = new FuelSupply(); //object that receives the data
        Date data = sdf.parse("20/10/2022");

        //Create user object
        user = new Users("Test2", "000.000.000-02", "123654");
        createListUser.getListUsers().add(user);

        //Include datas in list
        //user.getListUsers().add(user); //new Users(user.getName(), user.getCpf(), user.getPassword())
        //Test include datas into list vehicles 0
        cars = new Cars("CAR-0000", "Chevrolet", "Corsa", "1.0", 4, "GASOLINE", "SEDAN", user.getName());
        // vehicle.getListCars().add(cars);
        vehicle.getListVehicles().add(cars);
        data = sdf.parse("21/10/2022");
        addFs = new FuelSupply(cars, 30, data);
        fs.getListFuelSupply().add(addFs);

        //Test include datas into list vehicles 1
        cars = new Cars("CAR-0001", "Fiat", "Palio", "1.4", 4, "GASOLINE", "HATCH", user.getName());
        //vehicle.getListCars().add(cars);
        vehicle.getListVehicles().add(cars);
        data = sdf.parse("21/10/2022");
        addFs = new FuelSupply(cars, 40, data);
        fs.getListFuelSupply().add(addFs);

        //Test include datas into list vehicles 2
        user = new Users("Test0", "000.000.000-00", "123456");
        createListUser.getListUsers().add(user);
        data = sdf.parse("22/10/2022");
        cars = new Cars("CAR-0002", "VOLSKWAGEN", "GOL G3", "1.6", 2, "GASOLINE", "HATCH", user.getName());
        //vehicle.getListCars().add(cars);
        vehicle.getListVehicles().add(cars);

        addFs = new FuelSupply(cars, 50, data);
        fs.getListFuelSupply().add(addFs);

        //includes motorcycle test 0 - vehicles 3
        user = new Users("Test1", "000.000.000-01", "654321");
        createListUser.getListUsers().add(user);
        data = sdf.parse("23/10/2022");
        bike = new Motorcycle("MOT-0003", "YAMAHA", "CROSSER 150Z", "GASOLINE/ALCOOL", "ALL TERRAIN", "149CC", user.getName());
        //vehicle.getListCars().add(cars);
        vehicle.getListVehicles().add(bike);

        addFs = new FuelSupply(bike, 10, data);
        fs.getListFuelSupply().add(addFs);

        //includes truck test 0 - vehicles 4
        user = new Users("Test0", "000.000.000-00", "123456");
        createListUser.getListUsers().add(user);
        data = sdf.parse("23/10/2022");
        truck = new Truck("TRC-0001", "SCANIA", "R620", 800, "BLUE", 2, "DIESEL", 1000, "TRUCK", user.getName());
        vehicle.getListVehicles().add(truck);

        addFs = new FuelSupply(truck, 750, data);
        fs.getListFuelSupply().add(addFs);

//Prints
//Print Tests
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Test data included Fuel Supply");
        for (FuelSupply ff : fs.getListFuelSupply()) {
            System.out.println(ff);
        }
        System.out.println("Fuel Supply Date: " + sdf.format(addFs.getSupplyDate()));

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------------------");
//End Tests

        //print user data
        System.out.println("User data");
        for (Users u : createListUser.getListUsers()) {
            System.out.println(u);
        }
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------------------");

        //print vehicles into list vehicles
        System.out.println("Vehicle data list: ");
        for (Vehicles lv : vehicle.getListVehicles()) {
            System.out.println(lv);
        }
        System.out.println("------------------------------------------------------------------------------------------");
    }

}
