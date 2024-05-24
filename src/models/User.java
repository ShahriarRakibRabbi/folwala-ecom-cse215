package models;
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

    @Override
    public String toString() {
        return "User{" +
                "name  ='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", userID=" + userID +
                ", isAdmin=" + isAdmin +
                '}';
    }

}