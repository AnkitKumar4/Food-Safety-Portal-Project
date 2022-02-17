package com.food.daoi.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Blob;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.food.dao.BaseHibernateDAO;
import com.food.dao.HQLConstants;
import com.food.daoi.FoodDAOI;
import com.food.exception.ConnectionException;
import com.food.exception.DataNotFoundException;
import com.food.pojo.City;
import com.food.pojo.FoodInfoPojo;
import com.food.pojo.Restaurant;
import com.food.util.UtilConstants;
import com.sun.org.apache.xml.internal.security.utils.Base64;

public class FoodDAOImpl extends BaseHibernateDAO implements FoodDAOI {
	boolean flag = false;
	Session session = null;
	private static final Log log = LogFactory.getLog(RegionalDAOImpl.class);

	public boolean addRestaurentDetails(Restaurant restaurant)
			throws ConnectionException, DataNotFoundException {
		try {
			Session session = getSession();
			Transaction transaction = session.beginTransaction();
			Blob blob = Hibernate.createBlob(restaurant.getFile());
			restaurant.setMenu(blob);
			session.save(restaurant);
			transaction.commit();
			flag = true;
		} catch (RuntimeException re) {
			System.out.println(re);
			log.error("save failed", re);
			throw new ConnectionException(UtilConstants._TECH_PROBLEM);
		}
		return flag;
	}

	public List viewRestaurantDetails(int cityid) throws ConnectionException,
			DataNotFoundException {
		log.debug("getting Restaurant instance with id: " + cityid);
		System.out.println(cityid);
		List list;
		try {
			Query queryObject = getSession().createQuery(
					HQLConstants._FOOD_SUPPLY);
			queryObject.setInteger(0, cityid);
			list = queryObject.list();
		} catch (RuntimeException re) {
			System.err.println(re);
			log.error("find all failed", re);
			throw new ConnectionException(UtilConstants._TECH_PROBLEM);
		}
		return list;
	}

	public boolean deleteRestaurantRecord(int supplyid)
			throws ConnectionException, DataNotFoundException {
		log.debug("getting Restaurant instance with id: " + supplyid);
		try {
			Session session = getSession();
			Transaction transaction = session.beginTransaction();
			Restaurant instance = (Restaurant) session.get(Restaurant.class,
					supplyid);
			session.delete(instance);
			transaction.commit();
			flag = true;
			log.debug("delete successful");
			getSession().close();
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw new ConnectionException(UtilConstants._TECH_PROBLEM);
		}
		return flag;
	}

	public Restaurant viewRestaurantUpdate(int supplyid)
			throws ConnectionException, DataNotFoundException {
		log.debug("getting Restaurant instance with id: " + supplyid);
		Restaurant restaurant = null;
		try {
			Restaurant instance = (Restaurant) getSession().get(
					Restaurant.class, supplyid);
			return instance;
		} catch (RuntimeException re) {
			System.err.println(re);
			log.error("find all failed", re);
			throw new ConnectionException(UtilConstants._TECH_PROBLEM);
		}
	}

	public boolean updateRestaurant(Restaurant restaurant)
			throws ConnectionException, DataNotFoundException {
		log.debug("attaching dirty Restaurant instance");
		try {
			Session session = getSession();
			System.out.println(restaurant.getRestarantid());
			Transaction transaction = session.beginTransaction();
			Restaurant instance = (Restaurant) session.get(Restaurant.class,
					restaurant.getRestarantid());
			instance.setRestaurantname(restaurant.getRestaurantname());
			instance.setCertification(restaurant.getCertification());
			instance.setRestauranttype(restaurant.getRestauranttype());
			instance.setOpentime(restaurant.getOpentime());
			instance.setClosetime(restaurant.getClosetime());
			instance.setSupplypattrn(restaurant.getSupplypattrn());
			Blob blob = Hibernate.createBlob(restaurant.getFile());
			restaurant.setMenu(blob);
			instance.setContactaddresses(restaurant.getContactaddresses());
			session.update(instance);
			transaction.commit();
			log.debug("attach successful");
			flag = true;
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			System.out.println(re);
			throw re;
		}
		return flag;
	}

	public boolean addFoodInforamtion(FoodInfoPojo foodInfoPojo)
			throws ConnectionException, DataNotFoundException,
			FileNotFoundException {
		try {
			Session session = getSession();
			Transaction transaction = session.beginTransaction();
			session.save(foodInfoPojo);
			transaction.commit();
			flag = true;
		} catch (RuntimeException re) {
			System.out.println(re);
			log.error("save failed", re);
			throw new ConnectionException(UtilConstants._TECH_PROBLEM);
		}
		return flag;
	}

	public List viewFoodInformation(int cityid, String water)
			throws ConnectionException, DataNotFoundException {
		log.debug("getting WaterInfo instance with id: " + cityid);
		System.out.println(cityid);
		List list;
		try {
			Query queryObject = getSession().createQuery(
					HQLConstants._FOOD_INFORMATION);
			queryObject.setInteger(0, cityid);
			queryObject.setString(1, water);
			list = queryObject.list();
		} catch (RuntimeException re) {
			System.err.println(re);
			log.error("find all failed", re);
			throw new ConnectionException(UtilConstants._TECH_PROBLEM);
		}
		return list;
	}

	public boolean deleteFoodInformation(int id) throws ConnectionException,
			DataNotFoundException {
		log.debug("getting Restaurant instance with id: " + id);
		try {
			Session session = getSession();
			Transaction transaction = session.beginTransaction();
			FoodInfoPojo instance = (FoodInfoPojo) session.get(
					FoodInfoPojo.class, id);
			session.delete(instance);
			transaction.commit();
			flag = true;
			log.debug("delete successful");
			getSession().close();
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw new ConnectionException(UtilConstants._TECH_PROBLEM);
		}
		return flag;
	}
}
