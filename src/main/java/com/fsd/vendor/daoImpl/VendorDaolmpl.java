package com.fsd.vendor.daoImpl;

import com.fsd.vendor.dao.VendorDao;
import com.fsd.vendor.entity.VendorEntity;
import com.fsd.vendor.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VendorDaolmpl implements VendorDao {

    @Autowired
    VendorRepository vendorRepository;

    @Override
    public VendorEntity insertVendor(VendorEntity vendorEntity) {
        return vendorRepository.saveAndFlush(vendorEntity);
    }
}