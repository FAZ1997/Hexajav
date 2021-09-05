package org.sample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TypesofSet {

	public static void main(String[] args) {
	
		Set s=new HashSet();
		
		s.add("java");
		s.add("selenium");
		s.add(null);
		
		System.out.println(s);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		s.remove("selenium");
		System.out.println(s);
		
		for (Object object : s) {
			System.out.println(object);
		}
		
		Set s1=new LinkedHashSet();
		
		s1.add("fazil");
		s1.add("selenium");
		s1.add(null);
		
		System.out.println(s1);
		
		s1.retainAll(s);
		System.out.println(s1);
		
		
		Set<String> s2 =new TreeSet<String>();
		s2.add("javith");
        s2.add("muzamil");
        s2.add("afrid");
        
        System.out.println(s2);
        
        boolean empty2 = s2.isEmpty();
        System.out.println(empty);
        
        s2.remove("afrid");
        System.out.println(s2);
        
        
        
  
	}
}
