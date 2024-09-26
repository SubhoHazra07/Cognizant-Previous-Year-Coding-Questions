import java.util.*;

public class Placement {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the No of Student placed in CSE : ");
        int cse=scanner.nextInt();
        System.out.print("Enter the No of Student placed in ECE : ");
        int ece=scanner.nextInt();
        System.out.print("Enter the No of Student placed in MECH : ");
        int mech=scanner.nextInt();
        if(cse<0 || ece<0 || mech<0){
            System.out.println("Invalid Input");
        }else{
            if(cse==ece && ece==mech && mech==cse){
                System.out.println("None of the Department has got the Highest Placement");
            }else if(cse>ece && cse>mech){
                System.out.println("Highest Placement : CSE - "+cse);
            }else if(ece>mech && ece>cse){
                System.out.println("Highest Placement : ECE - "+ece);
            }else if(mech>cse && mech>ece){
                System.out.println("Highest Placement : MECH - "+mech);
            }else if(cse==ece && cse>mech){
                System.out.println("Highest Placement : CSE - "+cse+", ECE - "+ece);
            }else if(ece==mech && ece>cse){
                System.out.println("Highest Placement : ECE - "+ece+", MECH - "+mech);
            }else{
                System.out.println("Highest Placement : MECH - "+mech+", CSE - "+cse);
            }
        }
        scanner.close();
    }
}
