/*
 * Every Java program contains one or more classes (e.g., Chapter1).
 * 
 * In general, every source file (e.g., Chapter1.java) contains one class (e.g., Chapter1).
 * 
 * The source file name and the class name MUST match!
 * 
 * By convention, class names start with an uppercase letter.
 */

public class Chapter1
{
    /*
     * A class contains methods.
     * 
     * Most Java programs contain a class with a main method.
     * 
     * The main method is executed when the program starts.
     */
    public static void hello(String[] args77)
    {
        /*
         * A method contains statements.
         * 
         * Statements may invoke other methods (e.g., println() )
         * 
         * In general, methods are invoked on objects.
         * 
         * When invoking a method, arguments are passed in parentheses.
         */
        System.out.println("Hello, world.");
        
        /*
         * A statement contains identifiers.
         * 
         * Identifiers may have any combination of:
         *      letters 
         *      digits (but not the first character)
         *      underscores
         *      dollar sign
         *      
         *      These are all valid:
         */
        int y, z2, X_Y, total$;
        //int 2y;
        
        /*
         * Identifiers are case sensitive (case matters)
         * These are all valid:
         */
        String crush, CRUSH, CruSH;
        
        /*
         * By convention, constants are all uppercase with an underscore to separate words.
         */
        int SPEED_OF_LIGHT = 300000000; //m/s
        
        /*
         * By convention, all other identifiers use camalcase (starts with a lowercase letter, and all 
         *      subsequent words are capitalized)
         */
        String pacificOcean;
        
        /*
         * This is a compile-time error (This code doesn't compile).
         * 
         * These are also called syntax errors.
         */
        //System.out.pritln("Hello, world.");
        
        /*
         * This is a run-time error. This code compiles and runs, but generates an exception.
         * Usually the program crashes.
         */
        //System.out.println(1/0);
        
        /*
         * This is a run-time error. This code compiles and runs, but we dont' get the intended result.
         * 
         * More specifically, this is a logical error.
         */
        
        System.out.println("Hello, word.");
        
        /*
         * Algorithm - a series of steps to solve a problem.  Must be:
         *  - unambiguous
         *  - executable
         *  - terminating
         *  
         *  Pseudocode - an informal representation of an algorithm (i.e., in English, flowchart).
         *  
         *      Useful for algorithm design before getting into the programming langugage specifics.
         */
        
    }
}







