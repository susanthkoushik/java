public class Main {
    public static void main(String[] args) {
        int arr[] = {121, 2322, 54545, 999990};
        int maxPalindrome = -1;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int original = num;
            int reverse = 0;
            while (num > 0) {
                int lastdigit = num % 10;
                reverse = reverse * 10 + lastdigit;
                num = num / 10;
            }
            if (original == reverse) {
                if (original > maxPalindrome) {
                    maxPalindrome = original;
                }
            }
        }

        if (maxPalindrome != -1) {
            System.out.println("Largest palindrome is: " + maxPalindrome);
        } else {
            System.out.println("No palindrome found");
        }
    }
}