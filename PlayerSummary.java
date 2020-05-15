package com.godor.sports.business.document;

import java.util.ArrayList;
import java.util.List;

public class PlayerSummary {
	
	private List<PlayerDetail> playerDetailList=null;
	private PlayerDetail plyrDtl=null;
	public PlayerSummary(List<PlayerDetail> playerDetailList, PlayerDetail plyrDtl) {
		this.playerDetailList = playerDetailList;
		this.plyrDtl = plyrDtl;
	}
	public PlayerSummary() {
	}
	public List<PlayerDetail> getPlayerDetailList() {
		return playerDetailList;
	}
	public void setPlayerDetailList(List<PlayerDetail> playerDetailList) {
		this.playerDetailList = playerDetailList;
	}
	public PlayerDetail getPlyrDtl() {
		return plyrDtl;
	}
	public void setPlyrDtl(PlayerDetail plyrDtl) {
		this.plyrDtl = plyrDtl;
	}
	
	

	
}
