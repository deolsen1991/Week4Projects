// SquareRooter.java
// Implements a square rooter class that throws a custom exception.
// Modified by Dan Olsen
// 4/26/2017

public class SquareRooter {


    public static void main(String[] args) {
        try
        {
            System.out.println("calling sqrRoot with 4");
            System.out.println("sqr root of 4 is " + sqrRoot(4));
            System.out.println("calling sqrRoot with -1");
            System.out.println("sqr root of -1 is " + sqrRoot(-1));
        }
        
        catch (SquareRootArgumentException e)
        {
            e.printStackTrace();
        }
    }
    
    static double sqrRoot(double val) throws SquareRootArgumentException
    {
        //if else for if it should calculate the value or throw the exception
        if(val >= 0)
        {
            return Math.sqrt(val);
        }
        else
        {
            throw new SquareRootArgumentException("cannot calculate square root of negatives");
        }
    }
    
}

//the required square root exception class
class SquareRootArgumentException extends IllegalArgumentException
{
    SquareRootArgumentException(String msg)
    {
        super(msg);
    }
}