import java.util.*;

public class IncrementCalculation{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Salary : ");
        int salary=scanner.nextInt();
        System.out.print("Enter the Performance Appraisal Rating : ");
        double rating=scanner.nextDouble();
        if(salary<=0 || rating<1 || rating>5){
            System.out.println("Invalid Input");
        }else{
            if(rating>=1 && rating<=3){
                salary+=(0.1*salary);
            }else if(rating>=3.1 && rating<=4){
                salary+=(0.25*salary);
            }else if(rating>=4.1 && rating<=5){
                salary+=(0.3*salary);
            }
            System.out.println("Incremented Salary is : "+salary);
        }
        scanner.close();
    }
}
