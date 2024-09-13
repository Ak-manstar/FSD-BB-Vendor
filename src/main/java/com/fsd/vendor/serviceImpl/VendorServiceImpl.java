package com.fsd.vendor.serviceImpl;

import com.fsd.vendor.bean.ErrorBean;
import com.fsd.vendor.client.VendorClient;
import com.fsd.vendor.dao.VendorDao;
import com.fsd.vendor.entity.VendorEntity;
import com.fsd.vendor.exception.VendorException;
import com.fsd.vendor.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorServiceImpl implements VendorService {

    @Autowired
    VendorDao dao;

    @Autowired
    VendorClient client;

    @Override
    public List<VendorEntity> dummyGetService() {
        if(dao.getdata().size()!=0)
        return dao.getdata();
        else{
            throw new VendorException(new ErrorBean("OO1","data Not found"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
