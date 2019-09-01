package com.chenxue.bean;

public class Dept {
	private String dName;
	private int deptNo;
	private String loc;
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Dept [dName=" + dName + ", deptNo=" + deptNo + ", loc=" + loc + "]";
	}
	public Dept(String dName, int deptNo, String loc) {
		super();
		this.dName = dName;
		this.deptNo = deptNo;
		this.loc = loc;
	}
	public Dept() {}
	
}
