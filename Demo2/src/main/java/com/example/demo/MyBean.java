package com.example.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MyBean {
	
	public static void main(String st[]) {

		List<String> list = Arrays.asList("mahesh", "Sam", "Vaibhav", "Rudra", "Surekah");

		list.stream().filter((s) -> s.startsWith("S")).collect(Collectors.toList()).forEach(System.out::println);
		
		Long count = list.stream().filter((s) -> s.startsWith("S")).count();
		
		List <Integer> intL=  Arrays.asList(1,6,8,2,6,8,8);

		 List<Integer> collect2 = intL.stream().distinct().collect(Collectors.toList());
		 
		 
		 System.out.println(collect2);
		
		System.out.println(count);
		Runnable t1 = () -> System.out.println("Running");

		Thread t = new Thread(t1);
		t.start();

		Object o1= new Object();
		Object o2= new Object();

		System.out.println(o1==o2);
		System.out.println(o1.equals(o2));
		
		

	}

}
