package com.animalshelter.entity;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Animal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aId;
	@Column
	private String aName;
	@Column
	private String aType;
	@Column
	private float aHeight;
	@Column
	private float aWeight;
	@ManyToOne
	private Cage cage;
	
	public int getaId() {
		return aId;
	}
	public Cage getCage() {
		return cage;
	}
	public void setCage(Cage cage) {
		this.cage = cage;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaType() {
		return aType;
	}
	public void setaType(String aType) {
		this.aType = aType;
	}
	public float getaHeight() {
		return aHeight;
	}
	public void setaHeight(float aHeight) {
		this.aHeight = aHeight;
	}
	public float getaWeight() {
		return aWeight;
	}
	public void setaWeight(float aWeight) {
		this.aWeight = aWeight;
	}
	
	@Override
	public String toString() {
		return "Animal [aId=" + aId + ", aName=" + aName + ", aType=" + aType + ", aHeight=" + aHeight + ", aWeight="
				+ aWeight + ", cage=" + cage + "]";
	}
	
	
	
}
