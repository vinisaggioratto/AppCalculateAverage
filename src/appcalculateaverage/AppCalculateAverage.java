/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appcalculateaverage;

import entities.Cars;
import entities.FuelSupply;
import entities.Users;
import entities.Vehicles;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class AppCalculateAverage {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
//Variables
        String optionContinue = "Y"; //C = YES   N = NO
        int optionMenu = 0;

//Instantiated user object
        Users user = new Users();

        Vehicles vehicle = new Vehicles();
        Cars cars = new Cars();

        FuelSupply fs = new FuelSupply(); //object that inserts the new object into the list

        //MENU
        do {

            System.out.println("APPLICATION OF AVERAGE CONTROL");
            System.out.println("[1]Register | [2]Reports | [3]Search Vehicle"); //cadastros , relatórios
            optionMenu = scan.nextInt();

            switch (optionMenu) {
                case 1:
                    System.out.println("[1]Register Vehicles | [2]Register Supply | [3]Register User");
                    optionMenu = scan.nextInt();
                    if (optionMenu == 1) {
                        cars.registerVehicle();
                    }
                    if (optionMenu == 2) {
                        fs.registerSupply();
                    }
                    if (optionMenu == 3) {
                        user.registerUser();
                    }
                    break;

                case 2:
                    System.out.println("[1]Report Supply Data | [2]Report User Data | [3]Report Vehicle List ");
                    optionMenu = scan.nextInt();
                    if (optionMenu == 1) {
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("------------------------------------------------------------------------------------------");
                        //Print supply data
                        System.out.println("Supply Data");
                        fs.printSupply();
                        fs.printKm();
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("------------------------------------------------------------------------------------------");
                    }
                    if (optionMenu == 2) {
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("------------------------------------------------------------------------------------------");
                        //print user data
                        System.out.println("User Data");
                        user.printUser();
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("------------------------------------------------------------------------------------------");

                        System.out.println("User List Size: ");
                        System.out.println(user.getListUsers().size());
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("------------------------------------------------------------------------------------------");
                    }
                    if (optionMenu == 3) {
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("------------------------------------------------------------------------------------------");
                        //print vehicles into list vehicles
                        System.out.println("Vehicle List: ");
                        cars.printVehicles();

                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("------------------------------------------------------------------------------------------");
                    }

                    break;

                case 3:
                    scan.nextLine();
                    user.searchUser();
                    break;
            }

            scan.nextLine();
            //CONTINUE OR EXIT
            System.out.println("Back to Home Menu? Y/N");
            optionContinue = scan.nextLine();
            if (!optionContinue.equals("Y")) {
                System.out.println("Application closed");
            }

        } while (optionContinue.equals("Y"));

    }

}
