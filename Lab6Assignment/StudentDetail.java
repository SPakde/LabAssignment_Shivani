/**
		Author : Shivani
		Date  : 5-11-2020
		Description  : a function which accepts the marks of students as a Hashmap and return the details of the students eligible for the medals along with type of medal
*/

package Lab6;

import java.util.*;

public class StudentDetail {
	public static void main(String[] args) {
		
		Map<Integer,Integer> student=new HashMap<>();
		
		student.put(101, 70);  //adding the values into the hashMap
		student.put(102, 85);
		student.put(103, 90);
		Map<Integer,String> medalDetails=getStudents(student);//Calling the getStudents method
		System.out.println(medalDetails); //printing the medalDetails
	}

	private static Map<Integer, String> getStudents(Map<Integer, Integer> student) {
		
		//creating hashMap to store the details of medals based on marks
		Map<Integer,String> medalDetails=new HashMap<>();
		
		for(Map.Entry<Integer, Integer> entry:student.entrySet()) {
			if(entry.getValue()>=90) { //If marks >=90  assign Gold medal
				medalDetails.put(entry.getKey(),"Gold");
			}
			else if(entry.getValue()>=80 && entry.getValue()<90) {//If marks>=80 and marks<90 assign Silver medal
				medalDetails.put(entry.getKey(),"Silver");
			}
			else if(entry.getValue()>=70 && entry.getValue()<80) {//If marks>=70 and marks<80 assign Bronze medal 
				medalDetails.put(entry.getKey(),"Bronze");
			}
			
		}
		return medalDetails; //returning the medal details
	}

}