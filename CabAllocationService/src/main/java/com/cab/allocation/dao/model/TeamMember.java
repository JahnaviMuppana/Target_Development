package com.cab.allocation.dao.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class TeamMember 
{
	@Id
	private String teamMemberId;
	
	private String gender;
	
	private String dropPoint;
	
	public TeamMember() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TeamMember(String teamMemberId, String gender, String dropPoint) {
		super();
		this.teamMemberId = teamMemberId;
		this.gender = gender;
		this.dropPoint = dropPoint;
	}

	public String getTeamMemberId() {
		return teamMemberId;
	}

	public void setTeamMemberId(String teamMemberId) {
		this.teamMemberId = teamMemberId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDropPoint() {
		return dropPoint;
	}

	public void setDropPoint(String dropPoint) {
		this.dropPoint = dropPoint;
	}

	
}
