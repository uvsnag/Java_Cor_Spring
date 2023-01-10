package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dao.MemberDao;
import com.example.demo.dto.MemberDto;
import com.example.demo.dto.PostTestDto;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AdviceController {
	@Autowired
	private MemberDao memberDao;
	
	@GetMapping("/ad-all-member")
	List<MemberDto> getAllMember(){
		return memberDao.getAllMember();
	}
	@GetMapping("/ad-member/{id}")
	MemberDto getMemberbyId(@PathVariable String id){
		MemberDto dto = memberDao.findById(id);
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
