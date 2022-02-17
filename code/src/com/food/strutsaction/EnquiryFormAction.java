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
import com.food.pojo.Enquiry;
import com.food.pojo.TipsSuggestions;
import com.food.util.UtilConstants;

/**
 * MyEclipse Struts Creation date: 09-22-2012
 * 
 * XDoclet definition:
 * 
 * @struts.action path="/EnquiryFormAction" name="GeneralFormBean"
 *                input="/AddEnquiryDetails.jsp" scope="request" validate="true"
 * @struts.action-forward name="success" path="/AddEnquiryDetails.jsp"
 */
public class EnquiryFormAction extends Action {
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
		GeneralFormBean generalFormBean = (GeneralFormBean) form;// TODO
		// Auto-generated
		// method
		// stub
		Enquiry enquiry = new Enquiry(generalFormBean);
		enquiry.setEnquirystatus("pending");
		boolean flag = false;
		try {
			flag = new GeneralDelegate().addEnquiry(enquiry);
			request.setAttribute(UtilConstants._STATUS,
					UtilConstants._ENQUIRY_SUCCESS);
			return mapping.findForward(UtilConstants._SUCCESS);
		} catch (ConnectionException e) {
			request.setAttribute(UtilConstants._STATUS, e.getMessage());
			return mapping.findForward(UtilConstants._SUCCESS);
		} catch (Exception e) {
			request.setAttribute(UtilConstants._STATUS,
					UtilConstants._ENQUIRY_REPLY_FAILURE);
			return mapping.findForward(UtilConstants._SUCCESS);
		}

	}
}