/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appcalculateaverage;

import entities.Cars;
import entities.Users;
import entities.Vehicles;
import java.util.Locale;
import java.util.Scanner;

public class AppCalculateAverage {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        //Instantiated user object
        Users user = new Users();
        Vehicles vehicle = new Vehicles();
        Cars cars = new Cars();

        //Create user object
        user = new Users("Vinicius", "053.554.899-07", "123456");

        //Include datas in list
        user.getListUsers().add(user); //new Users(user.getName(), user.getCpf(), user.getPassword())

        //Test include datas into list cars
        cars = new Cars("CAR-0000", "TESTE", "1.6", 4, "GASOLINE", "SEDAN", user.getName());
        vehicle.getListCars().add(cars);
        
        cars = new Cars("CAR-0001", "TESTE", "1.6", 4, "GASOLINE", "SEDAN", user.getName());
        vehicle.getListCars().add(cars);
        
        cars = new Cars("CAR-0003", "Prisma 1.6", user.getName());
        vehicle.getListCars().add(cars);
        

        
        
        
        
//Prints

        System.out.println("Test data includes into class Cars:");
        System.out.println("Ports: " + cars.getQtdPortas());
        //print user data
        System.out.println("------------------------------");
        for (Users u : user.getListUsers()) {
            System.out.println(u);
        }

        //print vehicles data
        for (Vehicles v : vehicle.getListCars()) {
            System.out.println(v);
        }
    }

}
