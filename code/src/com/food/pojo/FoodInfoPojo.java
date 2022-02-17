package com.food.pojo;

import java.lang.reflect.InvocationTargetException;
import java.sql.Blob;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import com.food.formbean.RegionalFormBean;
import com.food.formbean.FoodFormBean;

public class FoodInfoPojo implements java.io.Serializable {

	private int id;
	private int cityid;
	private String header;
	private String information;
	private String filepath;
	private String filetype;
	private Blob file;
	private String url;
	private String food;

	public FoodInfoPojo() {
	}

	public FoodInfoPojo(FoodFormBean foodFormBean) {
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

	public Blob getFile() {
		return file;
	}

	public void setFile(Blob file) {
		this.file = file;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}



}
