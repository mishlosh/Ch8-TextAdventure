import java.util.Set;
import java.util.HashMap;
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    // instance variables - replace the example below with your own
    private int weightLimit;
    private int burden;
    private HashMap<String, Item> inventory;

    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        // initialise instance variables
        weightLimit = 10;
        burden = 0;
        inventory = new HashMap<String, Item>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addItem(Item thing)
    {
        // put your code here
        inventory.put(thing.getName(), thing);
        burden += thing.getWeight();
    }
    
    public Item dropItem(String thing)
    {
        burden -= inventory.get(thing).getWeight();
        return inventory.remove(thing);
    }
}
