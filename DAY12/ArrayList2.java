import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

       
        String[] words = sentence.split("\\s+");

       
        ArrayList<String> wordList = new ArrayList<>();

        
        for (String word : words) {
            wordList.add(word);
        }

      
        System.out.println("Words in the ArrayList: " + wordList);

        
        System.out.println("Indexes of palindrome words: ");
        for (int i = 0; i < wordList.size(); i++) {
            if (isPalindrome(wordList.get(i))) {
                System.out.println("Index " + i + ": " + wordList.get(i));
            }
        }

        
        System.out.println("Sentence in reverse order: ");
        for (int i = wordList.size() - 1; i >= 0; i--) {
            System.out.print(wordList.get(i) + " ");
        }
        System.out.println();

        
        scanner.close();
    }

    
    private static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
