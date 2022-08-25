public class prisonTest {
    public static void main(String[] args) {
        cell c01 = new cell("01", true, 9890);
        cell c02 = new cell("02", true, 9099);
        prisoner Bubba = new prisoner("Bubba", 11.3, 23, c01);
        prisoner Twitch = new prisoner("Twitch,", 13.4, 32, c02);
        prisoner Jimmy = new prisoner("Jimmy,", 14, 1, c01);
        prisoner Laurence = new prisoner("Laurence,", 20, 12, c02);
        prisoner.display();
        cell.openDoor(1234);
        cell.openDoor(9099);
        cell.openDoor(9099);
        cell.openDoor(9099);

    }
}
