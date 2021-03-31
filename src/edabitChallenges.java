import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.*;


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
//    Write a function that removes any non-letters from a string, returning a well-known film title.
public static class nonletters {
    public static String lettersOnly(String str) {
        return str.replaceAll("[^a-zA-Z]","");
    }
}
//    Given a string, create a function to reverse the case. All lower-cased letters should be upper-cased, and vice versa.
public static class Reverse {
    public static String reverseCase(String str) {
        String result = "";

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else {
                result += Character.toUpperCase(c);
            }
        }
        return result;
    }
}
//    Create a function that takes any non-negative number as an argument and return it with it's digits in descending order. Descending order is when you sort from highest to lowest.

    public static class DescendingOrder {
        public static int sortDesc(final int num) {

            String s = "" + num;

            char[] c = s.toCharArray();

            Arrays.sort(c);

            String str = "";

            for(int k = c.length - 1; k >= 0; k--) {
                str += c[k];
            }

            return Integer.parseInt(str);
        }
    }
//    Given a string, reverse all the words which have odd length. The even length words are not changed
public static class OddReverse {
    public static String reverseOdd(String str) {
        String[] words = str.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 == 0)
                result += words[i] + " ";
            else {
                result += new StringBuilder(words[i]).reverse() + " ";
            }
        }
        return result.trim();
    }
}
//    Write a function that takes an integer minutes and converts it to seconds.
public static class timeConversion {
    public static int convert(int minutes) {
        return minutes * 60;
    }
}
//    Create a function that takes voltage and current and returns the calculated power.
public static class Circuit {
    public static int power(int voltage, int current) {
        return voltage*current;
    }
}

//    Create a function that finds the maximum range of a triangle's third edge, where the side lengths are all integers.
public static class Triangle {
    public static int nextEdge(int side1, int side2) {
        return (side1 + side2) - 1;
    }
}

//    Create a function that takes a number as an argument, increments the number by +1 and returns the result.
        public static int addition(int num) {
            return num + 1;
    }

//Write a function that takes the base and height of a triangle and return its area.
    public static int triArea(int base, int height) {
        return base * height/2;

    }
//    Create a function that takes two numbers and a mathematical operator + - / * and will perform a calculation with the given numbers
        public static int calculator(int num1, char operator, int num2) {
            if(operator == '+'){
                return num1 + num2;
            } else if(operator == '-'){
                return num1 - num2;
            } else if (operator == '/')
            {
                if (num2 == 0)
                {
                    return 0;
                }
                else
                {
                    return num1/num2;
                }
            }else if(operator == '*'){
                return num1 * num2;
            }else {
                return num1;
            }
    }

//    Create a method that takes an array of 10 integers (between 0 and 9) and returns a string of those numbers formatted as a phone number (e.g. (555) 555-5555).
public static String formatPhoneNumber(int[] nums) {
    return "(" + nums[0] + nums[1] + nums[2] + ")" + " " + nums[3] + nums[4] + nums[5] + "-" + nums[6] + nums[7] + nums[8] + nums[9];
}
}
