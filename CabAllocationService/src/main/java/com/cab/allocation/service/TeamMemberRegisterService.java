package com.cab.allocation.service;

import java.util.List;

import com.cab.allocation.dao.model.TeamMember;
import com.cab.allocation.model.CustomException;

public interface TeamMemberRegisterService {
	
	public void saveTeamMember(TeamMember teamMember) throws CustomException;
	
	public List<TeamMember> fetchAllTeamMembers();

}
