package com.fsd.vendor.dao;

import com.fsd.vendor.entity.ServiceEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ServiceDao {

    ServiceEntity getService(String ServiceName);
    List<ServiceEntity> getAllServices();
   // ServiceEntity insertService(ServiceEntity serviceEntity);
    int insertAllServices(List<ServiceEntity> serviceEntities);

}