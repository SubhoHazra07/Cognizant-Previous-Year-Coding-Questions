import java.util.*;

public class Products {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("How many products Mayuri want to buy : ");
        int n=scanner.nextInt();
        String product[]=new String[n];
        int price[]=new int[n];
        double discount[]=new double[n];
        double minDiscount[]=new double[n];
        for(int i=0;i<n;i++){
            scanner.nextLine();
            System.out.print("Enter the Product : ");
            product[i]=scanner.nextLine();
            System.out.print("Price of "+product[i]+" is : ");
            price[i]=scanner.nextInt();
            System.out.print("Discount in "+product[i]+" is : ");
            discount[i]=scanner.nextDouble();
            minDiscount[i]=(price[i]*discount[i])/100;
        }
        double min = minDiscount[0];
        for (int i = 1; i < n; i++) {
            if (minDiscount[i] < min) {
                min = minDiscount[i];
            }
        }
        System.out.print("Minimum Discounts on the Product is : ");
        for (int i = 0; i < n; i++) {
            if (minDiscount[i] == min) {
                System.out.print(product[i] + " ");
            }
        }
        scanner.close();
    }
}
