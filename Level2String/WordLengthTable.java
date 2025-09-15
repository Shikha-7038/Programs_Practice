// 3. Write a program to split the text into words and return the words along with their lengths in a 2D array

package Level2String;

import java.util.Scanner;

public class WordLengthTable {

    // Method to find length of string without length()
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

    // Manual split into words
    static String[] manualSplit(String text) {
        int length = findLength(text);
        int spaceCount = 0;

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
                current.setLength(0);
            } else {
                current.append(ch);
            }
        }
        words[wordIndex] = current.toString();

        return words;
    }

    // Create 2D array of words with their lengths
    static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // word
            result[i][1] = String.valueOf(findLength(words[i])); // length
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = manualSplit(input);
        String[][] wordTable = wordWithLength(words);

        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (String[] row : wordTable) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }

        sc.close();
    }
}

