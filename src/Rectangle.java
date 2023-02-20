public class Rectangle extends Shapes{
    private int b;
    private int s;

    public Rectangle(int b, int s) {
        this.b = b;
        this.s = s;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    @Override
    void findArea() {
        System.out.println((b*s)*2);
    }
}
