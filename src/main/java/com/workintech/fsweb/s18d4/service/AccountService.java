package com.workintech.fsweb.s18d4.service;

import com.workintech.fsweb.s18d4.converter.DtoConverter;
import com.workintech.fsweb.s18d4.dao.AccountDao;
import com.workintech.fsweb.s18d4.dto.AccountResponse;
import com.workintech.fsweb.s18d4.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService implements IAccountService{
    private AccountDao accountDao;
    @Autowired
    public AccountService(AccountDao accountDao) {
        this.accountDao = accountDao;
    }


    @Override
    public List<AccountResponse> findAll() {
        return DtoConverter.convertToAccountResponseList(accountDao.findAll());
    }

    @Override
    public AccountResponse findById(Long id) {
        Optional<Account> optionalAccount = accountDao.findById(id);
        if(optionalAccount.isPresent()){
            return DtoConverter.convertToAccountResponse(optionalAccount.get());
        }
        //Exception handler
        return null;
    }

    @Override
    public AccountResponse save(Account account) {
        return DtoConverter.convertToAccountResponse(accountDao.save(account));
    }

    @Override
    public AccountResponse delete(Long id) {
        AccountResponse accountResponse = findById(id);
        accountDao.deleteById(accountResponse.id());
        return accountResponse;
    }
}
