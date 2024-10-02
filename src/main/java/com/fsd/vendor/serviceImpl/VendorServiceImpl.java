package com.fsd.vendor.serviceImpl;

import com.fsd.vendor.bean.FetchVendorResponseBean;
import com.fsd.vendor.bean.RegisterVendorRequestBean;
import com.fsd.vendor.bean.RegisterVendorResponseBean;
import com.fsd.vendor.bean.VerdorServiceResponseBean;
import com.fsd.vendor.dao.VendorDao;
import com.fsd.vendor.entity.ServiceEntity;
import com.fsd.vendor.entity.VendorEntity;
import com.fsd.vendor.entity.VendorServiceMappingEntity;
import com.fsd.vendor.helper.MapperUtil;
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
        VendorEntity vendorEntity=vendorDao.insertVendor(new VendorEntity(registerVendorRequestBean.getVendorOutletName(), registerVendorRequestBean.getUserId(), registerVendorRequestBean.getState(), registerVendorRequestBean.getCity(), registerVendorRequestBean.getPinCode(),registerVendorRequestBean.getAddressLine1(), registerVendorRequestBean.getAddressLine2(),registerVendorRequestBean.getOpeningTime(), registerVendorRequestBean.getClosingTime(), registerVendorRequestBean.getNoOfStaff()));
        List<VendorServiceMappingEntity> vendorServiceMappingEntities=registerVendorRequestBean.getServices().stream().map(key->new VendorServiceMappingEntity(new ServiceEntity(key.getServiceId()),vendorEntity,key.getPrice())).collect(Collectors.toList());
        int data=vendorServiceMappingService.insertAllVendorServices(vendorServiceMappingEntities);
        String message=data +" services registered successfully";
        return new RegisterVendorResponseBean(vendorEntity.getId(),vendorEntity.getVendorOutletName(),message);
    }

    @Override
    public FetchVendorResponseBean fetchVendor(String vendorId) {
        VendorEntity vendorEntity=vendorDao.getVendor(vendorId);
        FetchVendorResponseBean vendorResponseBean = MapperUtil.mapVendorResponseBean(vendorEntity);
        return vendorResponseBean;
    }

}