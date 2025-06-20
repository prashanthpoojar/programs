package Programs;
import java.util.LinkedHashSet;

public class RemoveDuplicateChars {
    public static void main(String[] args) {
        String input = "programming with prashanth";
        String output = removeDuplicates(input);
        System.out.println("Original: " + input);
        System.out.println("Without duplicates: " + output);
    }
    

    public static String removeDuplicates(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : set) {
            sb.append(ch);
        }

        return sb.toString();
    }
}
