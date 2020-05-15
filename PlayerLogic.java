package com.godor.sports.business.logic;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.godor.sports.business.document.PlayerDetail;
import com.godor.sports.business.document.PlayerSummary;
import com.godor.sports.data.repository.PlayerRepository;
import com.godoro.sports.data.entity.Player;

public class PlayerLogic {
	
	public void create(PlayerDetail playerDetail)
	{
		EntityManagerFactory factory=Persistence
				.createEntityManagerFactory("my-persistence-unit");
		EntityManager entityManager=factory.createEntityManager();
		entityManager.getTransaction().begin();
		PlayerRepository playerRepository=new PlayerRepository( entityManager);
		Player player=new Player();
		
		player.setPlayerName(playerDetail.getPlayerName());
		player.setAvarageScore(playerDetail.getAvarageScore());
		playerRepository.persist(player);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		playerDetail.setPlayerId(player.getPlayerId());
		
	}
	
	public PlayerSummary list()
	{
		List<PlayerDetail> playerDetailList=new ArrayList<PlayerDetail>();
		EntityManagerFactory factory=Persistence
				.createEntityManagerFactory("my-persistence-unit");
		EntityManager entityManager=factory.createEntityManager();
		
		entityManager.getTransaction().begin();
		PlayerRepository playerRepository=new PlayerRepository(entityManager);
		List<Player> playerList=playerRepository.findAll();
		for(Player plyr:playerList)
		{
			PlayerDetail playerDetail=new PlayerDetail();
			playerDetail.setPlayerName(plyr.getPlayerName());
			playerDetail.setAvarageScore(plyr.getAvarageScore());
			playerDetailList.add(playerDetail);
		}
		
		
		
		return new PlayerSummary(playerDetailList, null);
		
	}

}
