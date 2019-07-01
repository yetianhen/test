package com.lean.ssm.pojo.chapter5;

import java.util.Date;
import java.util.List;

public class Employee {

	private Long id;
	private String realName;
	private SexEnum sex=null;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public SexEnum getSex() {
		return sex;
	}
	public void setSex(SexEnum sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public WorkCard getWorkCard() {
		return workCard;
	}
	public void setWorkCard(WorkCard workCard) {
		this.workCard = workCard;
	}
	public List<EmployeeTask> getEmployeeTaskList() {
		return employeeTaskList;
	}
	public void setEmployeeTaskList(List<EmployeeTask> employeeTaskList) {
		this.employeeTaskList = employeeTaskList;
	}
	private Date birthday;
	private String mobile;
	private String email;
	private String position;
	private String note;
	private WorkCard workCard;
	private List<EmployeeTask> employeeTaskList=null;
}
