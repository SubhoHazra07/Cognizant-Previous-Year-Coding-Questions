import java.util.*;

public class MaximumMarks {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the No of Semester : ");
        int semester=scanner.nextInt();
        int subject[]=new int[semester];
        for(int i=0;i<semester;i++){
            System.out.print("Enter No of Subjects in "+(i+1)+" Semester : ");
            subject[i]=scanner.nextInt();
            int marks[]=new int[subject[i]];
            System.out.println("Marks obtained in Semester "+(i+1));
            for(int j=0;j<subject[i];j++){
                System.out.print("Enter Subject "+(j+1)+" : ");
                marks[j]=scanner.nextInt();
                if(marks[j]<0 || marks[j]>100){
                    System.out.println("You have Entered Invalid Mark");
                }
            }
            System.out.println("Maximum Marks in "+(i+1)+" Semester : "+maxMarks(marks,subject[i]));
        }
        scanner.close();
    }
    public static int maxMarks(int a[],int n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>=max){
                max=a[i];
            }
        }
        return max;
    }
}
