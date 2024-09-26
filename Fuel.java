import java.util.*;

public class Fuel{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the No of Liters to Fill up the Tank : ");
        int liter=scanner.nextInt();
        if(liter<=0){
            System.out.println(liter+" is an Invalid Input");
            return;
        }
        System.out.print("Enter the Distance Covered : ");
        int distance=scanner.nextInt();
        if(distance<=0){
            System.out.println(distance+" is an Invalid Input");
            return;
        }
        double fuel=(((double)liter/distance)*100);
        System.out.printf("Liters/100km Fuel Consumption : %.2f \n",fuel);
        double cons=(distance*0.6214)/(liter*0.2624);
        System.out.printf("Miles/Gallons Fuel Consumption : %.2f",cons);
        scanner.close();
    }
}