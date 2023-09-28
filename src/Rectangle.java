public class Rectangle implements shape{
    int a;
    int b;
    Rectangle(int a,int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public int calculateArea() {
        return a*b;
    }
}
