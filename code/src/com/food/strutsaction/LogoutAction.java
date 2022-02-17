/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.food.strutsaction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.food.util.UtilConstants;

/**
 * MyEclipse Struts Creation date: 09-21-2012
 * 
 * XDoclet definition:
 * 
 * @struts.action validate="true"
 * @struts.action-forward name="success" path="/HomePage.jsp"
 */
public class LogoutAction extends Action {
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
		session.setAttribute("userid", null);
		session.setAttribute("role", null);
		session.setAttribute("loginid", null);
		session.setAttribute("cityid", null);
		session.setAttribute("loginname", null);
		request.setAttribute("status", "logged out successfully.....");
		session.invalidate();
		return mapping.findForward(UtilConstants._SUCCESS);
	}
}