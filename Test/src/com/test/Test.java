package com.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
	public static void main(String [] args)
	{
		Employee e1=new Employee();
		e1.setId(102);
		e1.setName("CCC");
		e1.setSalary(50000.60f);
		
		Employee e2=new Employee();
		e2.setId(101);
		e2.setName("BBB");
		e2.setSalary(60000.60f);
		
		Employee e3=new Employee();
		e3.setId(103);
		e3.setName("AAA");
		e3.setSalary(40000.60f);
		
		List<Employee> l=new ArrayList<>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.sort(Comparator.comparingInt(Employee::getId));
		l.forEach((emp)->System.out.println(emp));
		
		//l.forEach(System.out.println);//for each method with method references.
		
		/*for(Employee emp:l)
		{
			System.out.println(emp);
		}*/
		/*for(Employee emp:l)
		{
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
			System.out.println("myself Shreya");
			
			
			
			
		}*/
	}
}

		
