/**
		Author : Shivani
		Date  : 5-11-2020
		Description  : Accepting the id and the age of people as a Map and decide if they are eligible for votes
*/

package Lab6;

import java.util.*;

public class VoterList {
	public static void main(String[] args) {
		Map<Integer,Integer> voterList=new HashMap<Integer,Integer>();
		
		voterList.put(1, 38);//list of voters with their age and id
		voterList.put(2, 15);
		voterList.put(3, 27);
		voterList.put(4, 69);
		List<Integer>voterDetails=votersList(voterList);//Calling voterList method
		System.out.println(voterDetails);//printing th voterdetails
	}

	private static List<Integer> votersList(Map<Integer, Integer> voterList) {
		
		////creating list to store the voterdetails
		List<Integer> voterDetails=new ArrayList<>();
		
		for(Map.Entry<Integer, Integer>entry: voterList.entrySet()) {
			
			if(entry.getValue()>18) {//If age is greater than 18 then eligible for vote
				
				voterDetails.add(entry.getKey());//if true add the Id to the list
			}
		}
		return voterDetails;//returning the voterdetails
	}

}
