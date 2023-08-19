import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s + " is palindrome? - " + isPalindrome(s));
    }
    public static boolean isPalindrome(String word){
        StringBuilder sb = new StringBuilder(word);
        return word.equals(sb.reverse().toString());
    }
}