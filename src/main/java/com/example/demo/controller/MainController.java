package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.MemberDao;
import com.example.demo.dto.MemberDto;
import com.example.demo.dto.PostTestDto;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;

@RestController  
public class MainController {
	
	
	@Autowired
	private MemberDao memberDao;
	
	@GetMapping("/all-member")
	List<MemberDto> getAllMember(){
		return memberDao.getAllMember();
	}
	@GetMapping("/member/{id}")
	MemberDto getMemberbyId(@PathVariable String id){
		MemberDto dto = memberDao.findById(id);
		
//		SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("name", "id");  
//		FilterProvider filters=new SimpleFilterProvider().addFilter("MemberBeanFilter",filter);  
//		MappingJacksonValue mapping = new MappingJacksonValue(dto);  
//		mapping.setFilters(filters);  
//		
//		return mapping; 
		return dto;
	}

	@PostMapping("/member-post")
	MemberDto postMemberbyId(@RequestBody PostTestDto dto, HttpServletRequest request, HttpServletResponse response){
		String id = dto.getId();
		System.out.println(id);
		System.out.println(String.format("%s%s%s%s", "1", "2", "4", "7"));
		
		return  memberDao.findById(id);
	}
}
