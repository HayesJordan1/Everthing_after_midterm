import java.util.Scanner;

public class SquareRootWhile {
    public static void main(String args[])
    {
    System.out.print("Type a non-negative integer: ");
     Scanner console = new Scanner(System.in);
	double number = console.nextInt();
   while (number < 0){
       System.out.println("This is negative");
       System.out.print("Type a non-negative integer: ");
       number = console.nextInt();
   }
        System.out.print("The square root is " + Math.sqrt(number));
    }
    
}
