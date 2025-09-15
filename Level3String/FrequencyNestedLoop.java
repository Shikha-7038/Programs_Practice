// 6. Write a program to find the frequency of characters in a string using nested loops and display the result.
/* a. Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 1D array. The logic used here is as follows:
     i. Create an array to store the frequency of each character in the text and an array to store the characters in the text using the toCharArray() method
    ii. Loops to Find the frequency of each character in the text and store the result in a frequency array. 
        For this use a Nested Loop with an Outer loop to iterate through each character in the text and initialize the frequency of each character to 1. 
        And an Inner loop to check for duplicate characters. In case of duplicate increment the frequency value and set the duplicate characters to '0' to avoid counting them again.
    iii. Create a 1D String array to store the characters and their frequencies. 
         For this Iterate through the characters in the text and store the characters and their frequencies 
   b. Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
 */

package Level3String;
public class FrequencyNestedLoop {
    // Method to find frequency using nested loops
    static String[] charFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        // Find frequency of each character
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue;
            freq[i] = 1; 
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark counted
                }
            }
        }

        String[] result = new String[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[i] = chars[i] + " : " + freq[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {

        String text = "programming";
        String[] result = charFrequency(text);

        System.out.println("Character Frequencies:");
        for (String r : result) {
            if (r != null) System.out.println(r);
        }
    }
}