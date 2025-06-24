package Module_2.Q1;

public enum House{
    SMALL(1000),
    MEDIUM(10000),
    LARGE(100000);

    private final int price;

    House(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

}