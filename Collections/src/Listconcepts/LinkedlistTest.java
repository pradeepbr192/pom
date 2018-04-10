package Listconcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistTest {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Pradeep"); /// Adding values to the Linked list
		ll.add("Sudeep");
		for (int n = 0; n < ll.size(); n++) {
			System.out.println(ll.get(n));

		}
		ll.addFirst("Aparna");  //Adding elements to the beginning of the linked list
		ll.addLast("Adithya");  // Adding elements to the end of the linked list
		for (int n = 0; n < ll.size(); n++) {
			System.out.println(ll.get(n));
		}
		
		//Setting value for a particular position
		ll.set(0, "Arpana");
		ll.set(1, "Raghava");
		ll.set(2, "Rmbhat");
		ll.set(3, "Veena");
		
		//Advanced For Loop
		
		for(String str : ll) {
			System.out.println(str);
		}
			
		//While Loop
		Iterator<String> it= ll.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
	

}
