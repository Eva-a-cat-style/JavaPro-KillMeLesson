import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FieldOfMiracles {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String word = words[random.nextInt(words.length)];
        System.out.println("Try to guess the word");

        boolean guessed = false;

        while (!guessed) {
            System.out.println("Guess a word: " + Arrays.toString(words));
            String userWord = scanner.nextLine();

            if (userWord.equals(word)) {
                System.out.println("You guessed it! " + word);
                guessed = true;
            } else {
                char[] clue = new char[15];
                for (int i = 0; i < clue.length; i++) {
                    if (i < userWord.length() && i < word.length() && userWord.charAt(i) == word.charAt(i)) {
                        clue[i] = word.charAt(i);
                    } else {
                        clue[i] = '#';
                    }
                }
                System.out.println("Clue: " + new String(clue));
            }
        }
        scanner.close();
    }
}