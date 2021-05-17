package model.entities;

public class Apartment {

	private Integer idApat;
	private Integer room;
	private Integer bathroom;
	private Integer garage;
	private String forRent;
	private String obs;
	
	
	public Apartment() {
		super();
	}


	public Apartment(Integer idApat, Integer room, Integer bathroom, Integer garage, String forRent, String obs) {
		super();
		this.idApat = idApat;
		this.room = room;
		this.bathroom = bathroom;
		this.garage = garage;
		this.forRent = forRent;
		this.obs = obs;
	}


	public Integer getIdApat() {
		return idApat;
	}


	public void setIdApat(Integer idApat) {
		this.idApat = idApat;
	}


	public Integer getRoom() {
		return room;
	}


	public void setRoom(Integer room) {
		this.room = room;
	}


	public Integer getBathroom() {
		return bathroom;
	}


	public void setBathroom(Integer bathroom) {
		this.bathroom = bathroom;
	}


	public Integer getGarage() {
		return garage;
	}


	public void setGarage(Integer garage) {
		this.garage = garage;
	}


	public String getForRent() {
		return forRent;
	}


	public void setForRent(String forRent) {
		this.forRent = forRent;
	}


	public String getObs() {
		return obs;
	}


	public void setObs(String obs) {
		this.obs = obs;
	}


	
}
