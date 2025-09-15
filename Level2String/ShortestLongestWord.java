// 4. Write a program to split the text into workds and find the shortest and longest strings in a given text.

package Level2String;

import java.util.Scanner;

public class ShortestLongestWord {

    // Method to find length of a string without using length()
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

    // Manual split method
    static String[] manualSplit(String text) {
        int length = findLength(text);
        int spaceCount = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') spaceCount++;
        }

        String[] words = new String[spaceCount + 1];
        StringBuilder current = new StringBuilder();
        int idx = 0;

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                words[idx++] = current.toString();
                current.setLength(0);
            } else {
                current.append(ch);
            }
        }
        words[idx] = current.toString();

        return words;
    }

    // Create 2D array of word and length
    static String[][] wordWithLength(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(findLength(words[i]));
        }
        return arr;
    }

    // Find shortest and longest word
    static int[] findShortestLongest(String[][] wordTable) {
        int minIdx = 0, maxIdx = 0;
        for (int i = 1; i < wordTable.length; i++) {
            int len = Integer.parseInt(wordTable[i][1]);
            if (len < Integer.parseInt(wordTable[minIdx][1])) minIdx = i;
            if (len > Integer.parseInt(wordTable[maxIdx][1])) maxIdx = i;
        }
        return new int[]{minIdx, maxIdx};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = manualSplit(input);
        String[][] wordTable = wordWithLength(words);
        int[] result = findShortestLongest(wordTable);

        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (String[] row : wordTable) {
            System.out.println(row[0] + "\t" + row[1]);
        }

        System.out.println("\nShortest Word: " + wordTable[result[0]][0]);
        System.out.println("Longest Word: " + wordTable[result[1]][0]);

        sc.close();
    }
}

