package com.example.demo.dto;


//@JsonIgnoreProperties({"companyId", "name"})  
//@JsonFilter("MemberBeanFilter")  
public class MemberDto {
	
	private String id;
	private String name;
//	@JsonIgnore  
	private String companyId;
	
	public MemberDto() {
		super();
	}
	public MemberDto(String id, String name, String companyId) {
		super();
		this.id = id;
		this.name = name;
		this.companyId = companyId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	
	
}
