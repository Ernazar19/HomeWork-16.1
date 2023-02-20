public class Main {
    public static void main(String[] args) {
      Shapes[]sh={new Triangle(4,6),
                  new Circle(4),
                  new Rectangle(6,7),
                  new Square(7,4)};
        for (Shapes a:sh) {
          a.findArea();

        }
    }
}