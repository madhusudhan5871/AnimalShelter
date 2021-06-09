package com.animalshelter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cage {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cId;
	@Column
	private int dimensions;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public int getDimensions() {
		return dimensions;
	}
	public void setDimensions(int dimensions) {
		this.dimensions = dimensions;
	}
	@Override
	public String toString() {
		return "Cage [cId=" + cId + ", dimensions=" + dimensions + "]";
	}
}
