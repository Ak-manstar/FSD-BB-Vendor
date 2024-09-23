package com.fsd.vendor.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "vendor_service_mapping")
public class VendorServiceMappingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name="service_id")
    @ManyToOne(targetEntity = ServiceEntity.class)
    private Long serviceId;

    @JoinColumn(name="vendor_id")
    @ManyToOne(targetEntity = VendorEntity.class)
    private Long vendorId;

    private Long price;

    @Column(name = "no_of_seats")
    private Long noOfSeats;

    @Column(name="created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "last_updated_at")
    private LocalDateTime lastUpdatedAt;

    @Column(name = "is_active")
    private int isActive;

    public VendorServiceMappingEntity(Long serviceId, Long vendorId, Long price, Long noOfSeats) {
        this.serviceId = serviceId;
        this.vendorId = vendorId;
        this.price = price;
        this.noOfSeats = noOfSeats;
        this.isActive=1;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "VendorServiceMappingEntity{" +
                "id=" + id +
                ", service=" + serviceId +
                ", vendor=" + vendorId +
                ", price=" + price +
                ", noOfSeats=" + noOfSeats +
                ", createdAt=" + createdAt +
                ", lastUpdatedAt=" + lastUpdatedAt +
                ", isActive=" + isActive +
                '}';
    }
}