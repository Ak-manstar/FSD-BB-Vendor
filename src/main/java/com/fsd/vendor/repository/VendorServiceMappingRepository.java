package com.fsd.vendor.repository;

import com.fsd.vendor.entity.VendorServiceMappingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface VendorServiceMappingRepository extends JpaRepository<VendorServiceMappingEntity,Long> {

}