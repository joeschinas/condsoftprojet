package model.entities;

import java.io.Serializable;
import java.sql.Date;

public  abstract class Person {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private Integer id;
		private Integer cpf;
		private Date dateNasc;
		private String email;
		private String name;
		private Apartment Apartment;
		private Apartment Bloco;
		
		


		public Person(Integer id, Integer cpf, Date dateNasc, String email, String name,
				model.entities.Apartment apartment, model.entities.Apartment bloco) {
			super();
			this.id = id;
			this.cpf = cpf;
			this.dateNasc = dateNasc;
			this.email = email;
			this.name = name;
			Apartment = apartment;
			Bloco = bloco;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getCpf() {
			return cpf;
		}

		public void setCpf(Integer cpf) {
			this.cpf = cpf;
		}

		public Date getDateNasc() {
			return dateNasc;
		}

		public void setDateNasc(Date dateNasc) {
			this.dateNasc = dateNasc;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Apartment getApartment() {
			return Apartment;
		}

		public void setApartment(Apartment apartment) {
			Apartment = apartment;
		}

		public Apartment getBloco() {
			return Bloco;
		}

		public void setBloco(Apartment bloco) {
			Bloco = bloco;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		@Override
		public String toString() {
			return "Person [id=" + id + ", cpf=" + cpf + ", dateNasc=" + dateNasc + ", email=" + email + ", name="
					+ name + ", Apartment=" + Apartment + ", Bloco=" + Bloco + "]";
		}

		
		
		
}


