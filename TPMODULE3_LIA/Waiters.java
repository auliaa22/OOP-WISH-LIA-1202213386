public class Waiters implements Runnable {
  private final int orderQty;
  private final int customerID;
  private static int foodPrice = 25000;

  public Waiters(int orderQty, int customerID) {
    this.orderQty = orderQty;
    this.customerID = customerID;
  }
  
  @Override
  public void run() {
   while (true) {
      getFood();
      try {
        Thread.sleep(1000);
      
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
    }
 }
  
  public void orderInfo() {
    System.out.println("=========================================================================");
    System.out.println("Customer ID: " + this.customerID);
    System.out.println("Number of food: " + this.orderQty);
    System.out.println("Total price: " + (this.orderQty * foodPrice));
    System.out.println("=========================================================================");
  }
  
  private void getFood() {
    synchronized (Restaurant.getLock()) {

      System.out.println("\nWaiter: Food is Ready to delivery");
      Restaurant restoran = new Restaurant();
      restoran.setWaitingForPickup(false);

      if (Restaurant.getFoodNumber() == this.orderQty + 1) {
        orderInfo();
        System.exit(0);
      }
      Restaurant.getLock().notifyAll();
      System.out.println("Waiter:Tell the restaurant to make another food\n");

    }
  }
}
  
  