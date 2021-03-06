/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.food.strutsaction;

import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.food.delegate.GeneralDelegate;
import com.food.delegate.FoodDelegate;
import com.food.exception.ConnectionException;
import com.food.pojo.TipsSuggestions;
import com.food.pojo.Restaurant;
import com.food.util.UtilConstants;

/**
 * MyEclipse Struts Creation date: 09-26-2012
 * 
 * XDoclet definition:
 * 
 * @struts.action validate="true"
 * @struts.action-forward name="failure" path="/Status.jsp"
 * @struts.action-forward name="success" path="/ViewWaterSupplyTimeings.jsp"
 */
public class ViewCityRestaurantTimingsAction extends Action {
	/*
	 * Generated Methods
	 */

	/**
	 * Method execute
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		Vector<Restaurant> wSupplies = null;
		try {
			wSupplies = new FoodDelegate().viewRestaurantDetails(Integer
					.parseInt((String) session.getAttribute("cityid")), request
					.getRealPath("./images"));
			if (!wSupplies.equals("")) {
				request.setAttribute("wSupplies", wSupplies);
				return mapping.findForward(UtilConstants._SUCCESS);
			} else {
				request.setAttribute(UtilConstants._STATUS,
						UtilConstants._VIEW_FOOD_FUPPLY_FAILED);
				return mapping.findForward(UtilConstants._FAILURE);
			}
		} catch (ConnectionException e) {
			request.setAttribute(UtilConstants._STATUS, e.getMessage());
			return mapping.findForward(UtilConstants._FAILURE);
		} catch (Exception e) {
			System.out.println(e);
			request.setAttribute(UtilConstants._STATUS,
					UtilConstants._VIEW_FOOD_FUPPLY_FAILED);
			return mapping.findForward(UtilConstants._FAILURE);
		}
	}
}
