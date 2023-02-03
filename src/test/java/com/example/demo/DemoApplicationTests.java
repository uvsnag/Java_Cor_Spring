package com.example.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.MemberDao;
import com.example.demo.dto.MemberDto;

@RunWith(SpringRunner.class)
@SpringBootTest
//@ContextConfiguration(classes={MemberDao.class})
class DemoApplicationTests {
	
//	@TestConfiguration
//	public static class ContextTest{
//		@Bean
//		MemberDao memberDao() {
//			return new MemberDao();
//		}
//	}

	@Autowired
	private MemberDao memberDao;
	
	@Test
	void contextLoads() {
		MemberDto dto = memberDao.findById("1");
		System.out.println(dto.getId()+"-"+dto.getName());
		Assert.assertEquals(dto.getId(),"1");
	}

}
