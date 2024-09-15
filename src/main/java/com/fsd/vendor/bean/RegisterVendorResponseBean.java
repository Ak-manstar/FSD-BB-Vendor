package com.fsd.vendor.bean;

public class RegisterVendorResponseBean {

    private Long vendorId;
    private String outletName;
    private String message;

    public RegisterVendorResponseBean(Long vendorId, String outletName, String message) {
        this.vendorId = vendorId;
        this.outletName = outletName;
        this.message = message;
    }

    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public String getOutletName() {
        return outletName;
    }

    public void setOutletName(String outletName) {
        this.outletName = outletName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}