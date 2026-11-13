	import java.util.Scanner;
	import java.lang.Math;
	public class robotics2
	{
		public static void main(String [] args)
		{
			// getCircleArea – מקבלת רדיוס של מעגל ומחזירה את שטח המעגל לפי הנוסחה: שטח = π × r².
			
			double r = getDoubleFromInput();
			System.out.println("circle area is equal to= " +getCircleArea(r));
			double numbers[] = {1,2,3,4,5,6,7,8,9,10};
			double[][] numbers2 ={{1.45,3.34,7.098,9.098},
				                 {4.234,8.234,6.98,8.987},
								 {2.567,5.234,0.123,1.876},
								};
			System.out.println("average is equal to= " +average(numbers));
			System.out.println("average 2d is equal to= " +average(numbers2));
		   
		}
		static double getCircleArea(double radius)
		{
			return radius*radius*Math.PI;
		}
		static double getDoubleFromInput()
		{
			Scanner input = new Scanner(System.in);
			double r;
			System.out.print("enter circle radius: ");
			r = input.nextDouble();
			return r;
		}
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
		static double average(double[][] numbers)
		{
			double sum = 0;
			for (double[] nums : numbers)
			{
				sum = sum+average(nums);
			}
			return sum/numbers.length;
		}
		
	}