package com.terabits.meta.po;

public class TestPO {
	private int gid;
	private String name;
	private String password;
	private String sex;
	private int age;
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "TestPO [gid=" + gid + ", name=" + name + ", password=" + password + ", sex=" + sex + ", age=" + age
				+ "]";
	}
	
}