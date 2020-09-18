package OperationClass;

import java.util.Scanner;

public class MathsOperations {
	
	public static void main(String args[])
	{
		System.out.println(args[0]);
		
		System.out.println("Adding two numbers");
		System.out.println("------------------");
		Scanner getinput=new Scanner(System.in);
		System.out.print("Enter first nunber to add : ");
		int num1=getinput.nextInt();
		System.out.print("Enter second nunber to add : ");
		int num2=getinput.nextInt();
		Operations math=new Operations();
		System.out.println("Result : "+math.add(num1,num2));
	}
	
	

}
