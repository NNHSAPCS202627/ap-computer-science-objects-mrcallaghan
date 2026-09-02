
/**
 * Write a description of class Warmups here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
}