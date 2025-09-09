package Conditional_Statement.Switch;

public class Test {
	public static void main(String[] args) 
	{
		Calculator1 cal1 = new Calculator1();
		
		int  ch = 3;
		if (ch ==1) 
		{
			cal1.addition();
		}else if (ch==2)
		{
			cal1.subraction();
		}else if (ch==3)
		{
			cal1.multiplication();
		}else if (ch==4) 
		{
			cal1.division();
		}else {
			System.out.println("Invalid Inputs");
		}
		
	}
}
