package com.food.daoi;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Vector;

import com.food.exception.ConnectionException;
import com.food.exception.DataNotFoundException;
import com.food.pojo.FoodInfoPojo;
import com.food.pojo.Restaurant;

public interface FoodDAOI {
	public boolean addRestaurentDetails(Restaurant restaurant)
			throws ConnectionException, DataNotFoundException;

	public List viewRestaurantDetails(int cityid) throws ConnectionException,
			DataNotFoundException;

	public boolean deleteRestaurantRecord(int supplyid)
			throws ConnectionException, DataNotFoundException;

	public Restaurant viewRestaurantUpdate(int supplyid)
			throws ConnectionException, DataNotFoundException;

	public boolean updateRestaurant(Restaurant restaurant)
			throws ConnectionException, DataNotFoundException;

	public boolean addFoodInforamtion(FoodInfoPojo foodInfoPojo)
			throws ConnectionException, DataNotFoundException,
			FileNotFoundException;

	public List viewFoodInformation(int cityid, String water)
			throws ConnectionException, DataNotFoundException;

	public boolean deleteFoodInformation(int id) throws ConnectionException,
			DataNotFoundException;

}
