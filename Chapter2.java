
/*
 * import statements are used to import classes from other packages (e.g., Color is in the java.awt package).
 */
import java.awt.Color;
/**
 * Write a description of class Chapter2 here.
 *
 * @author mrcallaghan
 * @version 25aug2026
 */
public class Chapter2
{
    public static void drawLine()
    {
        /*
         * Objects are entities in a program.
         *      Objects have attributes.
         *      Objects are manipulated by invoking methods.
         *      
         * Classes describe a collection of objects (like a template).
         * All objects of a class have the same behavior (methods)
         *  and they have the same types of attributes (but may have differing values).
         *  
         *  In the code below, World and Turtle are classes.  ocean and crush are variables referencing objects.
         */
        World ocean = new World();
        Turtle crush = new Turtle(ocean);
        
        /*
         * We use the new operator to construct an object.
         * 
         * The class of the object is specified immediately afer the new operator.
         * 
         * If we need to pass more information to construct an object, arguments can specified in the parentheses.
         */
        Turtle leo = new Turtle(ocean);
        
        /*
         * When invoking methods, we use dot operator (i.e., '.') to invoke a method on an object.
         * 
         * Some methods take no arguments, but we still need the parentheses.
         * 
         * Some methods require arguments to be passed into the parentheses.  Multiples arguments would be 
         *      separated by commas.
         *      
         * Mutator methods modify the state of an object.  (i.e, change the values of an objects attrubutes)
         *      e.g, forward, setPenCOlor, penDown
         */
        crush.penDown();
        crush.forward(50);
        crush.setPenColor(Color.RED);
        crush.forward(25);
        
        /*
         * Accessor methods return the value of an attribute. (like getter methods in Python)
         *      The state of the object does not change.
         * 
         * getPenWidth is an accessor.
         */
        int penWidth = crush.getPenWidth();
        System.out.println("The pen width is: " + penWidth);
        
        
        
        
        
        
        
    }
}