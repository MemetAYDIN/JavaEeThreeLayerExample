package com.godor.sports.business.document;

public class PlayerDetail {

	private long playerId;
	private String playerName;
	private float avarageScore;
	public PlayerDetail(long playerId, String playerName, float avarageScore) {
		this.playerId = playerId;
		this.playerName = playerName;
		this.avarageScore = avarageScore;
	}
	public PlayerDetail() {
	}
	public long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public float getAvarageScore() {
		return avarageScore;
	}
	public void setAvarageScore(float avarageScore) {
		this.avarageScore = avarageScore;
	}

}
