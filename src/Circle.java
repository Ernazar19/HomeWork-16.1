public class Circle extends Shapes{
    private int  a ;

    public Circle(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    void findArea() {
        System.out.println(Math.PI*(a*a));
    }
}
