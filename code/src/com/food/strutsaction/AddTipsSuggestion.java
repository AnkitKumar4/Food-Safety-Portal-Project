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
import com.food.exception.ConnectionException;
import com.food.formbean.GeneralFormBean;
import com.food.pojo.TipsSuggestions;
import com.food.util.UtilConstants;

/**
 * MyEclipse Struts Creation date: 09-21-2012
 * 
 * XDoclet definition:
 * 
 * @struts.action validate="true"
 * @struts.action-forward name="success" path="/TipsSuggesstions.jsp"
 */
public class AddTipsSuggestion extends Action {
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
		GeneralFormBean generalFormBean = (GeneralFormBean) form;
		TipsSuggestions tipsSuggestions = new TipsSuggestions(generalFormBean);
		boolean flag = false;
		try {
			flag = new GeneralDelegate().addTipsSuggesition(tipsSuggestions);
			request.setAttribute(UtilConstants._STATUS,
					UtilConstants._TIPS_SUCCESS);
			return mapping.findForward(UtilConstants._SUCCESS);
		} catch (ConnectionException e) {
			request.setAttribute(UtilConstants._STATUS, e.getMessage());
			return mapping.findForward(UtilConstants._SUCCESS);
		} catch (Exception e) {
			request.setAttribute(UtilConstants._STATUS,
					UtilConstants._TIPS_FAILURE);
			return mapping.findForward(UtilConstants._SUCCESS);
		}

	}
}