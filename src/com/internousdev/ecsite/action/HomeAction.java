package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware{
	public Map<String, Object> session;
	private List<ItemInfoDTO> itemInfoDTOList = new ArrayList<ItemInfoDTO>();

	public	String execute() throws SQLException{

		ItemListDAO itemListDAO = new ItemListDAO();
		itemInfoDTOList = itemListDAO.getItemList();
		session.put("itemInfoDTOList", itemInfoDTOList);
		String result = "login";
		if(session.containsKey("id")){

			result = SUCCESS;
		}
		return result;
}

@Override
public void setSession(Map<String, Object> session){
	this.session=session;
}

public Map<String, Object> getSession(){
	return this.session;
}

public List<ItemInfoDTO> getItemInfoDTOList() {
	return itemInfoDTOList;
}

public void setItemInfoDTOList(List<ItemInfoDTO> itemInfoDTOList) {
	this.itemInfoDTOList = itemInfoDTOList;
}


}
