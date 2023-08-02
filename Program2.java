package program2;

import java.util.Scanner;

//********************************************************************
//
//Author:        Summer Davis
//
//Program #:     Two
//
//File Name:     Program2.java
//
//Course:        ITSE 2321 Object-Oriented Programming
//
//Description:   Program calculates and displays how much annual property tax the
//				 home owner will be charged for his or her property.
//				 - collects actual value of property from user
//				 - collects current tax rate for each $100.00 of assessed value
//				 - calculates annual property tax for this property
//				 - displays to (2) decimal places:
//				   > Property Value (Actual Value)
//				   > Assessed Value (60% of Actual Value)
// 				   > Tax Rate
//				   > Property Tax
//
//********************************************************************

public class Program2 {
  //***************************************************************
  //
  //  Method:       main
  // 
  //  Description:  The main method of the program
  //
  //  Parameters:   String array
  //
  //  Returns:      N/A 
  //
  //**************************************************************
	public static void main(String[] args) {
		
		// Declare more variables here
		double actualValue;
		double taxRate;
		double assessedValue;
		double propertyTax;
	   
		developerInfo();
  
		// Enter more statements here to make
		// the program work as expected
		
		// create Scanner to obtain input
		Scanner input = new Scanner(System.in);
		
		// Collect property value
		System.out.print("Enter the actual value of the property: $");
		actualValue = input.nextDouble();
		
		// Collect tax rate
		System.out.printf("%nEnter the current tax rate per $100 of assessed value: $");
		taxRate = input.nextDouble();
		
		// Calculate assessed value
		assessedValue = actualValue * 0.6;
		
		// Calculate property tax
		propertyTax = (assessedValue / 100) * taxRate;
		
     
		// Display results: actual value, assessed value, tax rate, property tax
		System.out.printf("%nThe Actual Value is:   $%,.2f%n", actualValue);
		System.out.printf("The Assessed Value is: $%,.2f%n", assessedValue);
		System.out.printf("The Tax Rate is:       $%,.2f%n", taxRate);
		System.out.printf("The Property Tax is:   $%,.2f%n", propertyTax);

  } // End of the main method
	
	//***************************************************************
  //
  //  Method:       developerInfo
  // 
  //  Description:  The developer information method of the program
  //
  //  Parameters:   None
  //
  //  Returns:      N/A 
  //
  //**************************************************************
  public static void developerInfo() {
     System.out.println("Name:    Summer Davis");
     System.out.println("Course:  ITSE 2321 Object-Oriented Programming");
     System.out.println("Program: Two \n");

  } // End of the developerInfo method
}