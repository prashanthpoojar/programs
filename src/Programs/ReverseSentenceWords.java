package Programs;

public class ReverseSentenceWords {
    public static String reverseWords(String sentence) {
        sentence = sentence.trim() + " ";
        String reversed = "";
        int idx;
        while ((idx = sentence.indexOf(" ")) != -1) {
            String word = sentence.substring(0, idx);
            reversed = word + " " + reversed;
            sentence = sentence.substring(idx + 1);
        }
        return reversed.trim();
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a sentence: ");
        String input = "Hello prashanth poojar";
        String[] words = input.split("\\s+");
        System.out.println("Reversed (words): " + reverseWords(input));
    }
}
