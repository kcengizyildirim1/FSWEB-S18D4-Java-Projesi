package com.workintech.fsweb.s18d4.converter;

import com.workintech.fsweb.s18d4.dto.AccountResponse;
import com.workintech.fsweb.s18d4.dto.AddressResponse;
import com.workintech.fsweb.s18d4.dto.CustomerResponse;
import com.workintech.fsweb.s18d4.entity.Account;
import com.workintech.fsweb.s18d4.entity.Address;
import com.workintech.fsweb.s18d4.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class DtoConverter {

    // ACCOUNT
    public static List<AccountResponse> convertToAccountResponseList(List<Account> accounts){
        List<AccountResponse> responses = new ArrayList<>();
        accounts.forEach(account -> responses.add(
                new AccountResponse(
                        account.getId(),
                        account.getAccountName(),
                        account.getMoneyAmount()
                )));
        return responses;
    }

    public static AccountResponse convertToAccountResponse(Account account){
        return new AccountResponse(account.getId(),account.getAccountName(),account.getMoneyAmount());
    }

    // CUSTOMER

    public static List<CustomerResponse> convertToCustomerListResponseList(List<Customer> customers){
        List<CustomerResponse> responses = new ArrayList<>();

        customers.forEach(customer -> {
            responses.add(new CustomerResponse(customer.getId(), customer.getFirstName(),customer.getLastName(),
                    customer.getEmail(), customer.getSalary(), new AddressResponse(customer.getAddress().getStreet(),
                    customer.getAddress().getNo(),customer.getAddress().getCity(),customer.getAddress().getCountry(),
                    customer.getAddress().getDescription())
                   ));
        });
        return responses;
    }

    public static CustomerResponse convertToCustomerResponse(Customer customer){
        return new CustomerResponse(customer.getId(),customer.getFirstName(),
                customer.getLastName(),customer.getEmail(),customer.getSalary(),
                new AddressResponse(customer.getAddress().getStreet(),customer.getAddress().getNo(),
                        customer.getAddress().getCity(),customer.getAddress().getCountry(),customer.getAddress().getDescription()));
    }

    // ADDRESS

    public static AddressResponse convertToAddressResponse(Address address) {
        return new AddressResponse(
                address.getStreet(),
                address.getNo(),
                address.getCity(),
                address.getCountry(),
                address.getDescription()
        );
    }

    public static List<AddressResponse> convertToAddressResponseList(List<Address> addresses){
        List<AddressResponse> responses = new ArrayList<>();
        addresses.forEach(address -> responses.add(
                new AddressResponse(
                        address.getStreet(),
                        address.getNo(),
                        address.getCity(),
                        address.getCountry(),
                        address.getDescription()
                )));
        return responses;
    }
}
