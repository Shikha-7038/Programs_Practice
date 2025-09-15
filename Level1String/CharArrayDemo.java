// 3. Write a program to return all the characters in a string using the user-defined method. 
//    Compare the results with the String built-in to CharArray() method, and display the result.

package Level1String;

import java.util.Scanner;

public class CharArrayDemo {
    public static char[] toCharArrayManual(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    public static boolean compareArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        char[] manualArray = toCharArrayManual(str);
        char[] builtInArray = str.toCharArray();

        System.out.println("Are both arrays same? " + compareArrays(manualArray, builtInArray));
        sc.close();
    }
}
