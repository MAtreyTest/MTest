package automation;

import java.util.Scanner;

public class AssignmentMethods5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter any number: ");
		Scanner i = new Scanner(System.in);
		int a = i.nextInt();
		if(a < 10 || a >= 99) {
			System.out.print("Please enter only two digit number: ");
			Scanner j = new Scanner(System.in);
			a= j.nextInt();
		}
		
			int b = a%10;
			int c = (a-b)/10;
			System.out.println(c);
			System.out.println(b);
			int sum = b+c;
			System.out.println("Sum of the two digits " + c + " & " + b + " is: "+ sum);
		

	}

}
