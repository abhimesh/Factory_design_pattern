public class Main {
    public static void main(String[] args) {
        Factory factory=new Factory();
        shape shape= factory.createshape("Rectangle");
        System.out.print(shape.calculateArea());
    }
}
