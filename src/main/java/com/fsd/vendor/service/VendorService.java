package com.fsd.vendor.service;

import com.fsd.vendor.bean.RegisterVendorRequestBean;
import com.fsd.vendor.bean.RegisterVendorResponseBean;
import com.fsd.vendor.entity.VendorEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VendorService {
    RegisterVendorResponseBean registerVendor(RegisterVendorRequestBean registerVendorRequestBean);

}