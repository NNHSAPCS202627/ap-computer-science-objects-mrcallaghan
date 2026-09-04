import java.util.Random;
/**
 * Write a description of class RandomSolo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomSolo
{
    public static void main()
    {
        Random generator = new Random();
        int die1 = generator.nextInt(6);  // 0 - 5
        die1 = die1 + 1;  // 1 - 6
        System.out.println(die1);
        
        int die2 = generator.nextInt(6) + 1;  // 1 - 6
        System.out.println("Die 1: " + die1 + " Die 2: " + die2);
        
    }
}