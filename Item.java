
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item 
{
    // instance variables - replace the example below with your own
    private String name;
    private String description;
    private int weight;

    /**
     * Constructor for objects of class Item
     */
    public Item()
    {
        name = "";
        description = "";
        weight = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getWeight()
    {
        return weight;
    }
    
    
    public String getName()
    {
        return name;
    }
    
    public String getDescription()
    {
        return description;
    }
}
