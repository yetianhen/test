package com.lean.ssm.pojo.chapter5;

public class FemaleEmployee extends Employee{


	private FemaleHealthForm femaleHealthForm=null;

	public FemaleHealthForm getFemaleHealthForm() {
		return femaleHealthForm;
	}

	public void setFemaleHealthForm(FemaleHealthForm femaleHealthForm) {
		this.femaleHealthForm = femaleHealthForm;
	}
}
