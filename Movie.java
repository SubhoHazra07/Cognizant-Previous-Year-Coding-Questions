import java.util.*;

public class Movie {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the no of pizzas bought : ");
        int pizza=scanner.nextInt();
        System.out.print("Enter the no of Puffs bought : ");
        int puff=scanner.nextInt();
        System.out.print("Enter the no of Cold Drinks bought : ");
        int coldDrinks=scanner.nextInt();
        System.out.println("Bill Details : ");
        System.out.println("No of Pizzas : "+pizza);
        System.out.println("No of Puffs : "+puff);
        System.out.println("No of Cold Drinks : "+coldDrinks);
        System.out.println("Total Price : "+((pizza*100)+(puff*20)+(coldDrinks*10)));
        System.out.println("ENJOY YOUR SHOW!!");
        scanner.close();
    }
}
