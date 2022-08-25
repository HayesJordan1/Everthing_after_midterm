public class cell {
    public static String cellName;
    public static boolean open;
    public static int securityCode;

    public cell(String cellName, boolean open, int securityCode){
        this.cellName = cellName;
        this.open = open;
        this.securityCode = securityCode;
    }
    public static String getCellName(){
        return cellName;
    }
    public static boolean getOpen(){
        return open;
    }
    public static void openDoor(int securityCode){
        if(securityCode == cell.securityCode && open == false){
            open = true;
            System.out.println("The door is now opened");
        } else if (securityCode == cell.securityCode && open == true) {
            open = false;
            System.out.println("The door is now closed");
        } else{
            System.out.println("Invalid code");
        }

    }
}
