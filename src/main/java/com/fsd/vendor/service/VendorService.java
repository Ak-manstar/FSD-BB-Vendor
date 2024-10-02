package com.fsd.vendor.service;

import com.fsd.vendor.bean.FetchVendorResponseBean;
import com.fsd.vendor.bean.RegisterVendorRequestBean;
import com.fsd.vendor.bean.RegisterVendorResponseBean;
import com.fsd.vendor.entity.VendorEntity;
import org.springframework.stereotype.Service;

@Service
public interface VendorService {
    RegisterVendorResponseBean registerVendor(RegisterVendorRequestBean registerVendorRequestBean);
    FetchVendorResponseBean fetchVendor(String vendorId);

}