package ds.arrays.basic;

public class ReplaceAllVowelsIntoCapitalCaseExample1 {
	public static void main(String[] args) {
		String str = "java made so easy";
		System.out.println("original string = " + str);

		char c1[] = str.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			switch (c1[i]) {
			case 'a':
				c1[i] = (char) (c1[i] - 32);
				break;

			case 'e':
				c1[i] = (char) (c1[i] - 32);
				break;

			case 'i':
				c1[i] = (char) (c1[i] - 32);
				break;

			case 'o':
				c1[i] = (char) (c1[i] - 32);
				break;

			case 'u':
				c1[i] = (char) (c1[i] - 32);
				break;

			}

		}
		str = new String(c1);
		System.out.println(
				"After replacing all vowels into capital case = " + str);

	}
}
/*
 * OUTPUT
 * 
 * original string = java made so easy After replacing all vowels into capital
 * case = jAvA mAdE sO EAsy
 * 
 */