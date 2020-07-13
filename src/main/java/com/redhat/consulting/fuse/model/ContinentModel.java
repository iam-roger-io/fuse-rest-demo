package com.redhat.consulting.fuse.model;

import java.io.Serializable;

public class ContinentModel implements Serializable {

	private static final long serialVersionUID = -4302013720340613859L;

	
	public ContinentModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ContinentModel(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
		
	private String code;
	private String name;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
