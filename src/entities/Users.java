/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Users {

    Scanner scan = new Scanner(System.in);

    Users user;
    Users createListUser;

    List<Users> listUsers = new ArrayList<Users>();
    String name;
    String cpf;
    String password;

    public Users() {

    }

    public Users(String name) {
        this.name = name;
    }

    public Users(String name, String cpf, String password) {
        this.name = name;
        this.cpf = cpf;
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getPassword() {
        return password;
    }

    public List<Users> getListUsers() {
        return listUsers;
    }

    public void registerUser() {
        System.out.println("Informe o nome do Usuário: ");
        String nameU = scan.nextLine();
        System.out.println("Informe o cpf: ");
        String cpfU = scan.nextLine();
        System.out.println("Informe a senha: ");
        String passwordU = scan.nextLine();
        user = new Users(nameU, cpfU, passwordU);
        getListUsers().add(user);
    }

    public void searchUser() {
        System.out.println("Informe o nome do Usuário: ");
        String nameU = scan.nextLine();
        boolean retorno = false;

        for (int i = 0; i < this.listUsers.size(); i++) {
            if (this.listUsers.get(i).getName().equalsIgnoreCase(nameU)) {
                System.out.println(this.listUsers.get(i).getName());
                retorno = true;
                System.out.println("Usuário encontrado.");
                break;
            }
        }
        if (!retorno == true) {
            System.out.println("Usuário não encontrado.");
        }
    }

    //prints
    public void printUser(){
        if(!getListUsers().isEmpty()){
            
        System.out.println("User data");
                    for (Users u : getListUsers()) {
                        System.out.println(u);
                    }
    }else{
            System.out.println("Nenhum usuário cadastrado.");
        }
    }
    
    
    
    @Override
    public String toString() {
        return this.getName() + " - "
                + this.getCpf() + " - "
                + this.getPassword();
    }
}
