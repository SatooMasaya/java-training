package section13.Q1303;

public class Main1303 {

    public static void main(String[] args) {
        Y[] yArray = { new A(), new B() };

        for (Y y : yArray) {
            y.b();
        }

    }

}
