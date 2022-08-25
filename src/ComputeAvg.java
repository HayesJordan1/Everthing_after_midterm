import java.util.Scanner;

public class ComputeAvg {

    public static void main(String args[]) {
      double[] Scores = { 10.0, 1, 99, 98, 98.3, 99.1, 22, 88, 100, 100 };
      double total = 0;

        for ( double Score: Scores) {
            total = total + Score;
        }
        double average = total/10;
        System.out.println(average);
    }

}
