	import java.util.Scanner;
  	import java.lang.Math;
	import java.lang.StringBuffer;
	public class robotics2
	{
				public static void main(String [] args)
		{
			Scanner input = new Scanner(System.in);

			 double r = getDoubleFromInput(input);
			System.out.println("circle area is equal to= " +getCircleArea(r));
			System.out.println();
			
			System.out.println("enter the length of the array:");
			int length = input.nextInt();
			double[] array1d = new double[length];
			for(int i=0; i<length; i++)
			{
				System.out.println("enter the " +i +" " + "number:");
				array1d[i] = input.nextDouble();
			}
			System.out.println("average is equal to= " +average(array1d));
			System.out.println();

			System.out.println("enter number of rows:" );
			int rows = input.nextInt();
			System.out.println("enter number of cols:");
			int cols = input.nextInt();
			double[][] array2d= new double[rows][cols];
			for(int i = 0; i<rows; i++)
			{
				for (int j = 0; j<cols; j++)
				{
						System.out.println("enter in row:" +i);
						array2d[i][j] = input.nextDouble();
				}
			}
			System.out.println("average 2d is equal to= " +average(array2d));
			System.out.println();

			String snumbers;
			input.nextLine();
			System.out.println("enter number to check if its a palindrome:");
    		snumbers = input.nextLine();
			System.out.println(palindrome(snumbers));
			System.out.println();	
			
			System.out.println("enter a number to check if its a prime number:");
			Long num = input.nextLong();
			System.out.println(prime(num));
			System.out.println();

			System.out.println("enter X1:");
			double X1 = input.nextDouble();
			System.out.println("enter Y1:");
			double Y1 = input.nextDouble();
			System.out.println("enter X2:");
			double X2 = input.nextDouble();
			System.out.println("enter Y2:");
			double Y2 = input.nextDouble();
			System.out.println("the distance is:" +distance(X1,Y1,X2,Y2));
			input.close();
			

		   
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
		static double getDoubleFromInput(Scanner input)
		{
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
			return reverseNum.equals(snumbers);

		}
		/**
		 * function to determaine if a number is a prime number or not
		 * @param num
		 * @return boolean
		 */
		static boolean prime(long num)
		{
			if (num%2 == 0)
			{
				return false;
			}
			for (long i = 3; i<=(long)Math.sqrt(num); i = i+2)
			{
				if (num%i==0){
				return false;
				}

			}
			return true;
	    }

	   //distance = √((x1 − x2)² + (y1 − y2)²
	   /**
		* function to calculate the distance between two points
		* @param X1
		* @param Y1
		* @param X2
		* @param Y2
		* @return double 
	    */
	   static double distance(double X1, double Y1, double X2, double Y2)
	   {
			double dist = Math.sqrt(Math.pow(X1-X2, 2) + Math.pow(Y1-Y2, 2));
			return dist;
	   }
	}