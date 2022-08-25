import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
     Scanner sc = new Scanner(
             System.in
     );
     int i=1;
     double sum = 0;
     double number;
     while(i < 10){
         System.out.print("Enter a number (up to 10 are allowed (enter 0 to exit): ");
         i++;
         number = sc.nextInt();
         sum = number + sum;
         if(number == 0){
             break;
         }
     }
         System.out.print("The sum is " + sum);
    }
}
