package com.workintech.fsweb.s18d4.service;

import com.workintech.fsweb.s18d4.dto.AddressResponse;
import com.workintech.fsweb.s18d4.entity.Address;

import java.util.List;

public interface IAddressService {
    List<AddressResponse> findAll();
    AddressResponse findById(Long id);
    AddressResponse save(Address address);
    AddressResponse delete(Long id);

}
