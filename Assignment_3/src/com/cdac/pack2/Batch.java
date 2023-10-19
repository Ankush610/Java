package com.cdac.pack2;

public class Batch {

	private String CName;
	private int BStr;
	public Batch(String cName, int bStr) {
		CName = cName;
		BStr = bStr;
	}
	
	public String getCName() {
		return CName;
	}
	
	public void setCName(String cName) {
		CName = cName;
	}
	public int getBStr() {
		return BStr;
	}
	public void setBStr(int bStr) {
		BStr = bStr;
	}
	public String toString() {
		return "CName= " + CName + ", BStr= " + BStr;
	}
	
	public String Display() {
		return "CName= " + CName + ", BStr= " + BStr;
	}
	
	


}
