package model.dao;

import java.util.List;

import model.entities.Admin;


public interface AdminDAO{

	void insert(Admin obj);
	void update(Admin obj);
	void DeleteById(Integer id);
	Admin findById(Integer id);
	List<Admin> findAll();
///	List<Admin> findByDepartment (Department depart);
}
