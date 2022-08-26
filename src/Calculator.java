public class Calculator {
    public int add(int x, int y){
        return x + y;
    }
    
    // This method could throw an ArithmeticException
    public static double divide(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e){
            System.out.println(e);
        }
        return 0;
    }

     public static void main(String[] args) {
        divide(3, 0);
    }
}
