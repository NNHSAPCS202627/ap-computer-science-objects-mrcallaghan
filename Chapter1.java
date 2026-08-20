/*
 * Every Java program has at least on class (e.g., Chapter1).
 * 
 * In general, every source file (e.g., Chapter.java) contains one class (e.g., Chapter1).
 * 
 * The source file name must match the class name.
 * 
 * By convention, all calss names start with a uppercase letter.
 */
public class Chapter1
{
    /*
     * A call contains methods.
     * 
     * Most Java programs will have a main method (see below).
     * 
     * In general, methods are invoked on objects.
     * 
     * WHen invoking a method, arguments are passed in parentheses (e.g., "Hello, world.")
     */
    public static void main(String[] args)
    {
        /*
         * A method contains statments.
         * 
         * Statments may invoke other methods (e.g., println).
         * 
         * In Java, a stament ends with a semicolon.
         */
        System.out.println("Hello, world.");
        
        /*
         * A statment contains identifiers.
         * 
         * Identfiers may have a combination of:
         *      - letters
         *      - numbers (as long as it's not the first character
         *      - underscores (usually only for constants)
         *      - dollar signs (rare)
         *      
         *      These are valid:
         */
        
        int xyz, f2, X_Y, total$;
        
        // this is invalid:
        //int 4z;
        
        /*
         * Identifiers are case sensitive.
         * 
         * These are different:
         */
        String crush, CRUSH, CrusH;
        
        /*
         * By convention, constant are all uppercase.  Use an underscore to separate words.
         */
        int SPEED_OF_LIGHT = 300000000;  //m/s
        
        /*
         * By convention, most other identifiers use camalcase.  Words start lowercase and subsequent words are capitalized.
         */
        String pacificOcean;
        
        /*
         * This is a compile-time error.  
         * 
         * Often called syntax errors.
         */
        //System.out.pitln("Hello, world.");
        
        /*
         * This is a run-time error.
         * 
         * Code compiles and runs, but an exception is generated.  In most cases the program crashes.
         * 
         * This is an exception.
         */
        //System.out.println(1/0);
        
        /*
         * This is also a run-time error.  The code compiles and runs and no error message occurs, however
         *      the program doesn't behave as intended.
         *      
         *      More specifically, this is a logical error.
         */
        System.out.println("Hello, word.");
        
        /*
         * Algorithm - a series of instructions or step to solve a problem.  Must be:
         *      - unambiguous
         *      - executable
         *      - terminating
         * 
         */
        
    }
}





