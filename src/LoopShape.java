public class LoopShape {
    
    static void createRectangle(int width, int height){
        //Draw a Rectangle
        // find the width
        // find the height

        int i = 2;
        boolean lastLine = false;

        String star = "*";
        String line = star.repeat(width);
        String Space = " ";
        String side =  Space.repeat(width - 2);

        // line of stars equal to width
        // check if its the last line
        System.out.println(line);
        do{
         if(i == height){

             continue;
         }
             System.out.println(star + side + star);

         i++;

            // if it isn't, one star on both ends

        }while(i != height);
        System.out.println(line);
    }
    // if it is, row of start, like above

    static void createTriangle(int leg, int height){
        //Draw an Isosceles Right Triangle

        int i = 2;
        boolean lastLine = false;

        String star = "*";
        String line = star.repeat(leg);
        String Space = " ";


        // line of stars equal to width
        // check if its the last line
        int row = 0;
        System.out.println(star);
        do{

            if(i == height){

                continue;
            }
            String side = Space.repeat(row);
            System.out.println(star + side + star);
            i++;
            row++;
            // if it isn't, one star on both ends

        }while(i != height);
        System.out.println(line);
    }

}
