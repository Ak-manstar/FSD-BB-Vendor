package com.fsd.vendor.dao;

import com.fsd.vendor.entity.VendorEntity;
import org.springframework.stereotype.Component;

@Component
public interface VendorDao {

    VendorEntity insertVendor(VendorEntity vendorEntity);
    VendorEntity getVendor(String vendorId);
    VendorEntity updateVendor( VendorEntity vendorEntity);

}

