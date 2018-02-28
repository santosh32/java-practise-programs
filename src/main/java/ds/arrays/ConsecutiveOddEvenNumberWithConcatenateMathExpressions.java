package ds.arrays;

public class ConsecutiveOddEvenNumberWithConcatenateMathExpressions {

	public static void main(String[] args) {
		String inputString = "123545687890";
		System.out.println("Input is : " + inputString);

		System.out.println(
				"Output is : " + concatenateWthMathExpressions(inputString));
	}

	public static String concatenateWthMathExpressions(String inputString) {
		StringBuffer sb = new StringBuffer();
		char[] ch = inputString.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			sb.append(ch[i]);
			int j = i + 1;
			if (j < ch.length) {
				if (ch[i] % 2 == 0 && ch[j] % 2 == 0) {
					sb.append("-");
				} else if (ch[i] % 2 != 0 && ch[j] % 2 != 0) {
					sb.append("*");
				}
			}
		}

		return sb.toString();
	}
}

/*
 * inputString is : 123545687890 
 * Output is : 123*5456-87890
 */