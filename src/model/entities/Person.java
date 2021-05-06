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
		
		public Person(Integer id, Integer cpf, Date dateNasc, String email, String name) {
			this.id = id;
			this.cpf = cpf;
			this.dateNasc = dateNasc;
			this.email = email;
			this.name = name;
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

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
			result = prime * result + ((dateNasc == null) ? 0 : dateNasc.hashCode());
			result = prime * result + ((email == null) ? 0 : email.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			if (cpf == null) {
				if (other.cpf != null)
					return false;
			} else if (!cpf.equals(other.cpf))
				return false;
			if (dateNasc == null) {
				if (other.dateNasc != null)
					return false;
			} else if (!dateNasc.equals(other.dateNasc))
				return false;
			if (email == null) {
				if (other.email != null)
					return false;
			} else if (!email.equals(other.email))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		
		
		
		
}


