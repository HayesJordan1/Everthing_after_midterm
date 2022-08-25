public class prizes {
    private String Name;
    private int Cost;
    private int Stock;

    public prizes(String Name, int Cost, int Stock){
        setCost(Cost);
        setName(Name);
        setStock(Stock);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCost() {
        return Cost;
    }

    public void setCost(int cost) {
        Cost = cost;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }
}
