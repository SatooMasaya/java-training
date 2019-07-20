package section12.Q1201;

public abstract class TangibleAsset {
    protected String name;
    protected int price;
    protected String color;

    public TangibleAsset(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    abstract String getName();

    abstract int getPrice();

    abstract String getColor();

}