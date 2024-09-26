import java.util.*;

public class ValidCarNumber {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Car Number : ");
        int carNo=scanner.nextInt();
        if(carNo<1000 || carNo>9999){
            System.out.println(carNo+" is not a Valid Car Number");
        }else{
            int temp=carNo;
            int sum=0;
            while(carNo!=0){
                int rem=carNo%10;
                sum+=rem;
                carNo/=10;
            }
            if(sum%3==0 || sum%5==0 || sum%7==0){
                System.out.println(temp+" is my Lucky Number");
            }else{
                System.out.println(temp+" is not my Lucky Number");
            }
        }
        scanner.close();
    }
}
