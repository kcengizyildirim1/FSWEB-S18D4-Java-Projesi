package com.workintech.fsweb.s18d4.dao;

import com.workintech.fsweb.s18d4.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer, Long> {
}
