
/**
 * Exploring the String class and its methods.
 *
 * @author mrcallaghan
 * @version 01sept2026
 */
public class StringExplorer
{
    public static void main(String[] args)
    {
        /*
         * Strings are objects that represent a sequence of characters.
         *      Surround a string with double quotes, just like in Python.
         *      Unlike in Python:
         *          - single quotes are reserved char primitive type
         *          - no triple-quoted strings
         *          - no formatted strings (e.g., f-string)
         */
        String river = new String("Mississippi");
        System.out.println(river);
        
        /*
         * Since Strings are so common, a shortcut way to construct them exists called a String literal.
         *      This is how we did it in Python.
         */
        String river2 = "Nile";
        System.out.println(river2);
        
        /*
         * Concatentation joins Strings and other types together using the "+".  No spaces will be inserted.
         *          Strings can be concatenated with other types of things (e.g., ints) and type
         *          conversion occurs.
         */
        String river3 = river + river2 + 7;
        System.out.println(river3);
        
        /*
         * The replace method returns a new reference to a new String object.  It doesn't change the existing String.
         *      The String class has no mutator methods.  It is not mutable, it is immutable.
         */
        river.replace("i", "x");
        System.out.println(river);
        
        String riverX = river.replace("i", "x");
        System.out.println(riverX);
        
        /*
         * To look up documentation in Java, google "javadoc" followed by the Class you are resrearching.
         * 
         *      e.g., "javadoc String" will pull up the documentation for the String class.
         */
        
            
        
        
        
        
        
        
        
    }
}
