/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.ArrayList;
import java.util.List;

public class Users {

    List<Users>listUsers = new ArrayList<Users>();
    String name;
    String cpf;
    String password;

    public Users() {

    }

    public Users(String name){
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

    
    
    
    @Override
    public String toString() {
        return 
                this.getName() + " - "
                + this.getCpf()+ " - "
                + this.getPassword()
                ;
    }
}
