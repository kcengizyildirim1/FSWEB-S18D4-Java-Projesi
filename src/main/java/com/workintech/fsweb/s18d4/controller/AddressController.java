package com.workintech.fsweb.s18d4.controller;

import com.workintech.fsweb.s18d4.converter.DtoConverter;
import com.workintech.fsweb.s18d4.dto.AddressResponse;
import com.workintech.fsweb.s18d4.entity.Address;
import com.workintech.fsweb.s18d4.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workintech/address")
public class AddressController {
    private IAddressService addressService;
    @Autowired
    public AddressController(IAddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping("/")
    public AddressResponse save(@RequestBody Address address){
        return DtoConverter.convertToAddressResponse(address);
    }
}
