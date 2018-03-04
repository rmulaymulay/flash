package com.rahul.hibernatetutorial.entities;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Entity(name="Alien")
@Table(name="Alien_table")

public class Alien {
	
	@Id
	private int aid;
	
	@Column(name="alian_name")
	private Name aname;
	
	@Column(name="alian_color")
	private String color;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}

	public Name getAname() {
		return aname;
	}
	public void setAname(Name aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}
	

}
