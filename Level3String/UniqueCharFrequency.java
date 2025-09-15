// 5. Write a program to find the frequency of characters in a string using unique characters and display the result.

package Level3String;

public class UniqueCharFrequency {

    // Method to find unique characters
    static char[] uniqueCharacters(String text) {
        String unique = ""; // temporary string to store unique characters

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isDuplicate = false;

            // check if character already exists in unique
            for (int j = 0; j < unique.length(); j++) {
                if (unique.charAt(j) == ch) {
                    isDuplicate = true;
                    break;
                }
            }

            // if not duplicate, add to unique
            if (!isDuplicate) {
                unique += ch;
            }
        }

        return unique.toCharArray(); // return as char array
    }

    // Method to calculate frequency of characters
    static String[][] charFrequency(String text) {
        int[] freq = new int[256]; // frequency array for ASCII characters

        // Count frequency
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Get unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Prepare 2D array [uniqueChars.length][2]
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]); // character
            result[i][1] = String.valueOf(freq[uniqueChars[i]]); // frequency
        }

        return result;
    }

    // Method to display result
    static void display(String[][] arr) {
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (String[] row : arr) {
            System.out.printf("    %-6s | %s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        String text = "programming in java";

        // Get frequency table
        String[][] result = charFrequency(text);

        display(result);
    }
}

