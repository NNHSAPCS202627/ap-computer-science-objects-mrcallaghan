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
        Random generator = new Random();  // create Random object
        int num = generator.nextInt(6);     // 0 - 5
        num = num + 1;      // 1 - 6
        System.out.print(num);
        
        int num2 = generator.nextInt(1, 7);     // 1 - 6
        System.out.println(num2);
        
        
        
    }
}