package ds.arrays.basic;

class SwapNumbersWithoutThirdVariableEx {

	public static void main(String[] args) {
		int n1 = 7, n2 = 5;

		System.out.println("before swapping, n1= " + n1 + " and n2= " + n2);

		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;

		System.out.println("After swapping , n1= " + n1 + " and n2= " + n2);

	}

}
/*OUTPUT

before swapping, n1= 7 and n2= 5
After swapping , n1= 5 and n2= 7
 
*/