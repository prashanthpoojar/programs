package Programs;


	import java.util.Scanner;

	public class ReverseSentenceChars {
	    public static String reverseChars(String sentence) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = sentence.length() - 1; i >= 0; i--) {
	            sb.append(sentence.charAt(i));
	        }
	        return sb.toString();
	    }

	    public static void main(String[] args) {
			/*
			 * Scanner in = new Scanner(System.in); System.out.print("Enter a sentence: ");
			 */
	        String sentence = "Hello Prashanth poojar";
	        System.out.println("Reversed (chars): " + reverseChars(sentence));
	        
	    }

}
