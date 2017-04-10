package Days30OfCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/30-regex-patterns
 */
public class Day28_RegEx_Patterns_andIntroToDatabases {
	public static void main(String[] args) {
	       Scanner in = new Scanner(System.in);
			Map<String, String> mailMap = new HashMap<String, String>();
			int N = in.nextInt();
			for (int a0 = 0; a0 < N; a0++) {
				String firstName = in.next();
				String emailID = in.next();
				mailMap.put(emailID, firstName);
			}

			String[] names = new String[mailMap.size()];
			int pos = 0;
			int namePos = 0;

			Iterator<String> iterator = mailMap.keySet().iterator();
			while (iterator.hasNext()) {
				String key = iterator.next();
				if (key.contains("@gmail.com")) {
					//System.out.println(key);
					names[pos] = mailMap.get(key);
					pos++;
					namePos++;
				} else {
					// System.out.println("Wrong");
					iterator.remove();
					names[pos] = "~";
					pos++;
				}
			}
			// System.out.println(mailMap.size());
			Arrays.sort(names);
			for (int i = 0; i < namePos; i++) {
				System.out.println(names[i]);
			}
	    }

}
