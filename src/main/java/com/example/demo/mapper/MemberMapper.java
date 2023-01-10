package com.example.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.dto.MemberDto;

public class MemberMapper implements RowMapper<MemberDto>  {

	@Override
	public MemberDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		MemberDto member = new MemberDto();
		member.setId(rs.getString("id"));
		member.setName(rs.getString("name"));
		member.setCompanyId(rs.getString("companyId"));
		return member;
	}

}
