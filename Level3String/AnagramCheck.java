// 8. Write a program to check if two texts are anagrams and display the result.
/* a. An anagram is a word or phrase formed by rearranging the same letters to form different words or phrases,
   b. Write a method to check if two texts are anagrams. The logic used here is as follows:
        i. Check if the lengths of the two texts are equal
       ii. Create an array to store the frequency of characters in the strings for the two text
      iii. Find the frequency of characters in the two texts using the loop
       iv. Compare the frequency of characters in the two texts. If the frequencies are not equal, return false
   c. In the main function take user inputs, call user-defined methods, and displays result.  
 */

package Level3String;
public class AnagramCheck {

    static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i)]++;
            freq2[s2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        System.out.println("First Text: " + s1);
        System.out.println("Second Text: " + s2);
        System.out.println("Are Anagrams? " + areAnagrams(s1, s2));
    }
}

