import java.net.SocketPermission;
import java.util.Scanner;

public class Pract4TakingInput {
    public static void main(String [] arg){
        System.out.print("Taking Input From The User");



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b = sc.nextInt();
        
        int sum = a+b;
        System.out.print("The Sum of these number is = ");
        System.out.println(sum);

        int sub = a-b;
        System.out.print("The substarction of these number is = ");
        System.out.println(sub);

        int div = a/b;
        System.out.print("The division of these number is = ");
        System.out.println(div);

        int mul = a*b;
        System.out.print("The multiplication of these number is = ");
        System.out.println(mul);



    }
}
