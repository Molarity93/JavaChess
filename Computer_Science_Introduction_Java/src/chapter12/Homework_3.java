package chapter12;

import java.io.*;
import java.util.*;

public class Homework_3 {

	public static void main(String[] args) {
		
		
	       File file = new File("mueller-report-searchable.txt");
	      
	       BufferedReader br = new BufferedReader(new FileReader(file));
	       
	       Map<String,Integer> stringMap = new TreeMap<String,Integer>();
	       
	       String[] countstring = {"corrupt", "obstruct", "collude", "Russia", "indict", "bribe", "tamper", "impeach", "conspiracy", "covict"};
	      
	       String st;
	      
	       String[] splittedstring;
	       
	       while ((st = br.readLine()) != null) {
	           
	           splittedstring = st.toLowerCase().split("[ .\",-:��]");
	           for(int i=0; i< splittedstring.length ;i++) {
	               
	               for(int j=0; j <=splittedstring[i].length();j++) {
	                 
	                   if(stringMap.containsKey(splittedstring[i].substring(0, j))) {
	                       stringMap.put(splittedstring[i].substring(0, j), (stringMap.get(splittedstring[i].substring(0, j)))+1);
	                   }else {
	                       stringMap.put(splittedstring[i].substring(0, j), 1);
	                   }
	               }
	           }
	       }
	  
	       for(String key : countstring) {
	           if(stringMap.containsKey(key.toLowerCase())) {
	               System.out.println(key + " appears " + stringMap.get(key) + " times");
	           }else {
	               System.out.println(key + " appears 0 times");
	           }
	       }
	       System.out.println();
	  
	   }

	}
