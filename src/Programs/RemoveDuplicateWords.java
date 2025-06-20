package Programs;

import java.util.*;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String sentence = "this is a test this is only a test";

        // Split the sentence into words
        String[] words = sentence.split("\\s+");
        

        // Use LinkedHashSet to maintain insertion order and remove duplicates
        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));
        
        // Join the unique words back into a sentence
        
        
        String result = String.join(" ", uniqueWords);

        // Output the result
        
        System.out.println("Original sentence: " + sentence);
        System.out.println("After removing duplicates: " + result);
    }
}
