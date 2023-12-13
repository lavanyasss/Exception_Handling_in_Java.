//package Exception_Handling_in_Java;
//nested try block
public class try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			try 
			{
				try {
					int arr[]= {2,35,6,7};
					System.out.println(arr[10]);
			}
			catch(ArithmeticException e){
				System.out.println("Arithmetic Exception Occure");
				System.out.println("bloc 2");
			}
		}
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("ArrayIndexBounds Exception Occure");
			System.out.println("bloc 1");
	    }

    }
	catch(ArithmeticException e){
		System.out.println("Arithmetic Exception Occure");
		System.out.println("main block");
	
	}
  }
}