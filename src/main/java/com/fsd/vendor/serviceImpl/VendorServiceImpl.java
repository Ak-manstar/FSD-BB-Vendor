package com.fsd.vendor.serviceImpl;

import com.fsd.vendor.bean.RegisterVendorRequestBean;
import com.fsd.vendor.bean.RegisterVendorResponseBean;
import com.fsd.vendor.dao.VendorDao;
import com.fsd.vendor.entity.VendorEntity;
import com.fsd.vendor.entity.VendorServiceMappingEntity;
import com.fsd.vendor.service.ProductService;
import com.fsd.vendor.service.VendorService;
import com.fsd.vendor.service.VendorServiceMappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.stream.Collectors;

@Component
public class VendorServiceImpl implements VendorService {

    @Autowired
    VendorDao vendorDao;

    @Autowired
    ProductService productService;

    @Autowired
    VendorServiceMappingService vendorServiceMappingService;

//    @Autowired
//    VendorClient client;

    @Override
    public RegisterVendorResponseBean registerVendor(RegisterVendorRequestBean registerVendorRequestBean) {
        VendorEntity vendorEntity=vendorDao.insertVendor(new VendorEntity(registerVendorRequestBean.getVendorOutletName(), registerVendorRequestBean.getUserId(), registerVendorRequestBean.getEmail(), registerVendorRequestBean.getPassword(), registerVendorRequestBean.getState(), registerVendorRequestBean.getCity(), registerVendorRequestBean.getPinCode(), registerVendorRequestBean.getOpeningTime(), registerVendorRequestBean.getClosingTime(), registerVendorRequestBean.getNoOfStaff()));
        List<VendorServiceMappingEntity> vendorServiceMappingEntities=registerVendorRequestBean.getServices().keySet().stream().map((key)->new VendorServiceMappingEntity(key,vendorEntity.getId(),registerVendorRequestBean.getServices().get(key).getPrice(),registerVendorRequestBean.getServices().get(key).getNoOfSeats())).collect(Collectors.toList());
        int data=vendorServiceMappingService.insertAllVendorServices(vendorServiceMappingEntities);
        String message=data +" services registered successfully";
        return new RegisterVendorResponseBean(vendorEntity.getId(),vendorEntity.getVendorOutletName(),message);
    }

}