package com.workintech.fsweb.s18d4.service;

import com.workintech.fsweb.s18d4.dto.AccountResponse;
import com.workintech.fsweb.s18d4.entity.Account;

import java.util.List;

public interface IAccountService {
    List<AccountResponse> findAll();
    AccountResponse findById(Long id);
    AccountResponse save(Account account);
    AccountResponse delete(Long id);
}
