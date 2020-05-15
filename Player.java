package com.godoro.sports.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long playerId;
	private String playerName;
	private float avarageScore;
	public Player(long playerId, String playerName, float avarageScore) {
		this.playerId = playerId;
		this.playerName = playerName;
		this.avarageScore = avarageScore;
	}
	public Player() {
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
