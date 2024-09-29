package com.fsd.vendor.daoImpl;

import com.fsd.vendor.dao.VendorServiceMappingDao;
import com.fsd.vendor.entity.VendorServiceMappingEntity;
import com.fsd.vendor.repository.VendorServiceMappingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VendorServiceMappingDaoImpl implements VendorServiceMappingDao {

    @Autowired
    VendorServiceMappingRepository vendorServiceMappingRepository;

    @Override
    public int insertAllVendorServiceMappings(List<VendorServiceMappingEntity> vendorServiceMappingEntityList) {
        return vendorServiceMappingRepository.saveAll(vendorServiceMappingEntityList).size();
    }
}