package com.pradiptoit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradiptoit.entities.Address;

public interface AddressRepo extends JpaRepository<Address,Integer> {

}
