//package Exception_Handling_in_Java;
//throw use
public class throw_use {

	public static void main(String[] args) 
	{
		int age = 15;
		if(age<18)
		{
			throw new ArithmeticException("not login website");
		}
		else {
			System.out.println("Access");
		}
	}

}