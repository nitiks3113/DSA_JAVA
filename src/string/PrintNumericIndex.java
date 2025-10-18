package string;

// WAJP to take a String input and print all the indexes where numeric characters are present in the String.
import java.util.*;
public class PrintNumericIndex {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        boolean digitFound = false;
        
        System.out.print("Indexes with numeric characters: ");
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                System.out.print(i + " ");
                digitFound = true;
            }
        }
        
        if (!digitFound) {
            System.out.print("No numeric characters found");
        }
        
        System.out.println(); 
        sc.close();
	}

}
