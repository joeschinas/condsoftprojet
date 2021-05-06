package model.entities;


import java.sql.Date;

public class Perfil extends Person{
	

	
	private String nickName;
	private String senha;
	
	
	public Perfil(Integer id, Integer cpf, Date dateNasc, String email, String name, String nickName, String senha) {
		super(id, cpf, dateNasc, email, name);
		this.nickName = nickName;
		this.senha = senha;
	}
	

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}


	@Override
	public void setId(Integer id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}


	@Override
	public Integer getCpf() {
		// TODO Auto-generated method stub
		return super.getCpf();
	}


	@Override
	public void setCpf(Integer cpf) {
		// TODO Auto-generated method stub
		super.setCpf(cpf);
	}


	@Override
	public Date getDateNasc() {
		// TODO Auto-generated method stub
		return super.getDateNasc();
	}


	@Override
	public void setDateNasc(Date dateNasc) {
		// TODO Auto-generated method stub
		super.setDateNasc(dateNasc);
	}


	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return super.getEmail();
	}


	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		super.setEmail(email);
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}


	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}


	public String getNickName() {
		return nickName;
	}


	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
	
	
	
	
	
	


	
	
	
	
	
	


