//package Exception_Handling_in_Java;
import java.io.*;
public class Throw_file
{
	public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\lavanya\\OneDrive\\Desktop\\MC.txt");
        if (f.createNewFile()) {
            System.out.println("File Succefully Create...");
        } else {
            System.out.println("File Already exit...");
        }
    }
} 