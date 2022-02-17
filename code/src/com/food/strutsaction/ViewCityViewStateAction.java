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

import com.food.delegate.RegionalInfoDelegate;
import com.food.exception.ConnectionException;
import com.food.pojo.State;
import com.food.util.UtilConstants;

/**
 * MyEclipse Struts Creation date: 09-18-2012
 * 
 * XDoclet definition:
 * 
 * @struts.action validate="true"
 * @struts.action-forward name="failure" path="/ViewCities.jsp"
 * @struts.action-forward name="success" path="/ViewCities.jsp"
 */
public class ViewCityViewStateAction extends Action {
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
		Vector<State> vStates = null;
		HttpSession session = request.getSession();
		try {
			vStates = new RegionalInfoDelegate().viewStates();
			session.setAttribute("vStates", vStates);
			return mapping.findForward(UtilConstants._SUCCESS);
		} catch (ConnectionException e) {
			request.setAttribute(UtilConstants._STATUS, e.getMessage());
			return mapping.findForward(UtilConstants._FAILURE);
		} catch (Exception e) {
			request.setAttribute(UtilConstants._STATUS,
					UtilConstants._VIEW_STATE_FAILURE);
			return mapping.findForward(UtilConstants._FAILURE);
		}

	}
}