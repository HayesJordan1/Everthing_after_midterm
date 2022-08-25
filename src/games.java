import java.util.Random;

public class games {
    public static final int cost = 1;

    public static Random rand = new Random();


    public static void Swipe(card Card){
        final int ticketsAwarded = rand.nextInt(1, 10);
        if (Card.getBalance() < cost) {
         System.out.println("INSUFFICIENT FUNDS");
     } else {
         Card.setBalance(Card.getBalance() - cost);
            Card.setTickets(Card.getTickets() + ticketsAwarded);
            System.out.println("You now have " + Card.getTickets() + " tickets! Thanks for playing");

        }

    }
}
