package com.fsd.vendor.repository;

import com.fsd.vendor.entity.VendorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VendorRepository extends JpaRepository<VendorEntity,Long> {
    Optional<VendorEntity> findByUserId(String vendorId);
}