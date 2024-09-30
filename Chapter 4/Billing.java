public class Billing {

    // 1st Overload
    public void computeBill(double price) {
        double tax = 0.08 * price;
      double total = price + tax;
      System.out.println("The total price for the bill is: $" + total);    }

    // 2nd Overload 
    public void computeBill(double price, int quantity) {
        double total = price * quantity * 1.08; 
        System.out.println("The total price for the bill is: $" + total);
    }

    // 3rd Overload
    public void computeBill(double price, int quantity, int couponDisc) {
      double subtotal = price * quantity;
        double discAmount = (couponDisc / 100.0) * subtotal;
        double total = (subtotal - discAmount) * 1.08; 
        System.out.println("The total price for the bill is: $" + total);    }

    public static void main(String[] args) {
        Billing billing = new Billing();
        
        // Method Calling
        billing.computeBill(23.2); 
        billing.computeBill(23.2, 7); 
        billing.computeBill(23.2, 3, 10);
    }
}
