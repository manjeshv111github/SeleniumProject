package sample;

import java.util.Scanner;

public class strings {

	// Recursion

	public void printHellofromString() {
		String str = "adhgnekllno";
		int len = str.length();
		for (int i = 1; i < len; i++) {
			if (str.charAt(i) == 'h' || str.charAt(i) == 'e' || str.charAt(i) == 'l' || str.charAt(i) == 'l'
					|| str.charAt(i) == 'o') {
				System.out.print(str.charAt(i));
			}
		}
	}
	
	public void findDuplicate() {
		String str = "aahbajkgjik";
		int j=1;
		int len = str.length();
		for(int i=1;i<len;i++) {
			if(str.charAt(i)=='a') {
				j++;
			}
		}
		System.out.println(j);			
	}
	
	public void reverseString() {
		String str="java";
		String str2="";
		int len = str.length();
		for(int i=0;i<len;i++) {
			char str1=str.charAt(i);
			str2=str1+str2;
		}
		System.out.println(str2);
	}
	
	public void fubonaciSeries() {   
		int n1=0,n2=1,n3,i,count=10;
		System.out.print(n1+" "+n2);
		for(i=2;i<count;i++) {
			n3=n1+n2;
			System.out.print(n3);
			n1=n2;
			n2=n3;
		}
	}
	
	public void palindrome() {
		String str = "madam";
		String str2="";
		int len =str.length();
		for(int i=0;i<len;i++) {
			char str1=str.charAt(i);
			str2=str1+str2;
		}
		System.out.println(str2);
		if(str.equalsIgnoreCase(str2)) {
			System.out.println(str+" is a palindrome");
		}
		else {
			System.out.println(str+" is not a palindrome");
		}
		
		
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		strings obj = new strings();
		obj.printHellofromString();
		obj.findDuplicate();
		obj.reverseString();
		obj.fubonaciSeries();
		obj.palindrome();
	
	}
}
