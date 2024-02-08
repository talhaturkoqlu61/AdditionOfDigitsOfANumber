package myProject22;
import java.util.Scanner;

public class CalculatingDigitsOfNumbers {
	public static void main(String[]args) {
		int number,total=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter a number:");
		number=input.nextInt();
		while(number!=0) {
			total+=number%10;
			number/=10;
		}
		System.out.println("Addition of digits of number you entered:"+total);
		
	}

}
