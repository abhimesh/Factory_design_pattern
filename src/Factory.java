public class Factory {
    public shape createshape(String shapeType)
    {
        if(shapeType.equals("circle"))
        {
            return new circle(10);
        }
        return new Rectangle(10,10);
    }
}
