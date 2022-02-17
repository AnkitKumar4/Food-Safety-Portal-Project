/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.food.strutsaction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.food.delegate.GeneralDelegate;
import com.food.delegate.FoodDelegate;
import com.food.exception.ConnectionException;
import com.food.util.UtilConstants;

/**
 * MyEclipse Struts Creation date: 09-26-2012
 * 
 * XDoclet definition:
 * 
 * @struts.action validate="true"
 * @struts.action-forward name="success" path="/Status.jsp"
 */
public class DeleteRestaurantInfoAction extends Action {
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
		String ch[] = request.getParameterValues("ch");
		boolean flag = false;
		try {
			for (int i = 0; i < ch.length; i++) {
				System.out.println(ch[i]);
				flag = new FoodDelegate().deleteRestaurantRecord(Integer
						.parseInt(ch[i]));
			}
			if (flag) {
				request.setAttribute(UtilConstants._STATUS,
						UtilConstants._DELETE_FOOD_SUPPLY_SUCCESS);
				return mapping.findForward(UtilConstants._SUCCESS);
			} else {
				request.setAttribute(UtilConstants._STATUS,
						UtilConstants._DELETE_FOOD_CUPPLY_FAILURE);
				return mapping.findForward(UtilConstants._SUCCESS);

			}
		} catch (ConnectionException e) {
			request.setAttribute(UtilConstants._STATUS, e.getMessage());
			return mapping.findForward(UtilConstants._SUCCESS);
		} catch (Exception e) {
			request.setAttribute(UtilConstants._STATUS,
					UtilConstants._DELETE_FOOD_CUPPLY_FAILURE);
			return mapping.findForward(UtilConstants._SUCCESS);
		}
	}
}