package com.fsd.vendor.daoImpl;

import com.fsd.vendor.dao.VendorDao;
import com.fsd.vendor.entity.VendorEntity;
import com.fsd.vendor.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class VendorDaolmpl implements VendorDao {

    @Autowired
    VendorRepository vendorRepository;

    @Override
    public VendorEntity insertVendor(VendorEntity vendorEntity) {
        return vendorRepository.save(vendorEntity);
    }

    @Override
    public VendorEntity getVendor(String vendorId) {
        Optional<VendorEntity> vendor=vendorRepository.findByUserId(vendorId);
        if(vendor.isPresent()) {
            return vendor.get();
        }
        else {
            return null;
        }
    }

    @Override
    public VendorEntity updateVendor(VendorEntity vendorEntity) {
        return vendorRepository.save(vendorEntity);
    }


}