import java.util.Scanner;

public class savingsAccount {
    static double balance;
    public static double checkingAccount(String name, double blnc){
        balance = blnc;
System.out.println("This costumer, " + name + " ,has a balance of $" + balance);
return balance;
    }
    public static void withdraw(){
        boolean worked = false;
        Scanner sc = new Scanner(System.in);


        do {

            System.out.print("How much would you like to take out?: ");
            double moneyWithdrawn = sc.nextInt();
            if(moneyWithdrawn <= 0){
                System.out.println("INVALID NUMBER");
                continue;
            } else if (moneyWithdrawn > balance) {
                System.out.println("NOT ENOUGH FUNDS");
                continue;
            } else {
                worked = true;
            }
        balance = balance - moneyWithdrawn;
        } while (worked == false);

    System.out.println("your new balance is $" + balance);
    }
}
