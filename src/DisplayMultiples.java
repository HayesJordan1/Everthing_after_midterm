import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int number = sc.nextInt();
       int x = 1;
       while(x < 13){
          int multiples = x * number;
          System.out.println(x + " * " +  number + ": "+ multiples);
          x++;
       }
    }

}
