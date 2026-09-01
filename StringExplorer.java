
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
         * String are objects that represent a sequence of characters.
         *      Surround a string with double quotes, similar to Python.
         *      Unlike in Python:
         *          - cannot use single-quotes (reservered for char type)
         *          - no triple-quoted string
         *          - no formatted strings (no fstrings)
         */
        
        String river = new String("Mississippi");
        System.out.println(river);
        
        /*
         * Since Strings are so common there is a shorthand way to construct them called a "string literal".
         *      This is the same as in Python.
         */
        String river2 = "Nile";
        System.out.println(river2);
        
        
        /*
         * CONCATENATION joins Strings together and other types of things using the "+".  No spaces get added!
         *      For example, String can added to other Strings or other types of things, like ints.
         */
        String river3 = river + river2 + 7;
        System.out.println(river3);
        
        /*
         * Strings are not normal objects.  They have no mutator methods -- they are IMMUTABLE.
         *      A String cannot be changed once it's created; instead, the replace method return a new String reference to 
         *      a new String object.
         */
        river.replace("i", "x");
        System.out.println(river);
        
        String riverX = river.replace("i", "x");
        System.out.println(riverX);
        
        /*
         *  For methods not on the quick reference, google "javadoc" followed by the class you are researching.  This
         *      should pull up the appropriate javadoc documentation.
         */
        
        
        
        
        
        
    }
}
