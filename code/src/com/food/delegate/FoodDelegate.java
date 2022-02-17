package com.food.delegate;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;

import com.food.exception.ConnectionException;
import com.food.exception.DataNotFoundException;
import com.food.pojo.TipsSuggestions;
import com.food.pojo.FoodInfoPojo;
import com.food.pojo.Restaurant;
import com.food.servicei.GeneralServiceI;
import com.food.servicei.FoodServiceI;
import com.food.servicei.impl.GeneralServiceImpl;
import com.food.servicei.impl.FoodServiceImpl;

public class FoodDelegate {
	FoodServiceI foodServiceI = new FoodServiceImpl();

	public boolean addRestaurentDetails(Restaurant restaurant)
			throws ConnectionException, DataNotFoundException, FileNotFoundException, IOException {
		return foodServiceI.addRestaurentDetails(restaurant);
	}

	public Vector<Restaurant> viewRestaurantDetails(int cityid, String path)
			throws ConnectionException, DataNotFoundException {
		return foodServiceI.viewRestaurantDetails(cityid,path);
	}

	public boolean deleteRestaurantRecord(int supplyid)
			throws ConnectionException, DataNotFoundException {
		return foodServiceI.deleteRestaurantRecord(supplyid);
	}

	public Restaurant viewRestaurantUpdate(int supplyid,String path)
			throws ConnectionException, DataNotFoundException {
		return foodServiceI.viewReataurantUpdate(supplyid,path);
	}

	public boolean updateRestaurant(Restaurant restaurant)
			throws ConnectionException, DataNotFoundException, FileNotFoundException, IOException {
		return foodServiceI.updateRestaurant(restaurant);
	}

	public boolean addFoodInforamtion(FoodInfoPojo foodInfoPojo)
			throws ConnectionException, DataNotFoundException,
			FileNotFoundException {
		return foodServiceI.addFoodInforamtion(foodInfoPojo);
	}

	public Vector<FoodInfoPojo> viewFoodInformation(int cityid, String water,
			String path) throws ConnectionException, DataNotFoundException {
		return foodServiceI.viewFoodInformation(cityid, water, path);
	}

	public boolean deleteFoodInformation(int id)
			throws ConnectionException, DataNotFoundException {
		return foodServiceI.deleteFoodInformation(id);
	}

}
