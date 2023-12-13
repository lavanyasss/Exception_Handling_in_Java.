//package Exception_Handling_in_Java;

public class try_block {

	public static void main(String[] args) {
		try {
			int a=40/0;
		}
        catch(ArithmeticException e) {
        	System.out.println("Arithmetic Exception Occure");
        }
   }

}