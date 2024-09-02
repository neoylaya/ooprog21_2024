import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {
        
        System.out.println("****************************************");
        System.out.println("* Carly's makes the food that makes   *");
        System.out.println("*           it a party.                *");
        System.out.println("****************************************");

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of guests: ");
        int guests = scanner.nextInt();

        
        final int PRICE_PER_GUEST = 35;
        int totalPrice = guests * PRICE_PER_GUEST;

        
        boolean isLargeEvent = guests >= 50;

        
        System.out.println("\nNumber of guests: " + guests);
        System.out.println("Price per guest: $" + PRICE_PER_GUEST);
        System.out.println("Total price: $" + totalPrice);
        System.out.println("Large event: " + isLargeEvent);
    }
}