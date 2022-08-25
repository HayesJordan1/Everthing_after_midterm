public class CountChar {

    public static void main(String[] args) {

        String str = "www.oracle.com";

        int max = str.length();
        int count = 1;
        int i = 1;
while(i < max) {
    if (str.charAt(i) != 'w' ) {
        i++;
        continue;
    }
    count++;
    i++;
}
        System.out.println("Counting w : " + count );
    }
}
    

