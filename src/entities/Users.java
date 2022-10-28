
package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Users {

    Scanner scan = new Scanner(System.in);

    Users user;
    Users createListUser;

    List<Users> listUsers = new ArrayList<Users>();
    private String name;
    private String password;

    //CONSTRUCTOR
    public Users() {

    }

    public Users(String name, String password) {
        this.name = name;
        this.password = password;
    }

    //GET / SETTER
    private void setName(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    private String getPassword() {
        return password;
    }

    public List<Users> getListUsers() {
        return listUsers;
    }

    //METHODS
    public void registerUser() {
        System.out.println("Enter the user name: ");
        name = scan.nextLine();
        System.out.println("Enter the password: ");
        password = scan.nextLine();
        user = new Users(name, password);
        getListUsers().add(user);
    }

    public void searchUser() {
        System.out.println("Enter the user name: ");
        String nameU = scan.nextLine();
        boolean returnS = false;

        for (int i = 0; i < this.listUsers.size(); i++) {
            if (this.listUsers.get(i).getName().equalsIgnoreCase(nameU)) {

                returnS = true;
                System.out.println("User found.");
                System.out.println(this.listUsers.get(i).getName() + ".");
                break;
            }
        }
        if (!returnS == true) {
            System.out.println("User not found.");
        }
    }
    
    public boolean validateUser(){
        System.out.println("Enter the user name: ");
        String nameU = scan.nextLine();
        System.out.println("Enter the password: ");
        String pass = scan.nextLine();
        boolean returnS = false;

        for (int i = 0; i < this.listUsers.size(); i++) {
            if (this.listUsers.get(i).getName().equalsIgnoreCase(nameU) && this.listUsers.get(i).getPassword().equalsIgnoreCase(pass)) {
                returnS = true;
                System.out.println("User found. Access application.");                
            }
        }
        
        if (!returnS == true) {
            System.out.println("User not found.");  
        }
        return returnS;
    }
    

    public void printUser() {
        if (!getListUsers().isEmpty()) {

            System.out.println("User data");
            for (Users u : getListUsers()) {
                System.out.println(u);
            }
        } else {
            System.out.println("No registered user.");
        }
    }

    @Override
    public String toString() {
        return this.getName() + " - "
                + this.getPassword();
    }
}
