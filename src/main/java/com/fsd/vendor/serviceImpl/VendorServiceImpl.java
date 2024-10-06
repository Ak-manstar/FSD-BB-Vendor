package com.fsd.vendor.serviceImpl;

import com.fsd.vendor.bean.*;
import com.fsd.vendor.dao.VendorDao;
import com.fsd.vendor.entity.ServiceEntity;
import com.fsd.vendor.entity.VendorEntity;
import com.fsd.vendor.entity.VendorServiceMappingEntity;
import com.fsd.vendor.helper.MapperUtil;
import com.fsd.vendor.repository.ServiceRepository;
import com.fsd.vendor.repository.VendorServiceMappingRepository;
import com.fsd.vendor.service.ProductService;
import com.fsd.vendor.service.VendorService;
import com.fsd.vendor.service.VendorServiceMappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class VendorServiceImpl implements VendorService {

    @Autowired
    VendorDao vendorDao;

    @Autowired
    ProductService productService;

    @Autowired
    VendorServiceMappingService vendorServiceMappingService;

    @Autowired
    VendorServiceMappingRepository vendorServiceMappingRepository;

    @Autowired
    ServiceRepository serviceRepository;


//    @Autowired
//    VendorClient client;

    @Override
    public RegisterVendorResponseBean registerVendor(RegisterVendorRequestBean registerVendorRequestBean) {
        VendorEntity vendorEntity=vendorDao.insertVendor(new VendorEntity(registerVendorRequestBean.getVendorOutletName(), registerVendorRequestBean.getUserId(), registerVendorRequestBean.getState(), registerVendorRequestBean.getCity(), registerVendorRequestBean.getPinCode(),registerVendorRequestBean.getAddressLine1(), registerVendorRequestBean.getAddressLine2(),registerVendorRequestBean.getOpeningTime(), registerVendorRequestBean.getClosingTime(), registerVendorRequestBean.getNoOfStaff(),registerVendorRequestBean.getMobile()));
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

    @Override
    public Status updateVendorDetails(String vendorId, UpdateVendorRequestBean updateVendorDetailsRequestBean) {
        VendorEntity vendorEntity=vendorDao.getVendor(vendorId);
        if(vendorEntity!=null){
            vendorEntity.setAddresLine1(updateVendorDetailsRequestBean.getAddressLine1());
            vendorEntity.setAddressLine2(updateVendorDetailsRequestBean.getAddressLine2());
            vendorEntity.setCity(updateVendorDetailsRequestBean.getCity());
            vendorEntity.setState(updateVendorDetailsRequestBean.getState());
            vendorEntity.setPinCode(updateVendorDetailsRequestBean.getPinCode());
            vendorEntity.setOpeningTime(updateVendorDetailsRequestBean.getOpeningTime());
            vendorEntity.setClosingTime(updateVendorDetailsRequestBean.getClosingTime());
            vendorEntity.setNoOfStaff(updateVendorDetailsRequestBean.getNoOfStaff());
            vendorEntity.setServices(updateOrAddVendorServices(vendorEntity,updateVendorDetailsRequestBean));
            vendorDao.updateVendor(vendorEntity);
            return new Status(true,"Vendor details updated successfully");
        }
        else{
            return new Status(false,"Vendor not found");
        }
    }


    private List<VendorServiceMappingEntity> updateOrAddVendorServices(VendorEntity vendorEntity , UpdateVendorRequestBean updateVendorDetailsRequestBean) {
        List<VendorServiceMappingEntity> existingMappings = vendorServiceMappingRepository.findByVendorEntity(vendorEntity);


        Map<Long, VendorServiceMappingEntity> existingServiceMap = existingMappings.stream()
                .collect(Collectors.toMap(mapping -> mapping.getServiceEntity().getId(), mapping -> mapping));

        for (VendorServiceMapping serviceDTO : updateVendorDetailsRequestBean.getServices()) {
            Long serviceId = serviceDTO.getServiceId();
            Long price = serviceDTO.getPrice();

            VendorServiceMappingEntity existingMapping = existingServiceMap.get(serviceId);
            if (existingMapping != null) {
                existingMapping.setPrice(price);
            } else {
                VendorServiceMappingEntity newMapping = new VendorServiceMappingEntity(
                        serviceRepository.findById(serviceId).orElseThrow(() -> new RuntimeException("Service not found")),
                        vendorEntity,
                        price
                );
                existingMappings.add(newMapping);
            }
        }

        return existingMappings;
    }

}