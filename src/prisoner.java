public class prisoner {
    private static String name;
    private static double height;
    private static double sentence;
    private static cell cell;
    private static int prisonerCount;

    public prisoner(String n, double h, double s, cell Cell){
        System.out.println("This is a constructor");
        setName(n);
        setHeight(h);
        setSentence(s);
        setCell(Cell);
        setPrisonerCount(getPrisonerCount() + 1);
    }
    public static void display(){
        System.out.println(prisoner.getName());
        System.out.println(prisoner.getSentence());
        System.out.println(prisoner.getHeight());
        System.out.println(prisoner.getCell().cellName);
        System.out.println(prisoner.getPrisonerCount());
    }
    public static void display(boolean think){

        if(think = true){
            think();
        }
    }
    public static void think(){
        System.out.println("We should have  never done this :(");
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        prisoner.name = name;
    }

    public static double getHeight() {
        return height;
    }

    public static void setHeight(double height) {
        prisoner.height = height;
    }

    public static double getSentence() {
        return sentence;
    }

    public static void setSentence(double sentence) {
        prisoner.sentence = sentence;
    }

    public static cell getCell() {
        return cell;
    }

    public static void setCell(cell cell) {
        prisoner.cell = cell;
    }

    public static int getPrisonerCount() {
        return prisonerCount;
    }

    public static void setPrisonerCount(int prisonerCount) {
        prisoner.prisonerCount = prisonerCount;
    }
}
