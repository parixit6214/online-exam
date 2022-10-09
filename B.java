package com.basic;

import java.util.ArrayList;
import java.util.Collections;

public class B {
	public static void main(String[] args) {
		
//		ArrayList<String> al= new ArrayList<>();
//		al.add("abcdef");
//		al.add("xtz");
//		
//		
//		//Collections.shorts
		
		
		String str="abcdef";
		
		char ch[]=str.toCharArray();
		
		for (int i = 0; i < ch.length-1; i=i+2) {
			//for (int j = 0; j < ch.length-1; j++) {
				
			
			char temp=ch[i];
			ch[i]=ch[i+1];
			ch[i+1]=temp;
			
			//System.out.print(ch);
		}
		
		System.out.println(ch);
		
	}

}
