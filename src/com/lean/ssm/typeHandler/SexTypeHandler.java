package com.lean.ssm.typeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import com.lean.ssm.pojo.chapter5.SexEnum;

@MappedTypes(SexEnum.class)
@MappedJdbcTypes(JdbcType.INTEGER)
public class SexTypeHandler implements TypeHandler<SexEnum>{

	@Override
	public SexEnum getResult(ResultSet rs, String columnName) throws SQLException {
		// TODO Auto-generated method stub
		int id=rs.getInt(columnName);
		return SexEnum.getSexById(id);
	}

	@Override
	public SexEnum getResult(ResultSet rs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		int id=rs.getInt(columnIndex);
		return SexEnum.getSexById(id);
	}

	@Override
	public SexEnum getResult(CallableStatement cs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		int id=cs.getInt(columnIndex);
		return SexEnum.getSexById(id);
	}

	@Override
	public void setParameter(PreparedStatement ps, int i, SexEnum parameter, JdbcType jdbcType) throws SQLException {
		// TODO Auto-generated method stub
		ps.setInt(i, parameter.getId());
	}

	
}
