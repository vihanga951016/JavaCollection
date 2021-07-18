package test;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	int roll;
	String name;
}

public class Program_ArrayList {

	public static void main(String[] args) {
		//list1 can store only string object
		ArrayList<String> list1 = new ArrayList<String>();

		//list2 can store any type of objects
		ArrayList list2 = new ArrayList();
		
		Student s1 = new Student();
		s1.roll = 101;
		s1.name = "Vihanga";
		
		//add data in list
		list1.add("A");	//index0
		list1.add("B"); //index1
		list1.add("C"); //index2
		list1.add("D"); //index3
		list1.add("E"); //index4
		list1.add("A");
		list1.add("A");
		list1.add("A");
		
		list2.add(3);
		list2.add("I");
		list2.add("T");
		list2.add(34);
		list2.add(s1);
		
		System.out.println(list1);
		System.out.println(list2);
		
		//Get the element of list
		String name = list1.get(3);
		System.out.println("Name is: "+name);
		
		
		Object o = list2.get(2);
		System.out.println("O is: " +o);
		
		//update elements
		list1.set(3, "Z");
		System.out.println("Updated list: " +list1);
	
	
		//remove element
		list1.remove(4);
		System.out.println("Now list is: " +list1);
		
		//remove all clear();
		
		//
		if(list1.contains("A")) {
			System.out.println("A is on the list");
		}
		
		//Iterate in array list with enhanced for loop
		System.out.println("");
		System.out.println("================");
		System.out.println("Iterate");
		for(String str : list1) {
			System.out.println(str);
		}
		System.out.println("================");
		
		//Another example for Iterate using for loop
		System.out.println("");
		System.out.println("================");
		System.out.println("Iterate");
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		System.out.println("================");
		
		
		//Iterate using iterator API(Manual)
		System.out.println("");
		System.out.println("Iterate using iterator API");
		Iterator<String> itrManual = list1.iterator();
		System.out.println(itrManual.next());
		System.out.println(itrManual.next());
		System.out.println(itrManual.next());
		System.out.println(itrManual.next());
		
		//Iterate using iterator API(Auto)
		System.out.println("");
		System.out.println("Iterate using iterator API(Auto)");
		Iterator<String> itrAuto = list1.iterator();
		
		while(itrAuto.hasNext()) {
			String AutoIteration = itrAuto.next();
			System.out.println(AutoIteration);
			if(AutoIteration.equals("A")) { //remove elements
				itrAuto.remove();
			}
		}
		System.out.println("New Array List: " +list1);
				
	}

}
