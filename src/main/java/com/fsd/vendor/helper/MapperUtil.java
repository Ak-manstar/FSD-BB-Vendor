package com.fsd.vendor.helper;

import com.fsd.vendor.bean.FetchVendorResponseBean;
import com.fsd.vendor.bean.VerdorServiceResponseBean;
import com.fsd.vendor.entity.VendorEntity;

import java.util.List;
import java.util.stream.Collectors;

public class MapperUtil {

    public static FetchVendorResponseBean mapVendorResponseBean(VendorEntity vendorEntity) {
        FetchVendorResponseBean vendorResponseBean=new FetchVendorResponseBean();
        vendorResponseBean.setVendorOutletName(vendorEntity.getVendorOutletName());
        vendorResponseBean.setVendorId(vendorEntity.getUserId());
        vendorResponseBean.setState(vendorEntity.getState());
        vendorResponseBean.setCity(vendorEntity.getCity());
        vendorResponseBean.setPinCode(vendorEntity.getPinCode());
        vendorResponseBean.setOpeningTime(vendorEntity.getOpeningTime());
        vendorResponseBean.setClosingTime(vendorEntity.getClosingTime());
        vendorResponseBean.setNoOfStaff(vendorEntity.getNoOfStaff());
        vendorResponseBean.setIsActive(vendorEntity.getIsActive());
        vendorResponseBean.setAddressLine1(vendorEntity.getAddresLine1());
        vendorResponseBean.setAddressLine2(vendorEntity.getAddressLine2());
        vendorResponseBean.setMobile(vendorEntity.getMobile());
        List<VerdorServiceResponseBean> verdorServiceResponseBeans= vendorEntity.getServices().stream().map(e->{
            VerdorServiceResponseBean verdorServiceResponseBean=new VerdorServiceResponseBean();
            verdorServiceResponseBean.setVendorServicekey(e.getId());
            verdorServiceResponseBean.setServiceName(e.getServiceEntity().getServiceName());
            verdorServiceResponseBean.setPrice(e.getPrice());
            verdorServiceResponseBean.setServiceId(e.getServiceEntity().getId());
            verdorServiceResponseBean.setImage(e.getServiceEntity().getImage());
            return verdorServiceResponseBean;
        }).collect(Collectors.toList());
        vendorResponseBean.setServices(verdorServiceResponseBeans);
        return vendorResponseBean;
    }
}