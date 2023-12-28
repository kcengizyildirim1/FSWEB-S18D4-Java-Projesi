package com.workintech.fsweb.s18d4.service;

import com.workintech.fsweb.s18d4.dto.CustomerResponse;
import com.workintech.fsweb.s18d4.entity.Customer;

import java.util.List;

public interface ICustomerService {
    List<CustomerResponse> findAll();
    CustomerResponse findById(Long id);
    CustomerResponse save(Customer customer);
    CustomerResponse delete(Long id);
}
