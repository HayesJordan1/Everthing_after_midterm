public class arcadeTest {
    public static void main(String[] args) {
        card card01 = new card("card01");
        card card02 = new card("card02");
        prizes Candy = new prizes("Candy", 1, 2);
        games.Swipe(card01);
        Terminal.getMoney(8, card01);
        games.Swipe(card01);
        Terminal.transferBalance(card01, card02, 7878);
        Terminal.transferBalance(card01, card02, 3);
        Terminal.display(card01);
        Terminal.getPrize(Candy, card01);
        Terminal.getPrize(Candy, card01);
        Terminal.getPrize(Candy, card01);

    }
}
