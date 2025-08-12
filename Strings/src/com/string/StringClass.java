package com.string;

public class StringClass {
	
	public static void main(String[] args) {
		
		
		String s1 = "John";
		String s2 = "John";
		
		System.out.println(s1==s2); //it will be true because it will be stored in same address at string constant pool if the value is same..
		System.out.println(s1.equals(s2)); // it will compare the content of the string
		
		String s3 = new String("Alex");
		String s4 = new String("Alex");
		
		System.out.println(s3==s4); //It will be false because string in object stores in diff address
		
		System.out.println(s3.equals(s4)); // it will compare the content of the string so it is true
	}

}
