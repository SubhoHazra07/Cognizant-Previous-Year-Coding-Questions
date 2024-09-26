import java.util.*;

public class PrimeNumbers {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Lower Limit : ");
        int a=scanner.nextInt();
        System.out.print("Enter Upper Limit : ");
        int b=scanner.nextInt();
        if(a<1 || b<1 || a>=b){
            System.out.println("Please Provide Valid Input");
        }else{
            while(a<=b){
                if(a==1){
                    System.out.print(a+" ");
                    a++;
                    continue;
                }else if(a==2){
                    System.out.print(a+" ");
                }else{
                    checkPrime(a);
                }
                a++;
            }
        }
        scanner.close();
    }
    public static void checkPrime(int n){
        boolean flag=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.print(n+" ");
        }
    }
}
