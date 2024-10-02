package com.fsd.vendor.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "vendor_details",schema = "vendor")
public class VendorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "vendor_outlet",nullable = false)
    private String vendorOutletName;

    @Column(name = "user_id",unique = true)
    private String userId;
//    @Column(name = "first_name",nullable = false)
//    private String firstName;
//    @Column(name = "last_name")
//    private String lastName;
//    @Column(name = "mobile",nullable = false)
//    private Long mobile;
//    @Column(name = "alt_mobile")
//    private Long alternateMobile;
//    @Column(name = "email")
//    private String email;
    @JsonManagedReference
    @OneToMany(mappedBy = "vendorEntity" ,cascade = CascadeType.ALL)
    private List<VendorServiceMappingEntity> services;
//    @JsonIgnore
//    private String password;
//    to store lattitude and logitude
//    private String location;
    private String state;
    private String city;
    @Column(name = "pin_code")
    private Long pinCode;
    @Column(name="aggress_line_1")
    private String addresLine1;
    @Column(name="address_line_2")
    private String addressLine2;
    @Column(name="op_time")
    private LocalTime openingTime;
    @Column(name = "cl_time")
    private LocalTime closingTime;
    @Column(name = "no_of_staff")
    private int noOfStaff;
//    @Column(name = "no_of_seats")
//    private Long noOfSeats;
    @CreationTimestamp
    @Column(name="created_at")
    private LocalDateTime createdAt;
    @UpdateTimestamp
    @Column(name = "last_updated_at")
    private LocalDateTime lastUpdatedAt;

    @Column(name = "is_active")
    private int isActive;

    public VendorEntity() {
    }

    public VendorEntity(String vendorOutletName, String userId, String state, String city, Long pinCode, String addresLine1, String addressLine2, LocalTime openingTime, LocalTime closingTime, int noOfStaff) {
        this.vendorOutletName = vendorOutletName;
        this.userId = userId;
        this.state = state;
        this.city = city;
        this.pinCode = pinCode;
        this.addresLine1 = addresLine1;
        this.addressLine2 = addressLine2;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.noOfStaff = noOfStaff;
        this.isActive=1;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public LocalDateTime getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public int getNoOfStaff() {
        return noOfStaff;
    }

    public void setNoOfStaff(int noOfStaff) {
        this.noOfStaff = noOfStaff;
    }

    public LocalTime getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    public LocalTime getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddresLine1() {
        return addresLine1;
    }

    public void setAddresLine1(String addresLine1) {
        this.addresLine1 = addresLine1;
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

    public List<VendorServiceMappingEntity> getServices() {
        return services;
    }

    public void setServices(List<VendorServiceMappingEntity> services) {
        this.services = services;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getVendorOutletName() {
        return vendorOutletName;
    }

    public void setVendorOutletName(String vendorOutletName) {
        this.vendorOutletName = vendorOutletName;
    }

    @Override
    public String toString() {
        return "VendorEntity{" +
                "id=" + id +
                ", vendorOutletName='" + vendorOutletName + '\'' +
                ", userId='" + userId + '\'' +
                ", services=" + services +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", pinCode=" + pinCode +
                ", addresLine1='" + addresLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", openingTime=" + openingTime +
                ", closingTime=" + closingTime +
                ", noOfStaff=" + noOfStaff +
                ", createdAt=" + createdAt +
                ", lastUpdatedAt=" + lastUpdatedAt +
                ", isActive=" + isActive +
                '}';
    }
}