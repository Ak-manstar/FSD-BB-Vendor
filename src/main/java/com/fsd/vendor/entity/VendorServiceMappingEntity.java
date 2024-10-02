package com.fsd.vendor.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "vendor_service_mapping",schema = "vendor")
public class VendorServiceMappingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @JsonBackReference
    @JoinColumn(name="service_id")
    @ManyToOne
    private ServiceEntity serviceEntity;

    @JsonBackReference
    @JoinColumn(name="vendor_id")
    @ManyToOne
    private VendorEntity vendorEntity;

    private Long price;

    @Column(name="created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "last_updated_at")
    private LocalDateTime lastUpdatedAt;

    @Column(name = "is_active")
    private int isActive;

    public VendorServiceMappingEntity() {
    }



    public VendorServiceMappingEntity(ServiceEntity serviceEntity, VendorEntity vendorEntity, Long price) {
        this.serviceEntity = serviceEntity;
        this.vendorEntity = vendorEntity;
        this.price = price;
        this.isActive=1;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ServiceEntity getServiceEntity() {
        return serviceEntity;
    }

    public void setServiceEntity(ServiceEntity serviceEntity) {
        this.serviceEntity = serviceEntity;
    }

    public VendorEntity getVendorEntity() {
        return vendorEntity;
    }

    public void setVendorEntity(VendorEntity vendorEntity) {
        this.vendorEntity = vendorEntity;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
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
                ", serviceEntity=" + serviceEntity +
                ", vendorEntity=" + vendorEntity +
                ", price=" + price +
                ", createdAt=" + createdAt +
                ", lastUpdatedAt=" + lastUpdatedAt +
                ", isActive=" + isActive +
                '}';
    }
}