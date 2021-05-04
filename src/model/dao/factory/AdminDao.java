

package model.dao.factory;


	import java.util.List;

	import model.entities.Perfil;

	public interface AdminDao{

		void insert(Perfil obj);
		void update(Perfil obj);
		void DeleteById(String nickName);
		Perfil findByNickName(String nickName);
		List<Perfil> findAll();
		//List<Person> findByDepartment (Department depart);
	}
	
	

