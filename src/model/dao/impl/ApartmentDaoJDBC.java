package model.dao.impl;

import java.sql.Connection;
import java.util.List;

import model.dao.ApartmentDao;
import model.entities.Apartment;


public class ApartmentDaoJDBC implements ApartmentDao{
	private Connection conn;
	
	
	public ApartmentDaoJDBC(Connection conn) {
		
		this.conn = conn;
	}

	@Override
	public void insert(Apartment apt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Apartment dep) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Apartment findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Apartment> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}