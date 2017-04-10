package Days30OfCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8_DictionariesAndMaps {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Integer> phoneMap = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			// Write code here
			
			phoneMap.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.next();
			// Write code here
			if(phoneMap.get(s)==null) {
				System.out.println("Not found");
			}
			else {
				System.out.println(s+"="+phoneMap.get(s));
			}
		}
		in.close();
	}

}
