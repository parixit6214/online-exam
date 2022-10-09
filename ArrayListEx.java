package com.sir;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListEx 
{
	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		
		arrayList.add(10);
		
		arrayList.add("JBK");
		
		System.out.println(arrayList);
		
		
		String str=(String) arrayList.get(1);
		
		System.out.println(str.length());
		
		for(int index=0;index<arrayList.size();index++)
		{
			System.out.println(arrayList.get(index));
		}
		
		arrayList.add(1,"java");
		
		System.out.println(arrayList);
		
		arrayList.remove(new Integer(10));
			
		System.out.println(arrayList);
		
		arrayList.set(1, "kiranAcademy");
		
		System.out.println(arrayList);
		
		String s1=(String) arrayList.get(0);
		String s2=(String) arrayList.get(1);
		
		arrayList.set(0,s2);
		arrayList.set(1,s1);
		
		System.out.println(arrayList);
		
		
		System.out.println(arrayList.size());
		
		System.out.println(arrayList.contains("Java"));
		
		arrayList.add("java");
		
		Collections.sort(arrayList);

		System.out.println(arrayList);
		
				
	}
}
