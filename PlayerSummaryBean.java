package com.godor.sports.presentation.faces;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

import com.godor.sports.business.document.PlayerSummary;
import com.godor.sports.business.logic.PlayerLogic;

@ManagedBean
@RequestScoped
public class PlayerSummaryBean {

	PlayerSummary playSummary=null;

	
	
	public PlayerSummary getPlaySummary() {
		return playSummary;
	}

	public PlayerSummaryBean() {
		PlayerLogic playerLogic=new PlayerLogic();
		playSummary=playerLogic.list();
		
	}
	
	
}
