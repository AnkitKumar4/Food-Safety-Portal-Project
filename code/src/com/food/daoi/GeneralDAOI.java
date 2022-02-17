package com.food.daoi;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Vector;

import com.food.exception.ConnectionException;
import com.food.exception.DataNotFoundException;
import com.food.pojo.Complaints;
import com.food.pojo.Education;
import com.food.pojo.Enquiry;
import com.food.pojo.Feedback;
import com.food.pojo.TipsSuggestions;

public interface GeneralDAOI {
	public boolean addTipsSuggesition(TipsSuggestions tipsSuggestions)
			throws ConnectionException, DataNotFoundException;

	public List viewTips(int cityid) throws ConnectionException,
			DataNotFoundException;

	public boolean deleteTips(int tipsid) throws ConnectionException,
			DataNotFoundException;

	public boolean addComplaint(Complaints complaints)
			throws ConnectionException, DataNotFoundException;

	public boolean addFeedback(Feedback feedback) throws ConnectionException,
			DataNotFoundException;

	public List ViewFeedBacks(int cityid) throws ConnectionException,
			DataNotFoundException;

	public boolean deleteFeedback(int feedbackid) throws ConnectionException,
			DataNotFoundException;

	public boolean addEnquiry(Enquiry enquiry) throws ConnectionException,
			DataNotFoundException;

	public List ViewEnquiry(int cityid) throws ConnectionException,
			DataNotFoundException;

	public boolean deleteEnquiryQuestion(int enquiryid)
			throws ConnectionException, DataNotFoundException;

	public boolean enquryAnswer(Enquiry enquiry) throws ConnectionException,
			DataNotFoundException;

	public boolean addCareerInformation(Education education)
			throws ConnectionException, DataNotFoundException,
			FileNotFoundException, IOException;

	public List viewCareerInfo(String path) throws ConnectionException,
			DataNotFoundException;

	public List viewComplaints(int cityid) throws ConnectionException,
			DataNotFoundException;

	public boolean deleteComplaints(int complaintid)
			throws ConnectionException, DataNotFoundException;

	public boolean complaintAnswer(Complaints complaints)
			throws ConnectionException, DataNotFoundException;
}
