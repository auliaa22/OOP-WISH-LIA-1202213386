import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();
        int customerID;
        int orderQty;
        
        try { 
            System.out.print("Enter how much food to made: ");
            customerID = sa.nextInt();

            System.out.print("Enter Customer ID: ");
            orderQty = sa.nextInt();

            Thread restaurantThread = new Thread(restaurant);
            Waiters waiters = new Waiters(customerID, orderQty);
            Thread waitersThread = new Thread(waiters);
            
            restaurantThread.start();
            waitersThread.start();
             restaurantThread.join();
            waitersThread.join();
        
        } catch (Exception e) {
            System.out.println("Input must be Integer");
        }
        sa.close();
    }
}        