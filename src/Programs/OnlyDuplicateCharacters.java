package Programs;
import java.util.HashSet;
import java.util.Set;

public class OnlyDuplicateCharacters {
    public static void main(String[] args) {
        String input = "EnginEering";

        // Convert to lowercase to handle case-insensitive comparison
       input = input.toLowerCase();

        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for (char ch : input.toCharArray()) {
            if (!seen.add(ch)) {
                duplicates.add(ch);
            }
        }

        // Print only duplicate characters
        System.out.println("Duplicate characters:");
        for (char ch : duplicates) {
            System.out.print(ch);
        }
    }
}
