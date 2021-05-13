package model.dao;


import model.dao.impl.AdminDaoJDBC;
import model.dao.impl.ApartmentDaoJDBC;




public interface DaoFactory {

	public static AdminDAO createAdminDao() {
		return new AdminDaoJDBC(JdbcDAO.getConnection());
	}
	public static ApartmentDao createApartmentDao() {
		return new ApartmentDaoJDBC(JdbcDAO.getConnection());
	}
}
