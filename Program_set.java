package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Program_set {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		TreeSet<String>	treeSet = new TreeSet<String>();
		
//		cannot duplicate, because element are added by using hash codes, 
//		not by indexing approach
		
		set.add("A");
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("C");
		set.add("C");
		set.add("A");
		set.add("D");
		set.add("E");
		
		treeSet.add("A");
		treeSet.add("A");
		treeSet.add("B");
		treeSet.add("Z");
		treeSet.add("C");
		treeSet.add("C");
		treeSet.add("A");
		treeSet.add("D");
		treeSet.add("E");
		
		//Data is unique, no redundancy
		//Data is unordered in output due to hashing
		System.out.println("First set: " +set);
		
		//iterate data
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		
		set.remove("B");//Remove

		//check
		if(set.contains("A")) {
			System.out.println("A is there");
		}
		
		System.out.println("Size of the set is: " +set.size());
		
		
		//Tree set
		//Sort according to alphabetical order
		System.out.println("********************************************");
		System.out.println("Tree set");
		
		System.out.println("First set: " +treeSet);
		
		//iterate data
		Iterator<String> itrTree = treeSet.iterator();
		while(itrTree.hasNext()) {
			String strTree = itrTree.next();
			System.out.println(strTree);
		}
		
		treeSet.remove("B");//Remove

		//check
		if(treeSet.contains("A")) {
			System.out.println("A is there");
		}
		
		System.out.println("Size of the set is: " +treeSet.size());
	}

}
