
/*
 * Every Java program contains one or more classes (e.g., Chapter1).
 * 
 * In general, every source file (e.g., Chapter1.java) conatins one class (e.g., Chapter1).
 * 
 * The source file name must match the class name.
 * 
 * By convention, class names start with an uppercase letter.
 */

public class Chapter1
{
   /*
    * A class contains methods.
    * 
    * Most Java programs contain a class mith a main method.
    * 
    * The main method is executed when the program starts.
    */
    public static void main(String[] args)
    {
        /*
         * A method contains statements.
         * 
         * Statements may invoke  other methods (e.g., println).
         * 
         * In general, methods are invoked on objects.
         * 
         * When invoking a method, arguments are passed in parentheses (e.g., "Hello, world.")
         */
        System.out.println("Hello, world.");
        
        /*
         * A statement contains identifiers.
         * 
         * Identifiers may have any combination of:
         *      letters
         *      digits (but not as the first character)
         *      underscores
         *      dollar signs
         *      
         * These are valid identifiers:
         */
        int y, x2, X_Y, total$;
        
        // this is a single-line comment (like # in python)
        // this is not a valid identifier
        //int 2y;
        
        /*
         * Identifeirs are case sensitive (case matters)
         * 
         * These are different:
         */
        String squirt, SQuiRT, SQUIRT;
        
        /*
         * By convention, constants are all uppercase with an underscore to separate words.
         * 
         */
        int SPEED_OF_LIGHT = 300000000; // m/s
        
        
        
    }
}









