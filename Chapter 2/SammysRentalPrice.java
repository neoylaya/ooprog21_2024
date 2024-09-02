import java.util.Scanner;

public class SammysRentalPrice {

    public static void main(String[] args) {
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun. S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes rented: ");
        int minutes = input.nextInt();
        final int FEE_PER_HOUR = 40;
        final int FEE_PER_MINUTE = 1;

        
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        
        int basePrice = hours * FEE_PER_HOUR;
        
        
        int additionalMinutesPrice = remainingMinutes * FEE_PER_MINUTE;

        
        int price = basePrice + additionalMinutesPrice;

        System.out.println("Hours rented: " + hours);
        System.out.println("Additional Minutes rented: " + remainingMinutes);
        System.out.println("Total price: $"+ price);

        
    }
}
