// 5. Write a program to find vowels and consonants in a string and display the count of Vowels and Consonants in the string.

package Level2String;

import java.util.Scanner;

public class VowelConsonantCount {

    static boolean isVowel(char ch) {
        ch = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : ch; // convert uppercase to lowercase
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    static int[] countVowelsConsonants(String text) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                if (isVowel(ch)) vowels++;
                else consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] result = countVowelsConsonants(input);

        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);

        sc.close();
    }
}
