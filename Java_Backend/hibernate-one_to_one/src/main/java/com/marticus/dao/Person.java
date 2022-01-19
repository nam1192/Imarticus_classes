package com.marticus.dao;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

 
	
	@Entity
	@Table(name = "PERSON")

public class Person {

		private long personId;
		private String personName;
		private String personAadhar;
		public Person() {
		}

		public Person(String personName, String personAadhar) {
			this.personName = personName;
			this.personAadhar = personAadhar;
		}

		@Id
		@GeneratedValue
		@Column(name = "PERSON_ID")
		public long getpersonId() {
			return this.personId;
		}

		public void setPersonId(long personId) {
			this.personId = personId;
		}

		@Column(name = "PERSON_NAME", nullable = false, length = 100)
		public String getPersonName() {
			return this.personName;
		}

		public void setPersonName(String personName) {
			this.personName = personName;
		}

		@OneToOne(cascade = CascadeType.ALL)
		public String getPersonAadhar() {
			return this.personAadhar;
		}

		public void setPersonAddress(String personAadhar) {
			this.personAadhar = personAadhar;
		}

	}