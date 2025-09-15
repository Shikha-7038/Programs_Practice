// 6. Write a program to find vowels and consonants in a string and display the character type - Vowel, Consonant, or Not a Letter.

package Level2String;

import java.util.Scanner;

public class VowelConsonantType {

    static String charType(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32); // convert uppercase to lowercase
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }

    static String[][] analyzeText(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = charType(text.charAt(i));
        }
        return result;
    }

    static void displayTable(String[][] arr) {
        System.out.println("\nChar\tType");
        System.out.println("--------------");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] result = analyzeText(input);
        displayTable(result);

        sc.close();
    }
}

