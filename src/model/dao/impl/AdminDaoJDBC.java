package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.Db;
import db.DbException;
import javafx.scene.paint.Color;
import model.dao.factory.AdminDao;
import model.entities.Perfil;
import model.entities.Person;


public class AdminDaoJDBC implements AdminDao { 
	
	private Connection conn;

	@Override
	public void insert(Perfil obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Perfil obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteById(String nickName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Perfil findByNickName(String nickName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Perfil> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}


	


