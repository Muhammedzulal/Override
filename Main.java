package Override;

public class Main {
    public static void main(String[] args) {
        Shape a = new Shape();
        Rectangle b = new Rectangle();
        Circle c = new Circle();

        a.draw();
        System.out.println("-----------------");
        b.draw();
        System.out.println("-----------------");
        c.draw();
    }
}
