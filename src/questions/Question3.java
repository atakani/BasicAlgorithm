package questions;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Question3 {
	public static void main(String[] args) throws IOException {
		String inputLine = null;
		int lengths = 0;
		try {

			BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
			lengths= reader.toString().length();
		
			Map<String, Integer> map = new TreeMap<String,Integer>();
			for (int i = 0; i < lengths /2; i++) {
				inputLine = reader.readLine();
				System.out.println(inputLine);
				if (!map.containsKey(inputLine)) {
					map.put(inputLine, 0);
					map.put(inputLine, map.get(inputLine)+1);
				}
			}
			Iterator it = map.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry entry= (Map.Entry) it.next();
				System.out.println(entry.getKey() +"  "+ entry.getValue());
				}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
}
