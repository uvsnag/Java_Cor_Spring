package com.example.demo.collection;

//public class MemberDto implements Comparable<MemberDto> {
	public class MemberDto  {
	private int id;
	private String name;

	public MemberDto(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	@Override
//	public int compareTo(MemberDto o) {
//		return this.id > o.getId()? 1:0;
//	}

}
