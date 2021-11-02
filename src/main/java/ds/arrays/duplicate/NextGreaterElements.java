package ds.arrays.duplicate;

class NextGreaterElements {
    // Find the next greater element for every array element
    public static void findNextGreaterElements(int[] input) {
        // base case
        if (input == null) {
            return;
        }

        // do for each element
        for (int i = 0; i < input.length; i++) {
            // keep track of the next greater element for element `input[i]`
            int next = -1;

            // process elements on the right of element `input[i]`
            for (int j = i + 1; j < input.length; j++) {
                // break the inner loop at the first larger element on the
                // right of element `input[i]`
                if (input[j] > input[i]) {
                    next = input[j];
                    break;
                }
            }

            System.out.print(next + " ");
        }
    }

    public static void main(String[] args) {
        int[] input = {2, 7, 3, 5, 4, 6, 8};
        findNextGreaterElements(input);
    }
}