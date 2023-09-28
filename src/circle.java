public class circle implements shape{
    int a;
    circle(int a)
    {this.a=a;}
    @Override
    public int calculateArea() {
        return (int)3.14*a*a;
    }
}
