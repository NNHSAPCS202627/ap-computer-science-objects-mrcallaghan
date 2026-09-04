import java.util.Random;
/**
 * Write a description of class Random here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomSolo
{
    public static void main()
    {
        Random generator = new Random();  // object that generates the random numbers
        int die1 = generator.nextInt(6);  // 0 - 5
        
        die1 = die1 + 1;        // 1 - 6
        System.out.println(die1);
        
        int die2 = generator.nextInt(1, 7);  // 1 - 6
        System.out.println(die2);
        

        
    }
}