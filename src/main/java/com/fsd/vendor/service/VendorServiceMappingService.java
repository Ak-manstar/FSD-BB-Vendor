package com.fsd.vendor.service;

import com.fsd.vendor.entity.VendorServiceMappingEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VendorServiceMappingService {

    int insertAllVendorServices(List<VendorServiceMappingEntity> vendorServiceMappingEntity);

}