public class VowelCheck {
    public static void main(String[] args) {
        char ch = 'e'; // Example input
        if ("aeiouAEIOU".indexOf(ch) != -1)
            System.out.println(ch + " is a Vowel");
        else
            System.out.println(ch + " is a Consonant");
    }
}
