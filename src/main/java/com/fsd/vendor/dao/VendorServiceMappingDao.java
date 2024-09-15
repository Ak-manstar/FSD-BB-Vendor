package com.fsd.vendor.dao;

import com.fsd.vendor.entity.VendorServiceMappingEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface VendorServiceMappingDao {

    int insertAllVendorServiceMappings(List<VendorServiceMappingEntity> vendorServiceMappingEntityList);
}