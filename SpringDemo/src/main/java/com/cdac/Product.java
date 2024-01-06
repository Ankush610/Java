package com.cdac;

public class Product {
	
	private int pid;
	private String name;
	public int getPid() {
		return pid;
	}
	
	public void setPid(int pid) {
		System.out.println("Setter pid is called");
		this.pid = pid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		System.out.println("Setter name is called");
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + "]";
	}
	
	public void fn() {
		System.out.println("Product is Purchased...");
	}

}
