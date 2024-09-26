import java.util.*;

public class Course {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the No of Course : ");
        int n=scanner.nextInt();
        if(n<1 || n>20){
            System.out.println("Invalid Range");
            return;
        }else{
            scanner.nextLine();
            String course[]=new String[n];
            for(int i=0;i<n;i++){
                System.out.print("Enter Course No "+(i+1)+" : ");
                course[i]=scanner.nextLine();
            }
            System.out.print("Enter the Course to be Searched : ");
            String key=scanner.nextLine();
            int flag=0;
            for(int i=0;i<n;i++){
                if(course[i].equals(key)){
                    System.out.println(key+" course is Available");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(key+" course is not Available");
            }
        }
        scanner.close();
    }
}
