//package Exception_Handling_in_Java;

public class Finally_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[5];
			a[5]=50/0;
			} catch(ArithmeticException e) {
				System.out.println("Arithmetic Exception Exception Occure");
			}
		    catch(ArrayIndexOutOfBoundsException ae ) 
		    {
		    	System.out.println("ArrayIndexBounds Exception Occure");
		    }
            catch(Exception e) 
		    {
            	System.out.println("Handle the all Exception ");
            }
		    finally {
		    	System.out.println("All code Run");
		    }
	}

}