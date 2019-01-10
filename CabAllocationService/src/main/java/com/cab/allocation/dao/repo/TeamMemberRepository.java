package com.cab.allocation.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cab.allocation.dao.model.TeamMember;

public interface TeamMemberRepository extends JpaRepository<TeamMember, String>{

}
