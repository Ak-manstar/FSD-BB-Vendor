package com.fsd.vendor.serviceImpl;

import com.fsd.vendor.dao.ServiceDao;
import com.fsd.vendor.entity.ServiceEntity;
import com.fsd.vendor.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    ServiceDao serviceDao;


    @Override
    public List<ServiceEntity> geAllServices() {
        return serviceDao.getAllServices();
    }

    @Override
    public String saveAllServices(List<String> services) {
        List<ServiceEntity> serviceEntities=new ArrayList<>();
        services.stream().forEach(s->serviceEntities.add(new ServiceEntity(s)));
        int count=serviceDao.insertAllServices(serviceEntities);
        String message=count+" services registerd successfully";
        return message;
    }

    @Override
    public ServiceEntity getServiceByName(String ServiceName) {

        return serviceDao.getService(ServiceName);
    }
}