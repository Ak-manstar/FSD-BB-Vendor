package com.fsd.vendor.repository;

import com.fsd.vendor.entity.VendorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<VendorEntity,Long> {
}
