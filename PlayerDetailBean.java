package com.godor.sports.presentation.faces;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

import com.godor.sports.business.document.PlayerDetail;
import com.godor.sports.business.logic.PlayerLogic;


@ManagedBean
@RequestScoped
public class PlayerDetailBean {
	
	private PlayerDetail playerDetail=null;
	
	
	
	public PlayerDetail getPlayerDetail() {
		return playerDetail;
	}
	public void setPlayerDetail(PlayerDetail playerDetail) {
		this.playerDetail = playerDetail;
	}
	public PlayerDetailBean() {
		
		playerDetail=new PlayerDetail();

	}
	public void save()
	{
		PlayerLogic playerLogic=new PlayerLogic();
		playerLogic.create(playerDetail);
	}
	

}
