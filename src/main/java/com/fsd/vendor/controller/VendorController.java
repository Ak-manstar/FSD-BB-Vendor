package com.fsd.vendor.controller;

import com.fsd.vendor.bean.RegisterVendorRequestBean;
import com.fsd.vendor.bean.RegisterVendorResponseBean;
import com.fsd.vendor.bean.ResponseBean;
import com.fsd.vendor.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendor")
public class VendorController {

    @Autowired
    VendorService service;

    @PostMapping("/register")
    public ResponseEntity<ResponseBean> registerVendor(@RequestBody RegisterVendorRequestBean registerVendorRequestBean){
        RegisterVendorResponseBean registerVendorResponseBean=service.registerVendor(registerVendorRequestBean);
        return new ResponseEntity<>(new ResponseBean(registerVendorResponseBean), HttpStatus.OK);
    }
}