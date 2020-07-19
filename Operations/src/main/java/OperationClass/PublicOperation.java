package OperationClass;

public class PublicOperation extends Operations{
	
	public String addValues(String input1, String input2)
	{
	try {
		int first=Integer.parseInt(input1);
		int second=Integer.parseInt(input2);
		return(String.valueOf(add(first,second)));	
		}
	catch(NumberFormatException n)
	{
		return(add(input1,input2));
	}
	}
}
