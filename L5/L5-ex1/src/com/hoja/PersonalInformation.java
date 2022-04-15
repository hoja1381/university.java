package com.hoja;

public class PersonalInformation {
    private String userName;
    private String fullName;
    private String password;
    private int age;
    private String address;
    private String phoneNumber;
    private String educationRate;

    public PersonalInformation (String userName,String fullName,String password,
                                int age,String address,String phoneNumber,String educationRate){
        this.userName = userName;
        this.fullName = fullName;
        this.password = password;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.educationRate = educationRate;
    }

    public PersonalInformation(){}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEducationRate() {
        return educationRate;
    }

    public void setEducationRate(String educationRate) {
        this.educationRate = educationRate;
    }
}
