package com.fsd.vendor.dao;

import com.fsd.vendor.entity.VendorEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface VendorDao {

    VendorEntity insertVendor(VendorEntity vendorEntity);
}