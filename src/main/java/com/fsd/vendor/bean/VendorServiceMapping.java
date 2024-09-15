package com.fsd.vendor.bean;

public class VendorServiceMapping {

    private Long price;
    private Long noOfSeats;

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Long noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    @Override
    public String toString() {
        return "VendorServiceMappingEntity{" +
                "price=" + price +
                ", noOfSeats=" + noOfSeats +
                '}';
    }
}