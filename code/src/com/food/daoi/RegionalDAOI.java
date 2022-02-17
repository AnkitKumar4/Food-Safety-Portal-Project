/**
 * 
 */
package com.food.daoi;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import com.food.exception.ConnectionException;
import com.food.exception.DataNotFoundException;
import com.food.pojo.City;
import com.food.pojo.District;
import com.food.pojo.State;

/**
 * @author JAVAPROJECTS
 * 
 */
public interface RegionalDAOI {
	public List viewStates() throws ConnectionException, DataNotFoundException;

	public boolean addState(State state) throws ConnectionException,
			DataNotFoundException;

	public State viewState(State state) throws ConnectionException,
			DataNotFoundException;

	public boolean updateState(State state) throws ConnectionException,
			DataNotFoundException;

	public boolean deleteStates(int stateid) throws ConnectionException,
			DataNotFoundException;

	public boolean addDistrict(District district) throws ConnectionException,
			DataNotFoundException;

	public List viewDistrict(int stateid) throws ConnectionException,
			DataNotFoundException;

	public District viewDistrictUpdate(int districtid)
			throws ConnectionException, DataNotFoundException;

	public boolean updateDistrict(District district)
			throws ConnectionException, DataNotFoundException;

	public boolean deleteDistricts(int districtid) throws ConnectionException,
			DataNotFoundException;

	public boolean addCity(City city) throws ConnectionException,
			DataNotFoundException, FileNotFoundException, IOException;

	public List viewCities(int stateid, int cityid) throws ConnectionException,
			DataNotFoundException;

	public boolean deleteCities(int cityid) throws ConnectionException,
			DataNotFoundException;

	public City viewCityUpdate(int cityid) throws ConnectionException,
			DataNotFoundException, FileNotFoundException, SQLException,
			IOException;

	public boolean updateCity(City city) throws ConnectionException,
			DataNotFoundException;
}
