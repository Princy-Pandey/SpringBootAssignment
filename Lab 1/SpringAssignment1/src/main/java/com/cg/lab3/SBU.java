package com.cg.lab3;

import java.util.List;

public class SBU {

	private int sbuId;
	private String sbuName;
	private String sbuHead;
	private List<Employee> emplist;
	
	public List<Employee> getEmplist() {
		return emplist;
	}
	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}
	@Override
	public String toString() {
		return "SBU [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	
}
