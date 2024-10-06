package com.fsd.vendor.controller;

import com.fsd.vendor.bean.RegisterServiceRequestBean;
import com.fsd.vendor.bean.ResponseBean;
import com.fsd.vendor.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service")
@CrossOrigin
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public ResponseEntity<ResponseBean> geAllServiceList(){
        return new ResponseEntity<>(new ResponseBean(productService.geAllServices()), HttpStatus.OK);
    }

    @GetMapping("/{service_name}")
    public ResponseEntity<ResponseBean> getService(@PathVariable("service_name") String serviceName){
        return new ResponseEntity<>(new ResponseBean(productService.getServiceByName(serviceName)), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ResponseBean> saveAllService(@RequestBody List<RegisterServiceRequestBean>  services){
        return new ResponseEntity<>(new ResponseBean(productService.saveAllServices(services)), HttpStatus.OK);
    }

}