package ds.arrays.duplicate;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountConsecutiveElementInStrArray {

	public static void main(String[] args) {

		String inStr = "aaa bb cccc dd aa";

		char[] ch = inStr.toCharArray();

		Map<String, Integer> map = new LinkedHashMap<String, Integer>();

		for (int i = 0; i < ch.length - 1; i++) {
			int count = 1;
			String keyStr = String.valueOf(ch[i]);
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					keyStr = keyStr + ch[j];
					count++;
					i++;
				} else {
					break;
				}
			}

			if (!keyStr.equals(" ")) {
				map.put(keyStr, count);
			}

		}
		System.out.println(map);
	}
}
/*
{aaa=3, bb=2, cccc=4, dd=2, aa=2}
*/