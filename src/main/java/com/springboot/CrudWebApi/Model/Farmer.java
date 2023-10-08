package com.springboot.CrudWebApi.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name = "Farmers")
public class Farmer {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "farmer_seq")
	@SequenceGenerator(name = "farmer_seq", sequenceName = "farmer_sequence", allocationSize = 1)
	private int id;
	@Column(nullable = false)
	private String fname;
	@Column(nullable = false)
	private String lname;
	@Column(nullable = false)
	private long mobilenum;

	public Farmer(int id, String fname, String lname, long mobilenum) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.mobilenum = mobilenum;
	}

	public Farmer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public long getMobilenum() {
		return mobilenum;
	}

	public void setMobilenum(long mobilenum) {
		this.mobilenum = mobilenum;
	}

}
