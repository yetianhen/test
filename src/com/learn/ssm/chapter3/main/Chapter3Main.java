package com.learn.ssm.chapter3.main;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.lean.ssm.mapper.chapter5.EmployeeMapper;
import com.lean.ssm.pojo.chapter5.Employee;
import com.learn.ssm.chapter3.mapper.RoleMapper;
import com.learn.ssm.chapter3.pojo.Role;
import com.ssm.chapter5.mapper2.RoleMapper2;
import com.ssm.chapter5.mapper2.UserMapper2;
import com.ssm.chapter5.param.PdCountRoleParams;
import com.ssm.chapter5.pojo2.Role2;
import com.learn.ssm.chapter3.utils.SqlSessionFactoryUtils;

public class Chapter3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PdCountRoleParams params=new PdCountRoleParams();
		SqlSession sqlSession=null;
		
		try{
			Logger log=Logger.getLogger(Chapter3Main.class);
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			RoleMapper2 roleMapper=sqlSession.getMapper(RoleMapper2.class);
			params.setRoleName("role");
			roleMapper.countRole(params);
			log.info(params.getTotal());
			log.info(params.getExecDate());
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
	}

}
