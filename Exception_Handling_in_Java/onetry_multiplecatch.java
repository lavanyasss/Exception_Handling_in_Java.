//package Exception_Handling_in_Java;

public class onetry_multiplecatch {

	public static void main(String[] args) 
	{
		try {
			int a[]=new int[5];
			a[5]=50/0;
			} catch(ArithmeticException e) {
				System.out.println("ArithmeticException Exception Occure");
			}
		    catch(ArrayIndexOutOfBoundsException ae ) 
		    {
		    	System.out.println("ArrayIndexBounds Exception Occure");
		    }
            catch(Exception e) 
		    {
            	System.out.println("Handle the all Exception ");
            }
	}

}