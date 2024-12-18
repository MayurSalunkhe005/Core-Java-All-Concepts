package strings;

import java.util.HashMap;
import java.util.Map;

public class MaxCharOccurrence {
	public static void main(String[] args) {
		String input = "hello I am from trooman Technologies";

		Map<Character, Integer> charCount = new HashMap<>();

		// Remove spaces and convert the string to lowercase
		input = input.replaceAll("\\s", "").toLowerCase();

		// Count the occurrences of each character
		for (char c : input.toCharArray()) {
			if (Character.isLetter(c)) {
				charCount.put(c, charCount.getOrDefault(c, 0) + 1);
			}
		}

		// Find the character with the maximum occurrence
		char maxChar = ' ';
		int maxCount = 0;

		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxChar = entry.getKey();
				maxCount = entry.getValue();
			}
		}

		System.out.println("Character with maximum occurrence: " + maxChar);
		System.out.println("Maximum occurrence count: " + maxCount);
	}
}