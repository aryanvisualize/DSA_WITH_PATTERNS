import java.util.*;

public class DuplicateCharacters {
    public static void main(String[] args) {

        String str = "programming";
        str = str.toLowerCase();

        Map<Character, Integer> charCount = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            }
        }
        System.out.println("Duplicate characters:");

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(
                    entry.getKey() + " = " + entry.getValue()
                );
            }
        }
    }
}
