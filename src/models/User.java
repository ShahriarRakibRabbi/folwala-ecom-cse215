package models;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class User {

    private String name;
    private String password;
    private String address;
    private String phone;
    private boolean isAdmin;

    public User(String name, String phone, String password, String address) {
        this.name = name;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.isAdmin = false;
    }

    public String getName() {
        return name;
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

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void save() {
        String filePath = "data/users.txt";

        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.newLine();
            bufferedWriter
                    .write(name + ":" + phone + ":" + password + ":" + address + ":"
                            + false);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void logout() {
        System.out.println("Logout Successful");
    }

    @Override
    public String toString() {
        return "User :" +
                "======" +
                "Name     : " + name +
                "Password : " + password +
                "Address  : " + address +
                "Phone    : " + phone;
    }

    public static User getUserByPhone(String phone) {
        try {
            FileReader fileReader = new FileReader("data/users.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] user = line.split(":");
                if (user[1].equals(phone)) {
                    User u = new User(user[0], user[1], user[2], user[3]);
                    u.setAdmin(Boolean.parseBoolean(user[4]));
                    bufferedReader.close();
                    return u;
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}