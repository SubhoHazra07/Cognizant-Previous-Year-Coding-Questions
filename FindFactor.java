import java.util.*;

public class FindFactor {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num=Math.abs(scanner.nextInt());
        System.out.print("Prime Factors of "+num+" are : ");
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                System.out.print(i+", ");
            }
        }
        System.out.print(num);
        scanner.close();
    }
}
