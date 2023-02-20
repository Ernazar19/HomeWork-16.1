public class Square extends Shapes{
    private int l;
    private int v;

    public Square(int l, int v) {
        this.l = l;
        this.v = v;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    @Override
    void findArea() {
        System.out.println((l*v)*2);
    }
}
