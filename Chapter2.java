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
         * 
         *      Objects have attributes.
         *      Objects are manipulated by methods.
         *      
         *  Classes describe a collection of cobjects.  A class is like a template for creating software objects.
         *      ALl objects of a class have the same behavior (methods) and the same types of attribtues
         *      (but may have differing values for those attributes)
         *      
         *   World and Turtle are classes.
         *   ocean and crush are variables that reference objects.
         */
        World ocean = new World();
        Turtle crush = new Turtle(ocean);
        
        /*
         * We use 'new' operator to construct an object (i.e., create an object).
         * 
         * The class of the object is specified immediately after the new operator.
         * 
         * If we need to ass additional information to construct an object, we can do that in the parantheses. 
         *      (e.g., ocean).
         */
        Turtle leo = new Turtle(ocean);
        
        /*
         * When invoking methods, we use the dot operator to invoke a method on an object.
         * 
         * SOme methods take no arguments, but we still need parentheses.
         * 
         * Some methods take one or more arguments (e.g, forward).
         * 
         * Mutator methods modify the state of an obeject (e.g., the values of the attributes).
         *   forward and setPenCOlor are examples of mutator methods.
         */
        crush.penDown();
        crush.forward(25);
        crush.setPenColor(Color.RED);
        
        /*
         * Accessor methods return the values of an attribtue of the object.  The state of the object doesn't change.
         * 
         * getPenWidth is an accessor method.
         */
        
        int penWidth = crush.getPenWidth();
        System.out.println("Pen width is " + penWidth); 
        
        /*
         * Variables store values to be used later.
         *      Variables have a type (e.g., int, Turtle, etc.)
         *                      a name (e.g., width, crush, etc.)
         *                      and a value (e.g., 20, 3.3, a turtle object reference, etc.)
         */
        int width;      // decalaring a variable
        width = 20;     // assigning a value in the variable
        
        
        System.out.println(width);
        
        int xPosition = 50;  // declaring and assigning a value to a variable in one line
        
        /*
         * Java has several primitive data types:
         *      int hold an integer value
         *      boolean holds a value true or false
         *      double holds a real number (floating point, decimal)
         *      char holds a single character
         */
        
        // here are all the boolean values
        boolean isSummer = true;
        boolean isWinter = false;
        
        // here is a double
        double salesTaxRate = 0.0775;
        
        // here is a char
        char letter = 'c';
        
        
        
        
        
        
        
    }
}