package com.animalshelter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
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
	
	public int getaId() {
		return aId;
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
				+ aWeight + "]";
	}
	
	
	
}