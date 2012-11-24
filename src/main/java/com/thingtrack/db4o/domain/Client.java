package com.thingtrack.db4o.domain;

public class Client {
	private String name;
	private String cif;
	
	public Client() {
		
	}
	
	public Client(String name, String cif) {
		this.name = name;
		this. cif = cif;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	
}
