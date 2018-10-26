package com.cab.allocation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cab.allocation.dao.mapper.Cab;
import com.cab.allocation.dao.repo.CabRepository;
import com.cab.allocation.model.CustomException;

@Component
public class CabServiceImpl implements CabService{
	
	@Autowired
	private CabRepository cabRepository;
	
	public void saveCabs(List<Cab> cabsList) throws CustomException
	{
		try
		{
			cabRepository.saveAll(cabsList);
		}
		catch(Exception ex)
		{
			throw new CustomException(ex.getMessage());
		}
	}

}
