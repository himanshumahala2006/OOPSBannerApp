public class OopsBannerUC3 {
    public static void main(String[] args) {
        // We define the segments for each row
        // Using String.join("") instead of the + operator

        String row1 = String.join("", "  *** ", "  *** ", " **** ", "  **** ");
        String row2 = String.join("", " * * ", " * * ", " * * ", " * ");
        String row3 = String.join("", " * * ", " * * ", " **** ", "  *** ");
        String row4 = String.join("", " * * ", " * * ", " * ", "     * ");
        String row5 = String.join("", "  *** ", "  *** ", " * ", " **** ");

        // Print the assembled lines
        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
        System.out.println(row4);
        System.out.println(row5);
    }
}