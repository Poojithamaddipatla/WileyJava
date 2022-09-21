package com.resource;

import java.util.Enumeration;
import java.util.Vector;
public class EnumeratorD {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vector<String> vector = new Vector<>();

	        vector.add("Keep");
	        vector.add("Calm");
	        vector.add("and");
	        vector.add("learn");
	        vector.add("Everything");
	        System.out.println("The elements of the Vector is : "+ vector);
	 
	        Enumeration enumeration = vector.elements();
	        System.out.println(
	          "The output after Enumerating through the Vector : ");
	        while (enumeration.hasMoreElements()) {
	            System.out.println(enumeration.nextElement());
	        }

	}

}
