/**
 * 
 */
package com.food.servicei.impl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import com.food.daoi.RegionalDAOI;
import com.food.daoi.impl.RegionalDAOImpl;
import com.food.exception.ConnectionException;
import com.food.exception.DataNotFoundException;
import com.food.pojo.City;
import com.food.pojo.District;
import com.food.pojo.State;
import com.food.servicei.RegionalServiceI;

/**
 * @author JAVAPROJECTS
 * 
 */
public class RegionalServiceImpl implements RegionalServiceI {

	RegionalDAOI regionalDAOI = new RegionalDAOImpl();

	public Vector<State> viewStates() throws ConnectionException,
			DataNotFoundException {
		State statesPojo = null;
		Vector<State> vStatesPojos = new Vector<State>();
		List list = regionalDAOI.viewStates();
		for (Iterator it = list.iterator(); it.hasNext();) {
			statesPojo = (State) it.next();
			vStatesPojos.add(statesPojo);
		}

		return vStatesPojos;
	}

	public boolean addState(State state) throws ConnectionException,
			DataNotFoundException {
		return regionalDAOI.addState(state);
	}

	public State viewState(State state) throws ConnectionException,
			DataNotFoundException {
		return regionalDAOI.viewState(state);
	}

	public boolean updateState(State state) throws ConnectionException,
			DataNotFoundException {
		return regionalDAOI.updateState(state);
	}

	public boolean deleteStates(int stateid) throws ConnectionException,
			DataNotFoundException {
		return regionalDAOI.deleteStates(stateid);
	}

	public boolean addDistrict(District district) throws ConnectionException,
			DataNotFoundException {
		return regionalDAOI.addDistrict(district);
	}

	public Vector<District> viewDistrict(int stateid)
			throws ConnectionException, DataNotFoundException {
		District district = null;
		Vector<District> vDistricts = new Vector<District>();
		List list = regionalDAOI.viewDistrict(stateid);
		for (Iterator it = list.iterator(); it.hasNext();) {
			district = (District) it.next();
			vDistricts.add(district);
		}
		return vDistricts;
	}

	public District viewDistrictUpdate(int districtid)
			throws ConnectionException, DataNotFoundException {
		return regionalDAOI.viewDistrictUpdate(districtid);
	}

	public boolean updateDistrict(District district)
			throws ConnectionException, DataNotFoundException {
		return regionalDAOI.updateDistrict(district);
	}

	public boolean deleteDistricts(int districtid) throws ConnectionException,
			DataNotFoundException {
		return regionalDAOI.deleteDistricts(districtid);
	}

	public boolean addCity(City city) throws ConnectionException,
			DataNotFoundException, FileNotFoundException, IOException {
		return regionalDAOI.addCity(city);
	}

	public Vector<City> viewCities(int stateid, int cityid, String path)
			throws ConnectionException, DataNotFoundException, SQLException,
			IOException {
		City city = null;
		Vector<City> vCities = new Vector<City>();
		List list = regionalDAOI.viewCities(stateid, cityid);
		for (Iterator it = list.iterator(); it.hasNext();) {
			String realpath = "";
			city = (City) it.next();
			try {
				realpath = path + "\\" + city.getCityid() + ".jpg";
				FileOutputStream fileOutputStream = new FileOutputStream(realpath);
				fileOutputStream.write(city.toByteArray(city.getCitymap()));
				city.setImagepath(realpath);
				System.out.println(realpath);
			} catch (Exception e) {
				System.out.println(e);
				realpath = path + "\\" + city.getCityid() + ".jpg";
				city.setImagepath(realpath);
			}
		vCities.add(city);
		}
		return vCities;
	}

	public boolean deleteCities(int cityid) throws ConnectionException,
			DataNotFoundException {
		return regionalDAOI.deleteCities(cityid);
	}

	public City viewCityUpdate(int cityid, String path)
			throws ConnectionException, DataNotFoundException,
			FileNotFoundException, SQLException, IOException {

		String realpath = "";
		City city = regionalDAOI.viewCityUpdate(cityid);
		try {
			Blob b = city.getCitymap();
			byte b1[] = b.getBytes(1, (int) b.length());
			realpath = path + "\\" + city.getCityid() + ".jpg";
			System.out.println("realpath---->:" + realpath);
			OutputStream fout = new FileOutputStream(realpath);
			fout.write(b1);
		} catch (Exception e) {
			realpath = path + "\\" + city.getCityid() + ".jpg";
		}
		city.setImagepath(realpath);
		System.out.println(city.getCitydescription());
		System.out.println("MAPPPPPPPPPP------>>>>>>" + city.getImagepath());
		return city;
	}

	public boolean updateCity(City city) throws ConnectionException,
			DataNotFoundException {
		return regionalDAOI.updateCity(city);
	}
}
