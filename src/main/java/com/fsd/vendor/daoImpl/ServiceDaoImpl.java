package com.fsd.vendor.daoImpl;

import com.fsd.vendor.dao.ServiceDao;
import com.fsd.vendor.entity.ServiceEntity;
import com.fsd.vendor.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServiceDaoImpl implements ServiceDao {

    @Autowired
    ServiceRepository serviceRepository;

    @Override
    public ServiceEntity getService(String ServiceName) {
        return serviceRepository.findByServiceNameAndIsActive(ServiceName,1);
    }

    @Override
    public List<ServiceEntity> getAllServices() {
        return serviceRepository.findAll();
    }

    @Override
    public int insertAllServices(List<ServiceEntity> serviceEntities) {
        return serviceRepository.saveAllAndFlush(serviceEntities).size();
    }
}