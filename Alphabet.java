import java.util.*;

public class Alphabet {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Digits : ");
        System.out.print("Enter 1st Digit : ");
        int num1=scanner.nextInt();
        System.out.print("Enter 2nd Digit : ");
        int num2=scanner.nextInt();
        System.out.print("Enter 3rd Digit : ");
        int num3=scanner.nextInt();
        System.out.print("Enter 4th Digit : ");
        int num4=scanner.nextInt();
        System.out.println("Digits Equivalent Alphabets");
        System.out.println(num1+" - "+(char)num1);
        System.out.println(num2+" - "+(char)num2);
        System.out.println(num3+" - "+(char)num3);
        System.out.println(num4+" - "+(char)num4);
        scanner.close();
    }
}
