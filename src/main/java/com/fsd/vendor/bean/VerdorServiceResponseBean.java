package com.fsd.vendor.bean;

public class VerdorServiceResponseBean {

    private Long vendorServicekey;
    private String serviceName;
    private Long price;
    private Long serviceId;
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public Long getVendorServicekey() {
        return vendorServicekey;
    }

    public void setVendorServicekey(Long vendorServicekey) {
        this.vendorServicekey = vendorServicekey;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}