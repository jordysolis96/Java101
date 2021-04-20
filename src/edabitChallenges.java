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
            return str.replaceAll("[^a-zA-Z]", "");
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

            for (int k = c.length - 1; k >= 0; k--) {
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
            return voltage * current;
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
        return base * height / 2;

    }

    //    Create a function that takes two numbers and a mathematical operator + - / * and will perform a calculation with the given numbers
    public static int calculator(int num1, char operator, int num2) {
        if (operator == '+') {
            return num1 + num2;
        } else if (operator == '-') {
            return num1 - num2;
        } else if (operator == '/') {
            if (num2 == 0) {
                return 0;
            } else {
                return num1 / num2;
            }
        } else if (operator == '*') {
            return num1 * num2;
        } else {
            return num1;
        }
    }

    //    Create a method that takes an array of 10 integers (between 0 and 9) and returns a string of those numbers formatted as a phone number (e.g. (555) 555-5555).
    public static String formatPhoneNumber(int[] nums) {
        return "(" + nums[0] + nums[1] + nums[2] + ")" + " " + nums[3] + nums[4] + nums[5] + "-" + nums[6] + nums[7] + nums[8] + nums[9];
    }

    //    Create a function that takes a string and returns a string with spaces in between all of the characters
    public static String spaceMeOut(String str) {
        return str.replaceAll("", " ").trim();
    }

    //  Write a function that returns the string "something" joined with a space " " and the given argument a.
    public static String giveMeSomething(String a) {
        return "something " + a;
    }

//    Create a method that takes an integer as its only argument and returns true if it's less than or equal to zero, otherwise return false.
    public static boolean lessThanOrEqualToZero(int num) {
        return num <= 0;
    }
//    Create a function that takes the age and return the age in days.
    public static int calcAge(int age) {
        return age * 365;
    }
//    In this challenge, a farmer is asking you to tell him how many legs can be counted among all his animals. The farmer breeds three species:
//
//    chickens = 2 legs
//            cows = 4 legs
//            pigs = 4 legs
//    The farmer has counted his animals and he gives you a subtotal for each species. You have to implement a function that returns the total number of legs of all the animals.
    public static int animals(int chickens, int cows, int pigs) {
        return chickens * 2 + (cows + pigs) * 4;
    }
//    Create a function that takes the number of wins, draws and losses and calculates the number of points a football team has obtained so far.
//
//    wins get 3 points
//    draws get 1 point
//    losses get 0 points
    public static int footballPoints(int wins, int draws, int loses) {
        return wins*3 + draws;
    }
//    Create a function that takes an array and returns the difference between the biggest and smallest numbers.
    public static int differenceMaxMin(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1]-arr[0];
    }
//    Create a function that returns true if an integer is evenly divisible by 5, and false otherwise.
    public static boolean divisibleByFive(int num) {
        if(num % 5 == 0){
            return true;
        }else{
            return false;
        }
    }
//    Create a function that takes two integers and checks if they are equal.
    public static boolean isEqual(int num1, int num2) {
         if(num1 == num2){
            return true;
        }else{
             return false;
         }
    }
//    Fix the code in the code tab to pass this challenge (only syntax errors). Look at the examples below to get an idea of what the function should do.
    public static int squared(int b) {
        return b * b;
    }
//    Fix the code in the Code tab so the function returns true if and only if x is equal to 7.
    public static boolean isSeven(int x) {
        if (x == 7){
            return true;
        }else{
            return false;
        }
    }
//    Create a function that returns true if an integer is evenly divisible by 5, and false otherwise.
    public static boolean divisibleByFour(int num) {
        if(num == 0 / 4){
            return true;
        }else{
            return false;
        }
    }

}