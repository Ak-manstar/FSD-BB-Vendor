package com.fsd.vendor.service;

import com.fsd.vendor.entity.VendorEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface VendorService {

    //here you can declare methods of service

    List<VendorEntity> dummyGetService();
}
