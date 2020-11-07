/**
		Author : Shivani
		Date  : 5-11-2020
		Description  : Accepting a hash map and returning the values of the map in sorted order as a List.
*/
package Lab6;

import java.util.*;

public class HashMapSoretd {
	public static void main(String[] args) {
		HashMap <Integer,String> hashMap=new HashMap<Integer,String>();
		
		hashMap.put(1, "Asha");  //adding values to the Hashmap
		hashMap.put(2, "Shivani");
		hashMap.put(3, "Pooja");
		hashMap.put(4, "Neha");
		
		//creating list to store the sorted values from hashMap
		List<String> sortedHashMap=new ArrayList<String>();
		
		//creating a method getValue method and store the returned in List
		sortedHashMap=getValues(hashMap);
		
		//Displaying sortedHashMap
		System.out.println(sortedHashMap);	
	}
    private static List<String> getValues(HashMap<Integer, String> hashMap) {
		
		List<String> sortedHashMap=new ArrayList<String>();
		for(Map.Entry<Integer, String> entry:hashMap.entrySet()) {
			sortedHashMap.add(entry.getValue());// storing the value into the sortedList
		}
		Collections.sort(sortedHashMap); //sorting the list using the Collection.sort method
		
		return sortedHashMap; //Returning the sortedHashMap
	}

}