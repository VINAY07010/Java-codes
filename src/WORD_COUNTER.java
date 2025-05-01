import java.util.Scanner;

class WordCounter {
    String text;

    // Constructor to initialize the string
    WordCounter(String text) {
        this.text = text;
    }

    // Method to count words in the string
    int countWords() {
        if (text.trim().isEmpty()) {
            return 0;
        } else {
            String[] words = text.trim().split("\\s+");
            return words.length;
        }
    }
}

public class WORD_COUNTER {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = input.nextLine();  // Make sure to use nextLine(), not next()

        WordCounter wc = new WordCounter(userInput);

        System.out.println("Number of words: " + wc.countWords());
    }
}
