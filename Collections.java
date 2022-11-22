package com.java.project;
import java.util.Scanner;
import java.util.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
public class Collections {
	 public static void main(String[] args) {
		 Collections info =new Collections();
		 info .customer();
	}
       public static void customer () { 
    	   
    	   String str  ;
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter customer details\n 1.customercode, 2.name, 3,email, 4.phone, 5.accounttype, 6.dob, 7.countryofoperation, 8.bankname, 9.bankbranch, 10.account no ,11.accountbalance,");
            str = sc.nextLine();
           String[] values = str.split(",");
           System.out.println(Arrays.toString(values));
           String a ;
           a = values.toString();
           
           int x = values.length;
           int y = 11;
           if (x!=y) {
        	 System.out.println("enter the valied details");
            customer();
             
       } else if(x==y){
			System.out.println("Enter Your Address \n 1.door no, 2. Street, 3.city, 4. State, 5. Country, 6.pincode");
		}
           String adrs1 ;
		adrs1 = sc.nextLine();
		String[] adds = adrs1.split(",");
		
         String b ;
         b =(Arrays.toString(adds));		
		
		int j = adds.length;
		
		if (j != 6) {
			System.out.println("Your Address is missing");
			customer();
		}
		 else if(j==6){
			System.out.println("Enter your Another addres");
		}

	String	adrs2 = sc.nextLine();

		String[] adds2 = adrs2.split(",");
	    String c ;
         c = adrs2.toString();

		int d = adds2.length;

		if (adrs2.equals("no")) {

			System.out.println("CustomerDetails is");
			HashMap<String, HashMap<String, String>> customerd = new HashMap<String, HashMap<String, String>>();
			HashMap<String, String> customerads = new HashMap<String, String>();
			customerads.put(adrs1, adrs2);
			customerd.put(str, customerads);

			System.out.println(customerd);
		}
		else {

			if (d != 6) {
				System.out.println("Your Miss the value");
				customer();
			} else if(d==6) {
				System.out.println("CustomerDetails is");

				HashMap<String, HashMap<String, String>> customerd = new HashMap<String, HashMap<String, String>>();
				HashMap<String, String> customerads = new HashMap<String, String>();
				customerads.put(adrs1, adrs2);
				customerd.put(str, customerads);

				System.out.println(customerd);

             
          		}
          	}
          
       }}      
        	 
        



       
		



