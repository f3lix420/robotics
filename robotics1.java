	import java.util.Scanner;
	public class robotics1
	{
		public static void main(String [] args)
			{
				double num1,num2;
				char arithmeticOperation, isCont;
				isCont = 'y'; //calc starts auto
				while (isCont == 'y') { 
				Scanner input = new Scanner(System.in); 
				System.out.print("enter number:");
				num1 = input.nextDouble(); //input for the first number
				System.out.print("enter Arithmetic operation:");
				arithmeticOperation = input.next().charAt(0); //input for the Arithmetic operation
				System.out.print("enter second number:");
				num2 = input.nextDouble(); //input for the second number
				if (arithmeticOperation == '+')
				{
					System.out.println("solution:" +(num1+num2));
				}
				else if (arithmeticOperation == '-')
				{
					System.out.println("solution:" +(num1-num2));
				}
				else if (arithmeticOperation == '*')
				{
					System.out.println("solution:" +(num1*num2));
				}
				else if (arithmeticOperation == '/')
				{
					if (num2==0) //avoid dividing by 0
					{
						System.out.println("Cannot Divide by Zero, try again!");
					}
					else
					{
						System.out.println("solution:" +(num1/num2)); 
					}
				}
				else 
					System.out.println("invalid operation"); //if the Arithmetic operation wasnt entered
				
				System.out.print("continue: (y/n) "); //incase you want to stop
				isCont = input.next().charAt(0);
				}
			}
	}