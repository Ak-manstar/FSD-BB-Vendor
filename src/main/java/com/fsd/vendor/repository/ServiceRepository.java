package com.fsd.vendor.repository;

import com.fsd.vendor.entity.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<ServiceEntity,Long> {
    ServiceEntity findByServiceNameAndIsActive(String serviceName, int isActive);
}