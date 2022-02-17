package com.food.pojo;

// default package

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.beanutils.BeanUtils;

import com.food.formbean.RegionalFormBean;

/**
 * City entity. @author MyEclipse Persistence Tools
 */

public class City implements java.io.Serializable {

	// Fields

	private int cityid;
	private int stateid;
	private int districtid;
	private String cityname;
	private String citydescription;
	private Blob citymap;
	private String imagepath;
	private byte[] file;
	// Constructors

	/** default constructor */
	public City() {
	}

	public City(RegionalFormBean regionalFormBean) {
		Map map;
		try {
			map = BeanUtils.describe(regionalFormBean);
			BeanUtils.populate(this, map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

	}

	public int getCityid() {
		return cityid;
	}

	public void setCityid(int cityid) {
		this.cityid = cityid;
	}

	public int getStateid() {
		return stateid;
	}

	public void setStateid(int stateid) {
		this.stateid = stateid;
	}

	public int getDistrictid() {
		return districtid;
	}

	public void setDistrictid(int districtid) {
		this.districtid = districtid;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public String getCitydescription() {
		return citydescription;
	}

	public void setCitydescription(String citydescription) {
		this.citydescription = citydescription;
	}

	public Blob getCitymap() {
		return citymap;
	}

	public void setCitymap(Blob citymap) {
		this.citymap = citymap;
	}

	public String getImagepath() {
		return imagepath;
	}

	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	public byte[] toByteArray(Blob fromImageBlob) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			return toByteArrayImpl(fromImageBlob, baos);
		} catch (Exception e) {
		}
		return null;
	}

	private byte[] toByteArrayImpl(Blob fromImageBlob,
			ByteArrayOutputStream baos) throws SQLException, IOException {
		byte buf[] = new byte[400000];
		int dataSize;
		InputStream is = fromImageBlob.getBinaryStream();

		try {
			while ((dataSize = is.read(buf)) != -1) {
				baos.write(buf, 0, dataSize);
			}
		} finally {
			if (is != null) {
				is.close();
			}
		}
		return baos.toByteArray();
	}
	// Property accessors

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}


}