package ds.arrays.duplicate;

import java.util.Map;
import java.util.TreeMap;

//TODO need to work on this
public class CountConsecutiveElementInStrArray {

	public static void main(String[] args) {

		String inStr = "aaa bb cccc dd aa";

		char[] ch = inStr.toCharArray();

		Map<String, Integer> map = new TreeMap<String, Integer>();

		for (int i = 0; i < ch.length - 1; i++) {
			int count = 1;
			String keyStr = String.valueOf(ch[i]);
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j] ) {
					keyStr = String.valueOf(ch[j]);
					count++;
				}
			}
			if (!keyStr.isEmpty()) {
				map.put(keyStr + String.valueOf(ch[i]), count);
			}

		}
		System.out.println(map);
	}
}