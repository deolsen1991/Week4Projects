import java.io.Serializable;

// Kitten.java
// Represents cute little kittens.

class Kitten implements Serializable {

    private String name;
    private String color;
    private double weight;
    private int age;
    private boolean litterTrained;
    
    public Kitten()
    {
        name = "";
        color = "";
        weight = 0.0;
        age = 0;
        litterTrained = false;
    }
    
    public Kitten(String name, String color, double weight, int age, boolean litterTrained)
    {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.age = age;
        this.litterTrained = litterTrained;
    }
    
    public String toString()
    {
        return "Kitten [" + name + "] Color=" + color + " Weight=" + weight +
                " Age=" + age + " LitterTrained=" + litterTrained;
    }
}