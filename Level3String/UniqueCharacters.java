// 2. Find unique characters in a string using the charAt() method and display the result.

package Level3String;

import java.util.Scanner;

public class UniqueCharacters {

    // Method to find length without using length()
    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // Method to find unique characters
    static char[] findUnique(String text) {
        int n = findLength(text);
        char[] temp = new char[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                temp[index++] = c;
            }
        }

        // shrink array
        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] unique = findUnique(text);

        System.out.print("Unique characters: ");
        for (char c : unique) {
            System.out.print(c + " ");
        }

        sc.close();
    }
}

