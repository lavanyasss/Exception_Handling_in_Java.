package Exception_Handling_in_Java;
//exception example
public class Exception_propagation {
  void my() {
      int data = 60 / 0;
  }

  void name() {
      my();
  }

  void pay() {
      try {
          name();
      } catch (Exception e) {
          System.out.println("Exception is clear");
      }
  }

  public static void main(String args[]) {
      Exception_propagation obj = new Exception_propagation();
      obj.pay();
      System.out.println("Program is well clear");
  }
}