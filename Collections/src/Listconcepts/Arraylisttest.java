package Listconcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylisttest {

String name;
	int age;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar = new ArrayList();//Static Array

		ar.add(10);
		ar.add(20);

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i)); // Used to get the value from an index
		}

		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(30);
		arr.add(50);
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i)); // Used to get the value from an index
		}
	}
	public Arraylisttest(String name, int age) {
		
		this.name=name;
		this.age=age;
	
	
	Arraylisttest obj = new Arraylisttest("pradeep",23);
	Arraylisttest obj2 = new Arraylisttest("pradeep2",24);
	
	ArrayList <Arraylisttest> obj1 = new ArrayList<Arraylisttest>();
	obj1.add(obj);
	obj1.add(obj2);
	

	Iterator<Arraylisttest> it = obj1.iterator();
	while(it.hasNext()) {
	Arraylisttest al = it.next();
	System.out.println(al.name);
	System.out.print(al.age);
		
	}
	}

}
	
	
