package com.fsd.vendor.service;

import com.fsd.vendor.bean.*;
import com.fsd.vendor.entity.VendorEntity;
import org.hibernate.sql.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VendorService {
    RegisterVendorResponseBean registerVendor(RegisterVendorRequestBean registerVendorRequestBean);
    FetchVendorResponseBean fetchVendor(String vendorId);

    List<VendorEntity> fetchAllVendor(VendorEntity vendorEntity);
    Status updateVendorDetails(String vendorId, UpdateVendorRequestBean updateVendorDetailsRequestBean);
}