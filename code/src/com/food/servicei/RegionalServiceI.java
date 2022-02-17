package com.food.servicei;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Vector;

import com.food.exception.ConnectionException;
import com.food.exception.DataNotFoundException;
import com.food.pojo.City;
import com.food.pojo.District;
import com.food.pojo.State;

public interface RegionalServiceI {
	public Vector<State> viewStates() throws ConnectionException,
			DataNotFoundException;

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

	public Vector<District> viewDistrict(int stateid)
			throws ConnectionException, DataNotFoundException;

	public District viewDistrictUpdate(int districtid)
			throws ConnectionException, DataNotFoundException;

	public boolean updateDistrict(District district)
			throws ConnectionException, DataNotFoundException;

	public boolean deleteDistricts(int districtid) throws ConnectionException,
			DataNotFoundException;

	public boolean addCity(City city) throws ConnectionException,
			DataNotFoundException, FileNotFoundException, IOException;

	public Vector<City> viewCities(int stateid, int cityid, String path)
			throws ConnectionException, DataNotFoundException, SQLException,
			FileNotFoundException, IOException;

	public boolean deleteCities(int cityid) throws ConnectionException,
			DataNotFoundException;

	public City viewCityUpdate(int cityid, String path)
			throws ConnectionException, DataNotFoundException,
			FileNotFoundException, SQLException, IOException;

	public boolean updateCity(City city) throws ConnectionException,
			DataNotFoundException;
}
