public class Main{
    public static void main(String[]args){
        int num=181;
        int original =num;
        int reverse=0;
        int lastdigit=0;
        System.out.println(num);
        while(num>0){
            lastdigit=num%10;
            reverse = reverse*10+lastdigit;
            num= num/10;
            System.out.println("reverse number is"+ " " + reverse);
        }
        if (original==reverse){
            System.out.println("It is palindrome number");
            }
             else{
                System.out.println("It is not a palindrone number");
        }
    }
}