package model.service;

import java.util.ArrayList;
import java.util.List;

import model.dao.ApartmentDao;
import model.dao.DaoFactory;
import model.entities.Apartment;

public class ApartmentService {
	private ApartmentDao dao = DaoFactory.createApartmentDao();
	public List<Apartment> findAll(){
	return dao.findAll();	
	}
}
