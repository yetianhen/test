package com.lean.ssm.pojo.chapter5;

public class MaleEmployee extends Employee{

	private MaleHealthForm maleHealthForm=null;

	public MaleHealthForm getMaleHealthForm() {
		return maleHealthForm;
	}

	public void setMaleHealthForm(MaleHealthForm maleHealthForm) {
		this.maleHealthForm = maleHealthForm;
	}
}
