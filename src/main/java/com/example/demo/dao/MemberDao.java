package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.MemberDto;
import com.example.demo.mapper.MemberMapper;

@Repository
public class MemberDao {
	@Autowired
	NamedParameterJdbcTemplate  jdbcTemplate;   
	
	public List<MemberDto> getAllMember() {
		String query = "select id, name, companyId from member";
		return jdbcTemplate.query(query, new MemberMapper());
	}
	public MemberDto findById(String id) {
		
		String query = "select id, name, companyId from member where id = :id";
		SqlParameterSource namedParameters = new MapSqlParameterSource("id", id);
		return jdbcTemplate.queryForObject(query, namedParameters, new MemberMapper());
		
	}
	
}
