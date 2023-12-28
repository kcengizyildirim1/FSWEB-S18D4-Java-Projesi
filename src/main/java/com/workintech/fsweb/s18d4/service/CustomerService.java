package com.workintech.fsweb.s18d4.service;

import com.workintech.fsweb.s18d4.converter.DtoConverter;
import com.workintech.fsweb.s18d4.dao.CustomerDao;
import com.workintech.fsweb.s18d4.dto.CustomerResponse;
import com.workintech.fsweb.s18d4.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService{
    private CustomerDao customerDao;

    @Autowired
    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public List<CustomerResponse> findAll() {
        return DtoConverter.convertToCustomerListResponseList(customerDao.findAll());
    }

    @Override
    public CustomerResponse findById(Long id) {
        Optional<Customer> optionalCustomer = customerDao.findById(id);
        if(optionalCustomer.isPresent()){
            return DtoConverter.convertToCustomerResponse(optionalCustomer.get()) ;
        }
        // Exception handle
        return null;
    }

    @Override
    public CustomerResponse save(Customer customer) {
        return DtoConverter.convertToCustomerResponse(customerDao.save(customer));
    }

    @Override
    public CustomerResponse delete(Long id) {
        CustomerResponse customer = findById(id);
        customerDao.deleteById(customer.id());
        return customer;
    }
}
