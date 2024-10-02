package com.fsd.vendor.bean;

public class VendorServiceMapping {

    private Long serviceId;
    private Long price;

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }
    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "VendorServiceMapping{" +
                "serviceId=" + serviceId +
                ", price=" + price +
                '}';
    }
}