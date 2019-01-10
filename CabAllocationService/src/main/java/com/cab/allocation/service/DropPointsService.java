package com.cab.allocation.service;

import java.util.List;

import com.cab.allocation.dao.model.DropPoints;
import com.cab.allocation.model.CustomException;

public interface DropPointsService {
	
	public void saveDropPoints(List<DropPoints> dropPoints) throws CustomException;
	
	public boolean validateDropPoint(String dropPointName) throws CustomException;

}
