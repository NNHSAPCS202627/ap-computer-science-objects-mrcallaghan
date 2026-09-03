import java.awt.Rectangle;
/**
 * Write a description of class Warmups here.
 *
 * @author mrcallaghan
 * @version 03sept2026
 */
public class Warmups
{
    public static void warmup1()
    {
        World myWorld = new World();
        Turtle pumpkin = new Turtle(myWorld);
        pumpkin.forward(25);

    }

    public static void warmup2()
    {
        String city = new String("Naperville");
        //String city = “Naperville”;  // literal
        String bigCity = city.toUpperCase();
        System.out.println(city + " / " + bigCity);

    }

    public static void warmup3()
    {
        Rectangle r1 = new Rectangle(10, 20, 50, 100);
        Rectangle r2 = new Rectangle(50, 100, 30, 20);
        boolean doesIntersect = r1.intersects(r2);
        System.out.print(doesIntersect);

    }
    
    
    
    
    
    
    
    
    
    
}