package oddOReven;

import java.util.Scanner;

public class OddEven {
	
	public static void main(String ar[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = s.nextInt();
		s.close();
		
		if(a%2==0) {
			System.out.println("the number is even number");
		}
		else {
			System.out.println("odd number");
		}
	}
}
