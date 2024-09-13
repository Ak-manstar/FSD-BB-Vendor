package com.fsd.vendor.daoImpl;

import com.fsd.vendor.dao.VendorDao;
import com.fsd.vendor.entity.VendorEntity;
import com.fsd.vendor.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VendorDaolmpl implements VendorDao {

    @Autowired
    VendorRepository repository;

    @Override
    public List<VendorEntity> getdata() {
        return repository.findAll();
    }

    //methods to implement crud operations.
}
