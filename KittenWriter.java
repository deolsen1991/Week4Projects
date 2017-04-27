// SquareRooter.java
// Implements a KittenWritter class that writes kittens to a file and reads them
// Modified by Dan Olsen
// 4/26/2017


import java.io.*;
import java.util.Date;

public class KittenWriter
{
   public static void main(String[] arg)
   {
      //initializes the kittens and the filename
      final String FILENAME = "kittens.dat";
      Kitten snowball = new Kitten("Snowball", "White", 6.0, 7, false);
      Kitten fluffy = new Kitten("Fluffy", "Calico", 5.75, 4, true);
      Kitten snuffles = new Kitten("Mr. Snuffles", "Black", 3.5, 5, true);
      
      //as required for output
      System.out.println("Writing data...");
      
      //writing kittens to the file
      try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(FILENAME)))
      {
         output.writeObject(snowball);
         output.writeObject(fluffy);
         output.writeObject(snuffles);
         System.out.println("wrote 3 kittens!");
      }
      
      //required catch statement
      catch(IOException e)
      {
         System.out.println("IOException");
         e.printStackTrace();
      }
      
      //reading in the kittens
      try(ObjectInputStream input = new ObjectInputStream(new FileInputStream(FILENAME)))
      {
         System.out.println("Reading data...");
         
         //creates 3 new kittens for the intputted kittens
         Kitten snowballToRead = (Kitten)input.readObject();
         Kitten fluffyToRead = (Kitten)input.readObject();
         Kitten snufflesToRead = (Kitten)input.readObject();
         
         //prints the 3 kittens using the toString() method.
         System.out.println("read 3 kittens!");
         System.out.println(snowballToRead.toString());
         System.out.println(fluffyToRead.toString());
         System.out.println(snufflesToRead.toString());
      }
      
      //required exception catching
      catch(IOException e)
      {
         System.out.println("IOException");
         e.printStackTrace();
      }
      
      catch(ClassNotFoundException e)
      {
         System.out.println("ClassNotFoundException");
         e.printStackTrace();
      }
      
   }

}