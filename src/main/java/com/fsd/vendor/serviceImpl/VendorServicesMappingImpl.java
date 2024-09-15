package com.fsd.vendor.serviceImpl;

import com.fsd.vendor.dao.VendorServiceMappingDao;
import com.fsd.vendor.entity.VendorServiceMappingEntity;
import com.fsd.vendor.service.VendorServiceMappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VendorServicesMappingImpl implements VendorServiceMappingService {

    @Autowired
    VendorServiceMappingDao vendorServiceMappingDao;

    @Override
    public int insertAllVendorServices(List<VendorServiceMappingEntity> vendorServiceMappingEntity) {
        return vendorServiceMappingDao.insertAllVendorServiceMappings(vendorServiceMappingEntity);
    }
}