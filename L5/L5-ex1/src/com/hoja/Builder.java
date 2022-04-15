package com.hoja;

public class Builder {
    private String userName;
    private String fullName;
    private String password;
    private int age;
    private String address;
    private String phoneNumber;
    private String educationRate;

    public Builder(String userName, String fullName, String password,
                   int age, String address, String phoneNumber, String educationRate){
        this.userName = userName;
        this.fullName = fullName;
        this.password = password;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.educationRate = educationRate;
    }

    public Builder(){}

    public Builder setUserName(String userName){
        this.userName = userName ;
        return this;
    }

    public Builder setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public Builder setPassword(String password) {
        this.password = password;
        return this;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public Builder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Builder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Builder setEducationRate(String educationRate) {
        this.educationRate = educationRate;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEducationRate() {
        return educationRate;
    }

    public Builder Createbuilder () {
        return  new Builder().setUserName(userName).setFullName(fullName).setPassword(password).setAge(age).setPhoneNumber(phoneNumber).setAddress(address).setEducationRate(educationRate);
    }


}
