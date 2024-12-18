package strings;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MaxOccurrenceCharacter {
    public static void main(String[] args) {
        String inputString = "hello, how are you";
        char maxOccurringChar = findMaxOccurringCharacter(inputString);
        System.out.println("Character with maximum occurrence: " + maxOccurringChar);
    }

    public static char findMaxOccurringCharacter(String inputString) {
        // Remove whitespace and convert the string to lowercase for case-insensitivity
        inputString = inputString.replaceAll("\\s", "").toLowerCase();

        // Create a map to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through the string and count character occurrences
        for (char c : inputString.toCharArray()) {
            if (Character.isLetter(c)) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        char maxOccurringChar = 0;
        int maxCount = 0;

        // Find the character with the maximum occurrence
        for (Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxOccurringChar = entry.getKey();
            }
        }

        return maxOccurringChar;
    }
}
