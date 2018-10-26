package com.cab.allocation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cab.allocation.dao.mapper.DropPoints;
import com.cab.allocation.dao.repo.DropPointsRepository;
import com.cab.allocation.model.CustomException;

@Component
public class DropPointsServiceImpl implements DropPointsService {

	@Autowired
	private DropPointsRepository dropPointsRepository;
	
	public void saveDropPoints(List<DropPoints> dropPoints) throws CustomException
	{
		try
		{
			dropPointsRepository.deleteAll();
			dropPointsRepository.saveAll(dropPoints);
		}
		catch(Exception ex)
		{
			throw new CustomException("Error while saving dropPoints");
		}
	}
	
	public boolean validateDropPoint(String dropPointName) throws CustomException
	{
		return dropPointsRepository.existsById(dropPointName);
	}
}
