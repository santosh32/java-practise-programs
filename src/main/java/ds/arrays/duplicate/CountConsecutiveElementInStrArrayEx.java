package ds.arrays.duplicate;

public class CountConsecutiveElementInStrArrayEx {

    public static void main(String[] args) {

        String inStr = "aaa bb fcccc dd aaf";
		System.out.println(inStr);
        char[] chars = inStr.toCharArray();
        char prev = chars[0];
        int count = 0;
		System.out.print("Output : ");
        for (char curr : chars) {
            if (prev == curr) {
                count++;
                prev = curr;
                continue;
            }
            if (!" ".equals(String.valueOf(prev)))
                System.out.print(String.valueOf(prev) + count + " ");
            prev = curr;
            count = 1;
        }
        if (!" ".equals(String.valueOf(prev)))
            System.out.print(String.valueOf(prev) + count + " ");
    }
}
/*

a3 b2 f1 c4 d2 a2 f1
*/