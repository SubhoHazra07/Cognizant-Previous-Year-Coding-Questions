import java.util.*;

public class Palindrome {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n=scanner.nextInt();
        if(n<0){
            System.out.println("Invalid Input");
        }else{
            int temp=n;
            int rev=0;
            while(n!=0){
                int rem=n%10;
                rev=rev*10+rem;
                n/=10;
            }
            if(temp==rev){
                System.out.println(temp+" is a Palindrome Number");
            }else{
                System.out.println(temp+" is not a Palindrome Number");
            }
        }
        scanner.close();
    }
}
