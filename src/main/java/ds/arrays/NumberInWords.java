package ds.arrays;

import java.util.Scanner;

public class NumberInWords {

	String one[] = { " ", 
			" one", " two", " three", " four", " five", " six", " seven", " eight", " Nine", " ten", 
			" eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen" };

	String ten[] = { " ", " ", 
			" twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty", " ninety" };
	
	public void pw(int n, String str) {
		
		if (n > 19) {
			System.out.print(ten[n / 10] + " " + one[n % 10]);
		} else {
			System.out.print(one[n]);
		}
		if (n > 0)
			System.out.print(str);
	}

	public static void main(String[] args) {
		int n = 0;
		Scanner scanf = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		n = scanf.nextInt();

		if (n <= 0)
			System.out.println("Enter numbers greater than 0");

		else {
			NumberInWords inWords = new NumberInWords();
			inWords.pw((n / 1000000000), " Hundred"); //    100,00,00,000
			inWords.pw((n / 10000000) % 100, " crore"); //    1,00,00,000
			inWords.pw(((n / 100000) % 100), " lakh");//         1,00,000
			inWords.pw(((n / 1000) % 100), " thousand");//          1,000
			inWords.pw(((n / 100) % 10), " hundred");//               100
			inWords.pw((n % 100), " ");
		}
		scanf.close();
	}
}