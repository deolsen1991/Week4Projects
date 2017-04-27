// Square.java
// Implements a square class that tells how to color a square through a interface.
// Modified by Dan Olsen
// 4/26/2017

public class Square implements Colorable {

    public static void main(String[] args) {
        Square sq = new Square(2);
        sq.howToColor();
    }
    
    private int side;
    
    public Square()
    {
        side = 0;
    }
    
    public Square(int numSides)
    {
        this.side = numSides;
    }
    
    public int getSide()
    {
        return side;
    }
    
    public void setSide(int side)
    {
        this.side = side;
    }
    
    @Override
    public void howToColor()
    {
        System.out.println("Color all four sides.");
    }
    
}

interface Colorable
{
    public abstract void howToColor();
}
