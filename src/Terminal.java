import java.util.concurrent.CancellationException;

public class Terminal {
    public static void getMoney(int money, card Card){
        Card.setBalance((Card.getBalance()) + money * 2 );
        System.out.println("Your balance is now " + Card.getBalance());
    }
    public static void display(card Card){
        System.out.println("This is card " + Card.getName());
        System.out.println("Your ticket amount is  " + Card.getTickets());
        System.out.println("Your balance is " + Card.getBalance());
    }
    public static void transferBalance(card From, card To, int amount){
        if(From.getBalance() < amount){
            System.out.println("NOT ENOUGH FUNDs");
        }
        else {
            From.setBalance(From.getBalance() - amount);
            To.setBalance(To.getBalance() + amount);
            System.out.println(From.getName() + "'s balance is now " + From.getBalance());
            System.out.println(To.getName() + "'s balance is now "  + To.getBalance());
        }
    }

    public static void getPrize(prizes Prize, card Card){
        if(Prize.getCost() > Card.getTickets() || Prize.getStock() < 1){
            System.out.println("Transaction Failed");
        } else {
            Prize.setStock(Prize.getStock() - 1);
            Card.setTickets( Card.getTickets() - Prize.getCost());
            System.out.println("Enjoy your new " + Prize.getName());
            System.out.println("There are " + Prize.getStock() + " " + Prize.getName() + " left");
            System.out.println("You have " + Card.getTickets() + " tickets remaining");
        }
    }
}
