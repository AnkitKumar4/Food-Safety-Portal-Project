package com.food.formbean;

import java.sql.Blob;

import org.apache.struts.action.ActionForm;

public class FoodFormBean extends ActionForm {

	private String restaurantname;
	private String certification;
	private String restauranttype;
	private String opentime;
	private String closetime;
	private Blob menu;
	private String menupath;
	private String supplypattrn;
	private String contactaddresses;
	private int cityidref;
	private int restaurantid;
	

	private int id;
	private int cityid;
	private String header;
	private String information;
	private String filepath;
	private String filetype;
	private String food;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCityid() {
		return cityid;
	}

	public void setCityid(int cityid) {
		this.cityid = cityid;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public String getFiletype() {
		return filetype;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	private String url;

	

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

	

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
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

	public Blob getMenu() {
		return menu;
	}

	public void setMenu(Blob menu) {
		this.menu = menu;
	}

	public int getRestaurantid() {
		return restaurantid;
	}

	public void setRestaurantid(int restaurantid) {
		this.restaurantid = restaurantid;
	}

	public String getMenupath() {
		return menupath;
	}

	public void setMenupath(String menupath) {
		this.menupath = menupath;
	}

}
