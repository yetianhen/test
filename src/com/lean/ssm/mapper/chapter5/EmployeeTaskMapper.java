package com.lean.ssm.mapper.chapter5;

import java.util.List;

import com.lean.ssm.pojo.chapter5.EmployeeTask;

public interface EmployeeTaskMapper {


	public List<EmployeeTask> getEmployeeTaskByEmpId(Long empId);
}
