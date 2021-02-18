import java.util.stream.IntStream;
import java.util.Arrays;

public class edabitChallenges {
    public static void main(String[] args) {

    }

    //    Create a method that takes two integers as arguments and return their sum.
    public static class SumOfTwoNumbers {
        public static int sum(int a, int b) {
            return a + b;
        }
    }


    //    You're given a string of words. You need to find the word "Nemo", and return a string like this: "I found Nemo at [the order of the word you find nemo]!".
//    If you can't find Nemo, return "I can't find Nemo :(".
    public static class Challenge {
        public static String findNemo(String sentence) {
            String[] words = sentence.split(" ");
            int pos = 1 + IntStream.range(0, words.length)
                    .filter(i -> words[i].equals("Nemo"))
                    .findFirst()
                    .orElse(-1);

            return (pos > 0) ? String.format("I found Nemo at %d!", pos)
                    : "I can't find Nemo :(";
        }
    }

    //    Create a method that takes a string and returns a string with its letters in alphabetical order.
    public class Program {
        public String AlphabetSoup(String s) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }
    }

    //    Create a function that takes a string and returns the middle character(s). If the word's length is odd, return the middle character. If the word's length is even, return the middle two characters.
    static class middle {
        public static String getMiddle(String word) {
            int l = word.length();
            if (l % 2 == 0) {
                return word.substring(l / 2 - 1, l / 2 + 1);
            } else {
                return word.substring(l / 2, l / 2 + 1);
            }
        }
    }

    //    Write a function that takes a credit card number and only displays the last four characters. The rest of the card number must be replaced by ************.
    public class creditCard {
        public void cardHide(String card) {
            String result = "";
            for (int i = 0; i < card.length(); i++) {
                if (i < card.length() - 4) result += "*";
                else result += card.charAt(i);
            }
        }
    }
}
