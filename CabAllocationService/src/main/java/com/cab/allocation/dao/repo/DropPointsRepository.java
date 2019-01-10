package com.cab.allocation.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cab.allocation.dao.model.DropPoints;

public interface DropPointsRepository extends JpaRepository<DropPoints, String> {

}
