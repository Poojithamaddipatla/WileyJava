package com.resource;

import java.util.Stack;
public class StackD {
public static void main(String[] args) {
	 Stack<String> animals= new Stack<>();

       // Add elements to Stack
       animals.push("Dog");
       animals.push("Horse");
       animals.push("Cat");

       System.out.println("Stack: " + animals);
       
       String element = animals.pop();
       System.out.println("Removed Element: " + element);
//       
       System.out.println(animals);
//       
       // Access element from the top
       String element1 = animals.peek();
       System.out.println("Element at top: " + element1);
       
       System.out.println(animals);
}
}