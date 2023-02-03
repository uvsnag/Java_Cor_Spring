package com.example.demo;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.controller.MainController;
import com.example.demo.dao.MemberDao;
import com.example.demo.dto.MemberDto;

@RunWith(SpringRunner.class)
@WebMvcTest(MainController.class)
class DemoApplicationTestsController {
	
	@Autowired
    private MockMvc mvc;

	@MockBean
    private MemberDao memberDao;
	
	@DisplayName("controller return at least a value")
	@Test
	void test() throws Exception {
		List<MemberDto> findAllList = IntStream.range(0, 3)
				.mapToObj(i-> new MemberDto(String.valueOf(i), "a", "fsd"))
				.collect(Collectors.toList());
		
		given(memberDao.getAllMember()).willReturn(findAllList);
		
		mvc.perform(get("/all-member").contentType(MediaType.APPLICATION_JSON))
		 .andExpect(status().isOk())
		 .andExpect(jsonPath("$[0].id", is("0"))) ;
	}

}
