package com.workintech.fsweb.s18d4.dto;

import com.workintech.fsweb.s18d4.entity.Customer;

public record AccountResponse(Long id, String accountName, double moneyAmount) {
}
