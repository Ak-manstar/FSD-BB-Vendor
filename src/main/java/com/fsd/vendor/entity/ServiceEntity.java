package com.fsd.vendor.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="service_entity")
public class ServiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "service_name",nullable = false)
    private String serviceName;

    @Column(name="created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "last_updated_at")
    private LocalDateTime lastUpdatedAt;

    @Column(name = "is_active")
    private int isActive;

    @OneToMany(mappedBy = "serviceId")
    private List<VendorServiceMappingEntity> vendors;

    public ServiceEntity(String serviceName) {
        this.serviceName = serviceName;
        this.isActive=1;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public List<VendorServiceMappingEntity> getVendors() {
        return vendors;
    }

    public void setVendors(List<VendorServiceMappingEntity> vendors) {
        this.vendors = vendors;
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

    @Override
    public String toString() {
        return "ServiceEntity{" +
                "id=" + id +
                ", serviceName='" + serviceName + '\'' +
                ", createdAt=" + createdAt +
                ", lastUpdatedAt=" + lastUpdatedAt +
                ", isActive=" + isActive +
                ", vendors=" + vendors +
                '}';
    }
}