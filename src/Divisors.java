import java.util.Scanner;

public class Divisors {

    public static void main(String args[]) {

         Scanner console = new Scanner(System.in);
         //Creates the Scanner
        System.out.print("Enter the number :  ");
        int num = console.nextInt();
        //This is what stores the number the person types in
         
        System.out.print("Divisors of " + num+" "+ "="+" " );

        for (int i = 1; i < num; i++) {
            //This says that as long as the number is less than the dividend it will check
            if (num % i != 0) {
                //this says that if the number is not divisible by the number typed in that it will not be printed
                continue;
            }
            System.out.print(i + " , ");
        }
    }
}
