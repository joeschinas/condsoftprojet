package model.dao.factory;

import db.Db;
import model.dao.impl.AdminDaoJDBC;


public interface DaoFactory {

	public static AdminDao createAdminDao() {
		return new AdminDaoJDBC();
	}
	/*public static Usuario createUsuarioDao() {
		return new UsuarioDaoJDBC();
	}*/
}
