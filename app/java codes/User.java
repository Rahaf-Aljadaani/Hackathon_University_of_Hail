package com.example.thefastestfarmer;

public class User {
    String name;
    String neml;
    String pass;
    String email;
    String phone;
    String city;

   public User(  String name, String neml,String pass,String email,String phone,String city){
        this.name=name;
       this.neml=neml;
       this.pass=pass;
       this.email=email;
       this.phone=phone;
       this.city=city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNeml(String neml) {
        this.neml = neml;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getNeml() {
        return neml;
    }

    public String getPass() {
        return pass;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }
}
