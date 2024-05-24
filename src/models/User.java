package models;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class User {

    private String name;
    private String email;
    private String password;
    private String address;
    private String phone;
    private int userID;
    private boolean isAdmin;

    public User(String name, String email, String password, String address, String phone, int userID, boolean isAdmin) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.userID = userID;
        this.isAdmin = isAdmin;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getUserID() {
        return userID;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setName(String name) {
        this.name   = name   ;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void register() {
        String filePath = "/data/users.txt";
        
        try{
            FileWriter fw = new FileWriter(filePath);
            BufferedWriter writer = new BufferedWriter(fw);
            writer.write(name +" "+ userID +" "+ email +" "+ password +" "+ address +" "+ phone +" ");
            writer.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void login(String email, String password) {
        String filePath = "/data/users.txt";
        
        try{
            FileReader fr = new FileReader(filePath);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while(line != null){
                String[] user = line.split(" ");
                if(user[2].equals(email) && user[3].equals(password)){
                    System.out.println("Login Successful");
                    break;
                }
                line = reader.readLine();
            }
            reader.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void logout() {
        System.out.println("Logout Successful");
    }

    public void updateProfile() {
        String filePath = "/data/users.txt";
        
        try{
            FileReader fr = new FileReader(filePath);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while(line != null){
                String[] user = line.split(" ");
                if(Integer.parseInt(user[1]) == userID){
                    FileWriter fw = new FileWriter(filePath);
                    BufferedWriter writer = new BufferedWriter(fw);
                    writer.write(name +" "+ userID +" "+ email +" "+ password +" "+ address +" "+ phone +" ");
                    writer.close();
                    break;
                }
                line = reader.readLine();
            }
            reader.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return  "User :" +
                "======" +
                "Name     : " + name +
                "User ID  : " + userID +
                "Email ID : " + email +
                "Password : " + password + 
                "Address  : " + address +
                "Phone    : " + phone;
    }

}