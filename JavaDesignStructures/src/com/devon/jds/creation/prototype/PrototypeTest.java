package com.devon.jds.creation.prototype;

import java.util.List;

public class PrototypeTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emps = new Employees();
		emps.loadData();
		
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		
		List<String> list = empsNew.getEmpList();
		list.add("John");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("devon");

		System.out.println("Emps list: " + emps.getEmpList());
		System.out.println("Emps list: " + empsNew.getEmpList());
		System.out.println("Emps list: " + empsNew1.getEmpList());
	}
}
