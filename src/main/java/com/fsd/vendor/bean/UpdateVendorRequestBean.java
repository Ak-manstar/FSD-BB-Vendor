package com.fsd.vendor.bean;

import java.time.LocalTime;
import java.util.List;

public class UpdateVendorRequestBean {

    private String vendorOutletName;
    private String state;
    private String city;
    private String addressLine1;
    private String addressLine2;
    private Long pinCode;
    private LocalTime openingTime;
    private LocalTime closingTime;
    private int noOfStaff;
    private List<VendorServiceMapping> services;

    public UpdateVendorRequestBean() {
    }

    public String getVendorOutletName() {
        return vendorOutletName;
    }

    public void setVendorOutletName(String vendorOutletName) {
        this.vendorOutletName = vendorOutletName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public Long getPinCode() {
        return pinCode;
    }

    public void setPinCode(Long pinCode) {
        this.pinCode = pinCode;
    }

    public LocalTime getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    public LocalTime getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    public int getNoOfStaff() {
        return noOfStaff;
    }

    public void setNoOfStaff(int noOfStaff) {
        this.noOfStaff = noOfStaff;
    }

    public List<VendorServiceMapping> getServices() {
        return services;
    }

    public void setServices(List<VendorServiceMapping> services) {
        this.services = services;
    }

    public UpdateVendorRequestBean(String vendorOutletName, String state, String city, String addressLine1, String addressLine2, Long pinCode, LocalTime openingTime, LocalTime closingTime, int noOfStaff, List<VendorServiceMapping> services) {
        this.vendorOutletName = vendorOutletName;
        this.state = state;
        this.city = city;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.pinCode = pinCode;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.noOfStaff = noOfStaff;
        this.services = services;
    }

    @Override
    public String toString() {
        return "UpdateVendorRequestBean{" +
                "vendorOutletName='" + vendorOutletName + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", pinCode=" + pinCode +
                ", openingTime=" + openingTime +
                ", closingTime=" + closingTime +
                ", noOfStaff=" + noOfStaff +
                ", services=" + services +
                '}';
    }
}
