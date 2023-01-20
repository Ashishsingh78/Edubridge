package ashish;
import java.util.Scanner;
public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, i, even = 0, odd = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a value : ");
		number = scanner.nextInt(); // 5
		for (i = 1; i <= number; i++) // 1<=5
		{
		if (i % 2 == 0) // 1%2=1.false
		// 2%2=0...true
		{
		even = even + i; // 0+2=2
		} else {
		odd = odd + i; // 0+1=1
		}
		}
		System.out.println("\n The Sum of Even Numbers : " + even);
		System.out.println("\n The Sum of Odd Numbers :" + odd);
	}

}
