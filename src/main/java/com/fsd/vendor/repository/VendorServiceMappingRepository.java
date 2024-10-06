package com.fsd.vendor.repository;

import com.fsd.vendor.entity.VendorEntity;
import com.fsd.vendor.entity.VendorServiceMappingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface VendorServiceMappingRepository extends JpaRepository<VendorServiceMappingEntity,Long> {

    List<VendorServiceMappingEntity> findByVendorEntity(VendorEntity vendorEntity);
}