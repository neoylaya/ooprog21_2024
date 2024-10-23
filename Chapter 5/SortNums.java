import java.util.Scanner;

public class SortNums {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Input three numbers:");
        int a, b, c;

        
        System.out.print("Enter First Number: ");
        a = sc.nextInt();

        
        System.out.print("Enter Second Number: ");
        b = sc.nextInt();

        
        System.out.print("Enter Third Number: ");
        c = sc.nextInt();

        
        if (a <= b && b <= c) {
            System.out.println("Ascending order: " + a + ", " + b + ", " + c);
        }
        
        else if (a >= b && b >= c) {
            System.out.println("Numbers already in descending order: " + a + ", " + b + ", " + c);
        }
        
        else {
            
            if (a < b) {
                int temp = a;
                a = b;
                b = temp;
            }
            if (a < c) {
                int temp = a;
                a = c;
                c = temp;
            }
            if (b < c) {
                int temp = b;
                b = c;
                c = temp;
            }
      
            System.out.println("Numbers rearranged in descending order: " + a + ", " + b + ", " + c);
        }
    }
}
