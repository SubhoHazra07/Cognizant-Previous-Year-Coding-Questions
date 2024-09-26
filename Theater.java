import java.util.*;

public class Theater {
    public static void main(String[]args){
        double cost=0.0;
        double total=0.0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the No of Ticket : ");
        int ticket=scanner.nextInt();
        if(ticket<5 || ticket>40){
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
        }else{
            scanner.nextLine();
            System.out.print("Do you want refreshment : ");
            String refreshment=scanner.nextLine();
            System.out.print("Do you have coupon code : ");
            String coupon=scanner.nextLine();
            System.out.print("Enter the Circle : ");
            String circle=scanner.nextLine();
            if(circle.equals("k")){
                cost=(75*ticket);
            }else if(circle.equals("q")){
                cost=(150*ticket);
            }else{
                System.out.println("Invalid Input");
                return;
            }
            total+=cost;
            if(refreshment.equals("yes")){
                total+=(50*ticket);
            }
            if(ticket>20){
                total-=(0.1*total);
            }
            if(coupon.equals("yes")){
                total-=(0.02*total);
            }
            System.out.println("Ticket Cost : "+total);
        }
        scanner.close();
    }
}
