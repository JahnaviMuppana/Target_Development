package com.cab.allocation.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cab.allocation.dao.mapper.Cab;

public interface CabRepository extends JpaRepository<Cab, String>{

}
