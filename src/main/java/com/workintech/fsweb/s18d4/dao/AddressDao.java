package com.workintech.fsweb.s18d4.dao;

import com.workintech.fsweb.s18d4.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressDao extends JpaRepository<Address, Long> {
}
