
package appcalculateaverage;

import entities.Cars;
import entities.FuelSupply;
import entities.Users;
import entities.ValidOption;
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
        String optionMenu = "";

//Instantiated user object
        ValidOption validOption = new ValidOption();
        Users user = new Users();
        Vehicles vehicle = new Vehicles();
        Cars cars = new Cars();
        FuelSupply fs = new FuelSupply(); //object that inserts the new object into the list

        //MENU
        System.out.println("APPLICATION OF AVERAGE CONTROL");
        do {
            
            //CRIAR VALIDAÇÃO DE USUÁRIO
            
            
            System.out.println("[1]Register | [2]Reports | [3]Search"); //cadastros , relatórios
            optionMenu = validOption.validatedOptionMenu(scan.nextLine()); //Faz a validação da opção do menu

            switch (optionMenu) {
                case "1":
                    System.out.println("[1]Register Vehicles | [2]Register Supply | [3]Register User");
                    optionMenu = validOption.validatedOptionRegister(scan.nextLine());
                    if (optionMenu.equals("1")) {
                        cars.registerVehicle();
                    }
                    if (optionMenu.equals("2")) {
                        cars.printVehiclesMin();
                        fs.registerSupply();
                    }
                    if (optionMenu.equals("3")) {
                        user.registerUser();
                    }
                    //scan.nextLine();
                    break;

                case "2":
                    System.out.println("[1]Report Supply Data | [2]Report User Data | [3]Report Vehicle List | [4]Mileage List"); //mileage = kilometragem
                    optionMenu = validOption.validatedOptionReport(scan.nextLine());
                    if (optionMenu.equals("1")) {
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("------------------------------------------------------------------------------------------");
                        //Print supply data
                        fs.printSupply();
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("------------------------------------------------------------------------------------------");
                    }
                    if (optionMenu.equals("2")) {
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("------------------------------------------------------------------------------------------");
                        //print user data
                        user.printUser();
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("------------------------------------------------------------------------------------------");
                    }
                    if (optionMenu.equals("3")) {
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("------------------------------------------------------------------------------------------");
                        //print vehicles into list vehicles
                        System.out.println("Vehicle List: ");
                        cars.printVehicles();
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("------------------------------------------------------------------------------------------");
                    }
                    if (optionMenu.equals("4")) {
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("------------------------------------------------------------------------------------------");
                        //Print supply data
                        System.out.println("Mileage List: ");
                        fs.printKm();
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("------------------------------------------------------------------------------------------");
                    }
                    //scan.nextLine();
                    break;

                case "3":

                    System.out.println("[1]Search User | [2]Search Vehicle");
                    optionMenu = validOption.validatedOptionSearch(scan.nextLine());
                    if (optionMenu.equals("1")) {
                        user.searchUser();
                    }
                    if (optionMenu.equals("2")) {
                        cars.searchVehicle();
                    }

                    break;

                default:
                    System.out.println("Invalid Option.");
                    break;
            }

            //CONTINUE OR EXIT
            System.out.println("Back to Home Menu? Y/N");
            optionContinue = scan.nextLine();
            if (!optionContinue.equals("Y")) {
                System.out.println("Application closed");
            }
        } while (optionContinue.equals("Y"));

    }
}
