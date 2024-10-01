
import java.util.Scanner;

public class Prct3usingScannerclass {
    public static void main(String[] args) {
        
        //Here we are use the scanner class adding sum numers 
        
        System.out.println("Taking input from the user");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number 1");

        int a = sc.nextInt();

        System.out.println("Enter number 2");

        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("The Sum of These numbers is");

        System.out.println(sum);
   
   
   
    }
}
