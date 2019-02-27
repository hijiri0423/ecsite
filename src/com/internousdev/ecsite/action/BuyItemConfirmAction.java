package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;
	//private BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();
	private int id;
	private String nbc;


	public String execute()throws SQLException{

		BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();
		buyItemCompleteDAO.buyItemInfo(String.valueOf(id), session.get("login_user_id").toString(), "500", nbc, "1");

		/*
		@SuppressWarnings("unchecked")
		List<ItemInfoDTO> list = (List<ItemInfoDTO>)session.get("itemInfoDTOList");

		for(ItemInfoDTO dto : list)
		{
			buyItemCompleteDAO.buyItemInfo(
						dto.getId(),
						,
						session.get("total_price").toString(),
						session.get("count").toString(),
						session.get("pay").toString());
		}

	 	*/
		return SUCCESS;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNbc() {
		return nbc;
	}
	public void setNbc(String nbc) {
		this.nbc = nbc;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
}


