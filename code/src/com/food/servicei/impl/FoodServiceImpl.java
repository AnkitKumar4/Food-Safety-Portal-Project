package com.food.servicei.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Blob;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.hibernate.Hibernate;

import com.food.daoi.FoodDAOI;
import com.food.daoi.impl.FoodDAOImpl;
import com.food.exception.ConnectionException;
import com.food.exception.DataNotFoundException;
import com.food.pojo.Education;
import com.food.pojo.TipsSuggestions;
import com.food.pojo.FoodInfoPojo;
import com.food.pojo.Restaurant;
import com.food.servicei.FoodServiceI;

public class FoodServiceImpl implements FoodServiceI {
	FoodDAOI foodDAOI = new FoodDAOImpl();

	public boolean addRestaurentDetails(Restaurant restaurant)
			throws ConnectionException, DataNotFoundException, IOException {
	String[] extension = restaurant.getMenupath().split("\\.");
	for (int i = 0; i < extension.length; i++) {
			System.out.println(extension[i]);
			if (extension[i].equals("txt") || extension[i].equals("doc")
					|| extension[i].equals("ppt") || extension[i].equals("gif")
					|| extension[i].equals("mp4")
					|| extension[i].equals("jpeg")
					|| extension[i].equals("jpg") || extension[i].equals("pdf"))
				restaurant.setFiletype(extension[i]);
		}
		File file = new File(restaurant.getMenupath());
		byte[] byteFileArray = new byte[(int) file.length()];
		FileInputStream fin = new FileInputStream(file);
		fin.read(byteFileArray);
		fin.close();
		restaurant.setFile(byteFileArray);
		return foodDAOI.addRestaurentDetails(restaurant);
	}

	public Vector<Restaurant> viewRestaurantDetails(int cityid, String path)
			throws ConnectionException, DataNotFoundException {
		Vector<Restaurant> vRestaurants = new Vector<Restaurant>();
		Restaurant restaurant = null;
		List list = foodDAOI.viewRestaurantDetails(cityid);
		for (Iterator it = list.iterator(); it.hasNext();) {
			String realpath = "";
			restaurant = (Restaurant) it.next();
			Blob b;
			try {
				b = restaurant.getMenu();
				byte b1[] = b.getBytes(1, (int) b.length());
				realpath = path + "\\" + restaurant.getRestarantid() + "."
						+ restaurant.getFiletype();
				OutputStream fout = new FileOutputStream(realpath);
				fout.write(b1);
			} catch (Exception e) {
				realpath = path + "\\" + restaurant.getRestarantid() + "."
						+ restaurant.getFiletype();
			}
			restaurant.setMenupath(realpath);
			vRestaurants.add(restaurant);
		}
		return vRestaurants;
	}

	public boolean deleteRestaurantRecord(int supplyid)
			throws ConnectionException, DataNotFoundException {
		return foodDAOI.deleteRestaurantRecord(supplyid);
	}

	public Restaurant viewReataurantUpdate(int supplyid, String path)
			throws ConnectionException, DataNotFoundException {
		Restaurant restaurant = foodDAOI.viewRestaurantUpdate(supplyid);
		Blob b;
		String realpath = "";
		try {

			b = restaurant.getMenu();
			byte b1[] = b.getBytes(1, (int) b.length());
			realpath = path + "\\" + restaurant.getRestarantid() + "."
					+ restaurant.getFiletype();
			OutputStream fout = new FileOutputStream(realpath);
			fout.write(b1);
		} catch (Exception e) {
			realpath = path + "\\" + restaurant.getRestarantid() + "."
					+ restaurant.getFiletype();
		}
		restaurant.setMenupath(realpath);
		return restaurant;
	}

	public boolean updateRestaurant(Restaurant restaurant)
			throws ConnectionException, DataNotFoundException, IOException {
		String[] extension = restaurant.getMenupath().split("\\.");
		for (int i = 0; i < extension.length; i++) {
			System.out.println(extension[i]);
			if (extension[i].equals("txt") || extension[i].equals("doc")
					|| extension[i].equals("ppt") || extension[i].equals("gif")
					|| extension[i].equals("mp4")
					|| extension[i].equals("jpeg")
					|| extension[i].equals("jpg") || extension[i].equals("pdf"))
				restaurant.setFiletype(extension[i]);
		}
		File file = new File(restaurant.getMenupath());
		byte[] byteFileArray = new byte[(int) file.length()];
		FileInputStream fin = new FileInputStream(file);
		fin.read(byteFileArray);
		fin.close();
		restaurant.setFile(byteFileArray);
		return foodDAOI.updateRestaurant(restaurant);

	}

	public boolean addFoodInforamtion(FoodInfoPojo foodInfoPojo)
			throws ConnectionException, DataNotFoundException,
			FileNotFoundException {

		String[] extension = foodInfoPojo.getFilepath().split("\\.");
		int i;
		for (i = 0; i < extension.length; i++) {
			System.out.println(extension[i]);
			if (extension[i].equals("txt") || extension[i].equals("doc")
					|| extension[i].equals("docx")
					|| extension[i].equals("ppt") || extension[i].equals("gif")
					|| extension[i].equals("mp4")
					|| extension[i].equals("jpeg")
					|| extension[i].equals("jpg") || extension[i].equals("pdf"))
				foodInfoPojo.setFiletype(extension[i]);
		}
		File file = new File(foodInfoPojo.getFilepath());
		byte[] byteArray = new byte[(int) file.length()];
		Blob blob = Hibernate.createBlob(byteArray);
		foodInfoPojo.setFile(blob);
		return foodDAOI.addFoodInforamtion(foodInfoPojo);
	}

	public Vector<FoodInfoPojo> viewFoodInformation(int cityid, String water,
			String path) throws ConnectionException, DataNotFoundException {
		FoodInfoPojo foodInfoPojo;
		Vector<FoodInfoPojo> vWaterInfoPojos = new Vector<FoodInfoPojo>();
		List list = foodDAOI.viewFoodInformation(cityid, water);
		for (Iterator it = list.iterator(); it.hasNext();) {
			String realpath = "";
			foodInfoPojo = (FoodInfoPojo) it.next();
			Blob b;
			try {
				b = foodInfoPojo.getFile();
				byte b1[] = b.getBytes(1, (int) b.length());
				realpath = path + "\\" + foodInfoPojo.getId() + "."
						+ foodInfoPojo.getFiletype();
				OutputStream fout = new FileOutputStream(realpath);
				fout.write(b1);
			} catch (Exception e) {
				realpath = path + "\\" + foodInfoPojo.getId() + "."
						+ foodInfoPojo.getFiletype();
			}
			foodInfoPojo.setFilepath(realpath);
			vWaterInfoPojos.add(foodInfoPojo);
		}
		return vWaterInfoPojos;

	}

	public boolean deleteFoodInformation(int id) throws ConnectionException,
			DataNotFoundException {
		return foodDAOI.deleteFoodInformation(id);
	}
}
