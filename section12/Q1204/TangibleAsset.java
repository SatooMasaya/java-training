package section12.Q1204;

public abstract class TangibleAsset implements Thing {
    protected String name;
    protected int price;
    protected String color;

    protected double weight;

    public TangibleAsset(String name, int price, String color, double weight) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    abstract String getName();

    abstract int getPrice();

    abstract String getColor();

}