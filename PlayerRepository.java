package com.godor.sports.data.repository;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


import com.godoro.sports.data.entity.Player;

@ManagedBean
@RequestScoped
public class PlayerRepository {

	private Player player=null;
	private List<Player> playerList=null;
	private EntityManager entityManager=null;
	
	public PlayerRepository(EntityManager entityManager) {
		
		this.entityManager = entityManager;
		
	}
	public PlayerRepository() {
	
		playerList=new ArrayList<Player>();
		
		player=new Player();
	
	}
	public Player getPlayer() {
		return player;
	}
	
	public List<Player> getPlayerList() {
		return playerList;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}


	
	
	public void persist(Player plyr)
	{
		EntityManagerFactory factory=Persistence
				.createEntityManagerFactory("my-persistence-unit");
		entityManager=factory.createEntityManager();
		/*String jpql="select player from Player as player";
		
		TypedQuery<Player> query=entityManager.createNamedQuery(jpql, Player.class);
		
		playerList=query.getResultList();
		*/
		
		entityManager.getTransaction().begin();
		entityManager.persist(plyr);
		System.out.println("Insert!!!--->"+plyr.getPlayerName()+"---->"+plyr.getAvarageScore());
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	public List<Player> findAll()
	{
		
		
		
		EntityManagerFactory factory=Persistence
				.createEntityManagerFactory("my-persistence-unit");
		
		entityManager=factory.createEntityManager();
		
		String jpql="select player from Player as player";
		
		TypedQuery<Player> query=entityManager.createQuery(jpql, Player.class);
		
		
		playerList=query.getResultList();
	
		entityManager.close();
		return playerList;
		
	}
	
	
	
	
}
