package com.food.pojo;

import java.lang.reflect.InvocationTargetException;
import java.sql.Blob;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import com.food.formbean.RegionalFormBean;
import com.food.formbean.FoodFormBean;

public class Restaurant {

	private String supplypattrn;
	private String contactaddresses;
	private int cityidref;

	private String restaurantname;
	private String certification;
	private String restauranttype;
	private String opentime;
	private String closetime;
	private Blob menu;
	private byte[] file;
	private String menupath;
	private String filetype;
	private int restarantid;
	
	public Restaurant() {
	}

	public Restaurant(FoodFormBean foodFormBean) {
		Map map;
		try {
			map = BeanUtils.describe(foodFormBean);
			BeanUtils.populate(this, map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

	}

	public String getSupplypattrn() {
		return supplypattrn;
	}

	public void setSupplypattrn(String supplypattrn) {
		this.supplypattrn = supplypattrn;
	}

	public String getContactaddresses() {
		return contactaddresses;
	}

	public void setContactaddresses(String contactaddresses) {
		this.contactaddresses = contactaddresses;
	}

	public int getCityidref() {
		return cityidref;
	}

	public void setCityidref(int cityidref) {
		this.cityidref = cityidref;
	}

	public String getRestaurantname() {
		return restaurantname;
	}

	public void setRestaurantname(String restaurantname) {
		this.restaurantname = restaurantname;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public String getRestauranttype() {
		return restauranttype;
	}

	public void setRestauranttype(String restauranttype) {
		this.restauranttype = restauranttype;
	}

	public String getOpentime() {
		return opentime;
	}

	public void setOpentime(String opentime) {
		this.opentime = opentime;
	}

	public String getClosetime() {
		return closetime;
	}

	public void setClosetime(String closetime) {
		this.closetime = closetime;
	}

	public int getRestarantid() {
		return restarantid;
	}

	public void setRestarantid(int restarantid) {
		this.restarantid = restarantid;
	}

	public String getMenupath() {
		return menupath;
	}

	public void setMenupath(String menupath) {
		this.menupath = menupath;
	}

	public void setMenu(Blob menu) {
		this.menu = menu;
	}

	public String getFiletype() {
		return filetype;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	public Blob getMenu() {
		return menu;
	}

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}
}
