// 2. Write a program to split the text into words, compare the result with the split() method and display the result.

package Level2String;

import java.util.Scanner;

public class StringSplitter {

    // Method to find length without using length()
    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split into words manually
    static String[] manualSplit(String text) {
        int length = findLength(text);
        int spaceCount = 0;

        // Count spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        String[] words = new String[spaceCount + 1];
        int wordIndex = 0;
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                words[wordIndex++] = current.toString();
                current.setLength(0); // reset
            } else {
                current.append(ch);
            }
        }
        words[wordIndex] = current.toString(); // last word

        return words;
    }

    // Compare two string arrays
    static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] manualWords = manualSplit(input);
        String[] builtInWords = input.split(" ");

        System.out.println("\nManual Split:");
        for (String word : manualWords) System.out.println(word);

        System.out.println("\nBuilt-in Split:");
        for (String word : builtInWords) System.out.println(word);

        System.out.println("\nAre both same? " + compareArrays(manualWords, builtInWords));

        sc.close();
    }
}

