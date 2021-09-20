package ex02;

import java.util.Arrays;

public class Anagram {

    public static boolean checkanagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        char tabs1[] = s1.toLowerCase().toCharArray();
        char tabs2[] = s2.toLowerCase().toCharArray();
        Arrays.sort(tabs1);
        Arrays.sort(tabs2);
        
        if (Arrays.equals(tabs1, tabs2)) {
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        System.out.println(checkanagram("Tom Elvis Jedusor", "Je suis Voldemort"));
        System.out.println(checkanagram("Hermione granger", "Mia Khalifa"));
    }
}
