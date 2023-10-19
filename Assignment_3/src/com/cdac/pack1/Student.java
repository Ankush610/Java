package com.cdac.pack1;

public class Student {
	private int rol;
	private String Name;
	
	private static int cnt=100;
	
	
	public Student(String name) {
		cnt++;
		this.rol = cnt;
		Name = name;
	}
	
	
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getRol() {
		return rol;
	}

	
	
	public String toString() {
		return "rol= " + rol + ", Name= " + Name;
	}
	
	public String Display() {
		return "rol= " + rol + ", Name= " + Name;
	}

}
