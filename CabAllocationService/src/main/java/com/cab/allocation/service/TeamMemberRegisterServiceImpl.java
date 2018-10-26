package com.cab.allocation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cab.allocation.dao.mapper.TeamMember;
import com.cab.allocation.dao.repo.TeamMemberRepository;
import com.cab.allocation.model.CustomException;

@Component
public class TeamMemberRegisterServiceImpl implements TeamMemberRegisterService {

	@Autowired
	private TeamMemberRepository teamMemberRepository;
	
	public void saveTeamMember(TeamMember teamMember) throws CustomException
	{
		try
		{
			teamMemberRepository.save(teamMember);
		}
		catch(Exception ex)
		{
			throw new CustomException("Error while registering Team Member");
		}
	}
	
	public List<TeamMember> fetchAllTeamMembers()
	{
		return teamMemberRepository.findAll();
	}
}
