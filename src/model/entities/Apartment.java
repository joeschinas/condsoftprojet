package model.entities;

public class Apartment {

	private Integer Apartment;
	private String Bloco;
	private String disponibilidade;
	private String Obs;
	
	
	public Apartment() {
		super();
	}


	public Apartment(Integer apartment, String bloco, String disponibilidade, String obs) {
		super();
		Apartment = apartment;
		Bloco = bloco;
		this.disponibilidade = disponibilidade;
		Obs = obs;
	}


	public Integer getApartment() {
		return Apartment;
	}


	public void setApartment(Integer apartment) {
		Apartment = apartment;
	}


	public String getBloco() {
		return Bloco;
	}


	public void setBloco(String bloco) {
		Bloco = bloco;
	}


	public String getDisponibilidade() {
		return disponibilidade;
	}


	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}


	public String getObs() {
		return Obs;
	}


	public void setObs(String obs) {
		Obs = obs;
	}


	@Override
	public String toString() {
		return "Apartment [Apartment=" + Apartment + ", Bloco=" + Bloco + ", disponibilidade=" + disponibilidade
				+ ", Obs=" + Obs + "]";
	}
	
	
}
