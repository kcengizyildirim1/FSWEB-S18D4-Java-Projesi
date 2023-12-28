package com.workintech.fsweb.s18d4.controller;

import com.workintech.fsweb.s18d4.dto.CustomerResponse;
import com.workintech.fsweb.s18d4.entity.Customer;
import com.workintech.fsweb.s18d4.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workintech/customer")
public class CustomerController {
    private ICustomerService customerService;
    @Autowired
    public CustomerController(ICustomerService customerService) {
        this.customerService = customerService;
    }
    @PostMapping("/")
    public CustomerResponse save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @GetMapping("/")
    public List<CustomerResponse> findAll(){
        return customerService.findAll();
    }
}
