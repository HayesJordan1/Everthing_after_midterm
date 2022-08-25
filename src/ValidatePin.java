import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 123;
        int x;
        do{
            System.out.print("Enter Pin: ");
            x=sc.nextInt();
            if(x != pin){
                System.out.println("You did not enter the correct pin");
            }
        }
        while(pin != x);
        System.out.println("Account accessed");
    }
}
