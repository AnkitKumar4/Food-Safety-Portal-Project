package com.food.servicei;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;

import com.food.exception.ConnectionException;
import com.food.exception.DataNotFoundException;
import com.food.pojo.FoodInfoPojo;
import com.food.pojo.Restaurant;

public interface FoodServiceI {
	public boolean addRestaurentDetails(Restaurant restaurant)
			throws ConnectionException, DataNotFoundException, FileNotFoundException, IOException;

	public Vector<Restaurant> viewRestaurantDetails(int cityid, String path)
			throws ConnectionException, DataNotFoundException;

	public boolean deleteRestaurantRecord(int supplyid)
			throws ConnectionException, DataNotFoundException;

	public Restaurant viewReataurantUpdate(int supplyid,String path)
			throws ConnectionException, DataNotFoundException;

	public boolean updateRestaurant(Restaurant restaurant)
			throws ConnectionException, DataNotFoundException, FileNotFoundException, IOException;

	public boolean addFoodInforamtion(FoodInfoPojo foodInfoPojo)
			throws ConnectionException, DataNotFoundException,
			FileNotFoundException;

	public Vector<FoodInfoPojo> viewFoodInformation(int cityid, String water,
			String path) throws ConnectionException, DataNotFoundException;

	public boolean deleteFoodInformation(int id) throws ConnectionException,
			DataNotFoundException;
}
