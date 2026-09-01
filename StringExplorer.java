
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
         *          - single quotes are reserved for char primitive type
         *          - no triple-quoted strings
         *          - no formatted strings, or f-strings
         */
        String river = new String("Mississippi");
        System.out.println(river);
        
        /*
         * Since String are so common, a shortcut way to construct them is provided called a String literal.
         *      This is the same as we did in Python.
         */
        String river2 = "Nile";
        System.out.println(river2);
        
        /*
         * Concatentation joins Strings and other types together using "+".  No spaces get added!
         *      Strings can be concatenated with other types of things (e.g., ints) and type conversion occurs.
         */

        String river3 = river + " and " + river2 + 7;
        System.out.println(river3);
        
        /*
         * The String class has no mutator methods.  It is immutable.  It's not possible to change a String
         *      object once created.
         *      
         *      The replace method returns a reference to a new String object.  It *does not* change the original string
         *          on which it is invoked.
         */
        
        river.replace("i", "x");
        System.out.println(river);
        
        
        String riverX = river.replace("i", "x");
        
        System.out.println(riverX);
        
        /*
         * To find other methods of the String class, google "javadoc String" to find the offical Javadoc documentation.
         * 
         * 
         */
        
        
        
        
        
    }
}
