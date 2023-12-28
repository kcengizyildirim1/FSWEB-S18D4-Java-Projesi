package com.workintech.fsweb.s18d4.service;

import com.workintech.fsweb.s18d4.dao.AddressDao;
import com.workintech.fsweb.s18d4.dto.AddressResponse;
import com.workintech.fsweb.s18d4.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressService implements IAddressService{
    private AddressDao addressDao;
    @Autowired
    public AddressService(AddressDao addressDao) {
        this.addressDao = addressDao;
    }

    @Override
    public List<AddressResponse> findAll() {
        return null;
    }

    @Override
    public AddressResponse findById(Long id) {
        return null;
    }

    @Override
    public AddressResponse save(Address address) {
        return null;
    }

    @Override
    public AddressResponse delete(Long id) {
        return null;
    }
}
