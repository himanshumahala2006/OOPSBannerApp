/**
 * UC3: Creates an OOPS banner using String.join() method for concatenation
 * 
 * This program demonstrates the use of String.join() as an alternative to
 * string concatenation using the + operator. It builds a banner by joining
 * individual string segments together.
 */
public class OopsBannerUC3 {
    public static void main(String[] args) {
        // Build the first row of the banner using String.join() to concatenate segments
        String row1 = String.join("", "  *** ", "  *** ", " **** ", "  **** ");
        // Build the second row using the join method instead of the concatenation operator
        String row2 = String.join("", " * * ", " * * ", " * * ", " * ");
        // Build the third row combining multiple segments into a single string
        String row3 = String.join("", " * * ", " * * ", " **** ", "  *** ");
        // Build the fourth row with the appropriate character segments
        String row4 = String.join("", " * * ", " * * ", " * ", "     * ");
        // Build the final row to complete the banner design
        String row5 = String.join("", "  *** ", "  *** ", " * ", " **** ");

        // Print all assembled banner rows to display the complete OOPS banner
        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
        System.out.println(row4);
        System.out.println(row5);
    }
}
