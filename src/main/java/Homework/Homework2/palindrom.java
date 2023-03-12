package Homework2;
//1. Напишите метод, который принимает на вход строку (String) и определяет является
// ли строка палиндромом (возвращает boolean значение).
public class palindrom {
    public static boolean isPalindrome(String text) {
            String replaced = text.toLowerCase().replaceAll("[^a-zA-Z0-9А-Яа-я]", "");
            String reversed = new StringBuffer(replaced).reverse().toString();
            return reversed.equals(replaced);
        }

        public static void main(String[] args) {
            System.out.println(isPalindrome("Казак"));
            System.out.println(isPalindrome("Kazak"));
            System.out.println(isPalindrome("Kazadsdk"));
            System.out.println(isPalindrome("Казакакаы"));
        }
}