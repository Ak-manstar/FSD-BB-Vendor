package com.fsd.vendor.bean;

import jakarta.persistence.Column;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

public class RegisterVendorRequestBean {

    private String userId;
//    private String firstName;
//    private String lastName;
    private String vendorOutletName;
//    private Long mobile;
//    private Long alternateMobile;
    private String email;
    private String password;
//    private String location;
    private String state;
    private String city;
    private Long pinCode;
    private LocalDateTime openingTime;
    private LocalDateTime closingTime;
    private int noOfStaff;
    private HashMap<Long,VendorServiceMapping> services;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public HashMap<Long, VendorServiceMapping> getServices() {
        return services;
    }

    public void setServices(HashMap<Long, VendorServiceMapping> services) {
        this.services = services;
    }

    public int getNoOfStaff() {
        return noOfStaff;
    }

    public void setNoOfStaff(int noOfStaff) {
        this.noOfStaff = noOfStaff;
    }

    public LocalDateTime getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(LocalDateTime closingTime) {
        this.closingTime = closingTime;
    }

    public LocalDateTime getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(LocalDateTime openingTime) {
        this.openingTime = openingTime;
    }

    public Long getPinCode() {
        return pinCode;
    }

    public void setPinCode(Long pinCode) {
        this.pinCode = pinCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVendorOutletName() {
        return vendorOutletName;
    }

    public void setVendorOutletName(String vendorOutletName) {
        this.vendorOutletName = vendorOutletName;
    }

    @Override
    public String toString() {
        return "RegisterVendorRequestBean{" +
                "userId='" + userId + '\'' +
                ", vendorOutletName='" + vendorOutletName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", pinCode=" + pinCode +
                ", openingTime=" + openingTime +
                ", closingTime=" + closingTime +
                ", noOfStaff=" + noOfStaff +
                ", services=" + services +
                '}';
    }
}