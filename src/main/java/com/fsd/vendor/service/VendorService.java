package com.fsd.vendor.service;

import com.fsd.vendor.bean.*;
import com.fsd.vendor.entity.VendorEntity;
import org.hibernate.sql.Update;
import org.springframework.stereotype.Service;

@Service
public interface VendorService {
    RegisterVendorResponseBean registerVendor(RegisterVendorRequestBean registerVendorRequestBean);
    FetchVendorResponseBean fetchVendor(String vendorId);


    Status updateVendorDetails(String vendorId, UpdateVendorRequestBean updateVendorDetailsRequestBean);
}