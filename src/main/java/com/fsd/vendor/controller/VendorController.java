package com.fsd.vendor.controller;

import com.fsd.vendor.bean.RegisterVendorRequestBean;
import com.fsd.vendor.bean.RegisterVendorResponseBean;
import com.fsd.vendor.bean.ResponseBean;
import com.fsd.vendor.bean.UpdateVendorRequestBean;
import com.fsd.vendor.service.VendorService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendor")
@CrossOrigin
public class VendorController {

    @Autowired
    VendorService service;

    @PostMapping("/register")
    public ResponseEntity<ResponseBean> registerVendor(@RequestBody RegisterVendorRequestBean registerVendorRequestBean){
        RegisterVendorResponseBean registerVendorResponseBean=service.registerVendor(registerVendorRequestBean);
        return new ResponseEntity<>(new ResponseBean(registerVendorResponseBean), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseBean> fetchVendor(@PathVariable("id") String vendorid){
        return new ResponseEntity<>(new ResponseBean(service.fetchVendor(vendorid)), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseBean> updateVendorDetails(@PathVariable("id") String vendorid,@RequestBody UpdateVendorRequestBean updateVendorDetailsBean){
        return new ResponseEntity<>(new ResponseBean(service.updateVendorDetails(vendorid,updateVendorDetailsBean)), HttpStatus.OK);
    }


}