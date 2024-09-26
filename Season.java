import java.util.*;

public class Season {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Month : ");
        int month=scanner.nextInt();
        if(month>12 || month<1){
            System.out.println("Invalid Month");
            return;
        }
        if(month>=3 && month<=5){
            System.out.println("Season : Spring");
        }else if(month>=6 && month<=8){
            System.out.println("Season : Summer");
        }else if(month>=9 && month<=11){
            System.out.println("Season : Autumn");
        }else{
            System.out.println("Season : Winter");
        }
        scanner.close();
    }
}
