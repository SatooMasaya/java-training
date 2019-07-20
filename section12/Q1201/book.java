package section12.Q1201;

public class book extends TangibleAsset {

    private String isbn;

    public book(String name, int price, String color, String isbn) {
        super(name, price, color);
        this.isbn = isbn;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    public String getIsbn() {
        return this.isbn;
    }

}
