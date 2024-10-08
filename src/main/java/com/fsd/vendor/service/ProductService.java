package com.fsd.vendor.service;

import com.fsd.vendor.bean.RegisterServiceRequestBean;
import com.fsd.vendor.entity.ServiceEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<ServiceEntity> geAllServices();
    String saveAllServices(List<RegisterServiceRequestBean>  services);
    ServiceEntity getServiceByName(String ServiceName);


}