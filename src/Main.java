import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemCost = 0;
        double shipCost = 0;
        double totalCost = 0;
        final double SHIP_RATE = 0.2;
        String trash = "";
        System.out.print("Please enter the item cost in USD: ");
        if(in.hasNextDouble()) {
            itemCost = in.nextDouble();
            in.nextLine();
            if(itemCost >= 100) {
                shipCost = 0;
                totalCost = shipCost+itemCost;
                System.out.println("Your ship cost is $" + shipCost);
                System.out.println("Your total cost is: " + totalCost);
            }
            else {
                shipCost = itemCost * SHIP_RATE;
                totalCost = shipCost + itemCost;
                System.out.println("your ship cost is $" + shipCost);
                System.out.println("Your total cost is: " + totalCost);
            }
        }
        else{
            trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
            System.exit(0);
        }





        }

}