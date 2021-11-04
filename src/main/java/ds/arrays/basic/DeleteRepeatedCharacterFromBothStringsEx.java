package ds.arrays.basic;

public class DeleteRepeatedCharacterFromBothStringsEx {
    public static void main(String[] args) {
        String s1 = "aBc";
        String s2 = "bcde";
        System.out.println("s1 = " + s1 + " , s2 = " + s2);

        char ar1[] = s1.toCharArray();
        char ar2[] = s2.toCharArray();
        for (int i = 0; i < ar1.length; i++) {
            boolean bMatch = false;
            for (int j = 0; j < ar2.length; j++) {
                if ((String.valueOf(ar1[i])).toLowerCase().equals(
                        ((String.valueOf(ar2[j])).toLowerCase()))) {
                    bMatch = true;
                    break;
                }
            }
            if (bMatch) {
                s1 = s1.replaceAll(String.valueOf(ar1[i]).toUpperCase(), "");
                s1 = s1.replaceAll(String.valueOf(ar1[i]).toLowerCase(), "");
                s2 = s2.replaceAll(String.valueOf(ar1[i]).toLowerCase(), "");
                s2 = s2.replaceAll(String.valueOf(ar1[i]).toUpperCase(), "");
            }
        }
        System.out.println("Modified s1 = " + s1 + ",  Modified s2 = " + s2);
    }

}

/*
 * output
 * 
 * s1 = abc , s2 = cde Modified s1 = ab, Modified s2 = de
 * 
 */