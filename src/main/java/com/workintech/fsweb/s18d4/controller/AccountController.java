package com.workintech.fsweb.s18d4.controller;

import com.workintech.fsweb.s18d4.converter.DtoConverter;
import com.workintech.fsweb.s18d4.dto.AccountResponse;
import com.workintech.fsweb.s18d4.entity.Account;
import com.workintech.fsweb.s18d4.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workintech/account")
public class AccountController {
    private IAccountService accountService;
    @Autowired
    public AccountController(IAccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/")
    public List<AccountResponse> findAll(){
        return accountService.findAll();
    }
    @PostMapping("/")
    public AccountResponse save(@RequestBody Account account){
        return accountService.save(account);
    }
}
