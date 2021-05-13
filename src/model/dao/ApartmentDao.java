package model.dao;

import java.util.List;

import model.entities.Apartment;


public interface ApartmentDao {

	void insert(Apartment apt);
	void update(Apartment dep);
	void deleteById(Integer id);
	Apartment findById (Integer id);
	List<Apartment> findAll();
	
}
