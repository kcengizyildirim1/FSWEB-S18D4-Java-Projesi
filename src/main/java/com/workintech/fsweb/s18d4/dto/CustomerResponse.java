package com.workintech.fsweb.s18d4.dto;


public record CustomerResponse(Long id, String firstName, String lastName, String email, double salary ,
                               AddressResponse addressResponse) {
}
