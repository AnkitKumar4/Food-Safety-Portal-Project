package com.food.delegate;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Vector;

import com.food.exception.ConnectionException;
import com.food.exception.DataNotFoundException;
import com.food.pojo.City;
import com.food.pojo.District;
import com.food.pojo.State;
import com.food.servicei.RegionalServiceI;
import com.food.servicei.impl.RegionalServiceImpl;

public class RegionalInfoDelegate {
	RegionalServiceI regionalServiceI = new RegionalServiceImpl();

	public Vector<State> viewStates() throws ConnectionException,
			DataNotFoundException {
		return regionalServiceI.viewStates();
	}

	public boolean addState(State state) throws ConnectionException,
			DataNotFoundException {
		return regionalServiceI.addState(state);
	}

	public State viewState(State state) throws ConnectionException,
			DataNotFoundException {
		return regionalServiceI.viewState(state);
	}

	public boolean updateState(State state) throws ConnectionException,
			DataNotFoundException {
		return regionalServiceI.updateState(state);
	}

	public boolean deleteStates(int stateid) throws ConnectionException,
			DataNotFoundException {
		return regionalServiceI.deleteStates(stateid);
	}

	public boolean addDistrict(District district) throws ConnectionException,
			DataNotFoundException {
		return regionalServiceI.addDistrict(district);
	}

	public Vector<District> viewDistrict(int stateid)
			throws ConnectionException, DataNotFoundException {
		return regionalServiceI.viewDistrict(stateid);
	}

	public District viewDistrictUpdate(int districtid)
			throws ConnectionException, DataNotFoundException {
		return regionalServiceI.viewDistrictUpdate(districtid);
	}

	public boolean updateDistrict(District district)
			throws ConnectionException, DataNotFoundException {
		return regionalServiceI.updateDistrict(district);
	}

	public boolean deleteDistricts(int districtid) throws ConnectionException,
			DataNotFoundException {
		return regionalServiceI.deleteDistricts(districtid);
	}

	public boolean addCity(City city) throws ConnectionException,
			DataNotFoundException, FileNotFoundException, IOException {
		return regionalServiceI.addCity(city);
	}

	public Vector<City> viewCities(int stateid, int cityid, String path)
			throws ConnectionException, DataNotFoundException,
			FileNotFoundException, SQLException, IOException {
		return regionalServiceI.viewCities(stateid, cityid, path);
	}

	public boolean deleteCities(int cityid) throws ConnectionException,
			DataNotFoundException {
		return regionalServiceI.deleteCities(cityid);
	}

	public City viewCityUpdate(int cityid, String path)
			throws ConnectionException, DataNotFoundException,
			FileNotFoundException, SQLException, IOException {
		return regionalServiceI.viewCityUpdate(cityid, path);
	}

	public boolean updateCity(City city) throws ConnectionException,
			DataNotFoundException {
		return regionalServiceI.updateCity(city);
	}

}
