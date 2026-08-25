/*
 * import statments are used to import classes from other packages (e.g., Color is in the java.awt package).
 */
import java.awt.Color;
/**
 * Using objects in Java.
 *
 * @author mrcallaghan
 * @version 25aug2026
 */
public class Chapter2
{
    public static void drawLine()
    {
        
        /*
         * Objects are entities in our program.
         *      Objects have attributes and manipulated by methods.
         *      
         * Classes describe a collection of objects.
         *      All objects from a class have the same behavior (methods)
         *      and the same types of attributes (although they may have differing values).
         *      
         * World and Turtle are classes.
         */
        World ocean = new World();
        
        /*
         * We use the new operator to construct an object.
         * 
         * The class of the object is specified after the new operator. (e.g., Turtle)
         * 
         * If we need to pass more information into the class to construct the object,
         *      arguments can specified inside the parentheses.
         */
        Turtle crush = new Turtle(ocean);
        
        Turtle leo = new Turtle(ocean);
        
        /*
         * When invoking methods, we use the dot operator to invoke a method on an object.
         * 
         * Some methods require arguements, while other don't.  We need the parentheses regardless.
         *      If you need more than 1 argument, commas can be used to separate arguments.
         *      
         * 2 broad types of mehtods: mutator methods and accssor methods.
         * 
         * Mutator methods modify the state of object. e.g., move the turtle forward, change the pen color.
         * 
         * e.g., forward, penDown, setPenColor are mutator methods
         */
        crush.penDown();
        crush.forward(100);
        crush.setPenColor(Color.RED);
        crush.forward(50);
        
        /*
         * Accessor methods simply get some information about the object.
         * 
         * e.g., getPenWidth
         */
        
        int penWidth = crush.getPenWidth();
        System.out.println("The pen width is: " + penWidth);
        
        
        
        
        
        
        
        
        
    }
}