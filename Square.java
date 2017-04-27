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
    
    //no argument constructor
    public Square()
    {
        side = 0;
    }
    
    //constructor to implement the number of sides
    public Square(int numSides)
    {
        this.side = numSides;
    }
    
    //accessor for the side variable
    public int getSide()
    {
        return side;
    }
    
    //mutator for the sides
    public void setSide(int side)
    {
        this.side = side;
    }
    
    //howToColor overridden from the interface
    @Override
    public void howToColor()
    {
        System.out.println("Color all four sides.");
    }
    
}

//interface class as required
interface Colorable
{
    public abstract void howToColor();
}
