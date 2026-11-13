	import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import java.lang.Math;
	import java.io.*;
	public class robotics2
	{
		public static void main(String [] args)
		{
			Scanner input = new Scanner(System.in);

			double r = getDoubleFromInput();
			System.out.println("circle area is equal to= " +getCircleArea(r));
			System.out.println();

			double numbers[] = {1,2,3,4,5,6,7,8,9,10};
			System.out.println("average is equal to= " +average(numbers));
			System.out.println();

			double[][] numbers2 ={{1.45,3.34,7.098,9.098},
				                 {4.234,8.234,6.98,8.987},
								 {2.567,5.234,0.123,1.876},
								};
			System.out.println("average 2d is equal to= " +average(numbers2));
			System.out.println();

			String snumbers;
			System.out.println("enter number:");
			snumbers = input.nextLine();
			System.out.println(palindrome(snumbers));


		   
		}
		/**
		 * function to calculate the area of the circle
		 * @return the area of the circle as a double
		 */
		static double getCircleArea(double radius)
		{
			return radius*radius*Math.PI;
		}
		/**
		 * function to get input of a double 
		 * @return radius of a circle
		 */
		static double getDoubleFromInput()
		{
			Scanner input = new Scanner(System.in);
			System.out.print("enter circle radius: ");
			double r = input.nextDouble();
			return r;
		}
		/**
		 * function to calculate the average of a 1d array
		 * @param numbers 1d array double
		 * @return the average of the 1d array
		 */
		static double average(double[] numbers)
		{
				if (numbers.length == 0)
				{
					return 0;
				}
				double sum = 0;
				for (double num : numbers)
				{
					sum = sum + num;
				}
				return sum/numbers.length;
		}
		/**
		 * function to calculate the average of a 2d array
		 * @param numbers 2d array double
		 * @return average of the 2d array
		 */
		static double average(double[][] numbers)
		{
			double sum = 0;
			for (double[] nums : numbers)
			{
				sum = sum+average(nums);
			}
			return sum/numbers.length;
		}
		/**
		 * function to check palindrome using stringbuffer
		 * @param snumbers boolean
		 * @return boolean
		 */ 
		static boolean palindrome(String snumbers)
		{
			StringBuffer srebmuns = new StringBuffer(snumbers);
			srebmuns.reverse();
			String srebmunsrg = srebmuns.toString();
			return snumbers.equals(srebmunsrg);

		}
				/**
		 * function to check palindrome using loop
		 * @param snumbers boolean
		 * @return boolean
		 */ 
		static boolean palindrome2(String snumbers)
		{
			String reverseNum = " ";
			for (int i = 0; i<snumbers.length(); i++)
			{
			reverseNum = snumbers.charAt(i) + reverseNum;
			}
			if (reverseNum.equals(snumbers))
			{
			return Palindrome = "true";
			}
			else 
			{
			return Palindrome = "false";
			}
		}
	}