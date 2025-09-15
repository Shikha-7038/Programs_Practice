// 4. Write a program to find the frequency of characters in a string using the charAt() method and display the result
/*  a. Create a method to find the frequency of characters in a string using the charAt() method and return the characters and their frequencies in a 2D array. 
       The logic used here is as follows:
          i. Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
         ii. Loop through the text to find the frequency of characters in the text
        iii. Create an array to store the characters and their frequencies
         iv. Loop through the characters in the text and store the characters and their frequencies
    b. In the main function take user inputs, call user-defined methods, and displays result.  
 */

package Level3String;

public class CharFrequency {

    // Method to find frequency of characters
    static String[][] findCharFrequency(String text) {
        int[] freq = new int[256];  // frequency array for ASCII chars

        // Count frequency using charAt()
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Count how many unique characters are present
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        // Create 2D array [uniqueCount][2] → {character, frequency}
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf((char) i);   // character
                result[index][1] = String.valueOf(freq[i]);    // frequency
                index++;
            }
        }
        return result;
    }

    // Method to display result in tabular format
    static void display(String[][] arr) {
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (String[] row : arr) {
            System.out.printf("    %-6s | %s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        String text = "programming in java";

        // Find frequency
        String[][] result = findCharFrequency(text);

        display(result);
      
    }
}


