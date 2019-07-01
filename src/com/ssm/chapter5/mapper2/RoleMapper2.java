package com.ssm.chapter5.mapper2;

import com.ssm.chapter5.param.PdCountRoleParams;
import com.ssm.chapter5.pojo2.Role2;

public interface RoleMapper2 {

	public Role2 getRole(Long id);
	public Role2 findRoleByUserId(Long id);
	public void countRole(PdCountRoleParams params);
}
