package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import model.dao.AdminDAO;
import model.entities.Admin;


public class AdminDaoJDBC implements AdminDAO {
	private Connection conn;
	
	public AdminDaoJDBC(Connection conn) {
		this.conn=conn;
	}

	@Override
	public void insert(Admin obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Admin obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Admin findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	


}
