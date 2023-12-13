//package Exception_Handling_in_Java;

public class Multitry_onecatch {

	public static void main(String[] args) {
     //   try {
     //	int a=30/0;
     //   }
        try {
        	int a=30/0;
        }
        catch(ArithmeticException e)
        {
        	System.out.println("Arithmetic Exception Occure");
        }
	}

}
