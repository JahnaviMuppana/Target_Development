package com.cab.allocation.service;

import java.util.List;

import com.cab.allocation.dao.model.Cab;
import com.cab.allocation.model.CustomException;

public interface CabService {
	
	public void saveCabs(List<Cab> cabsList) throws CustomException;

}
